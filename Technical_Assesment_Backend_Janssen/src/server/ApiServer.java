package server;

import com.sun.net.httpserver.HttpServer;

import controller.Controller;

import com.sun.net.httpserver.HttpHandler;

import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;

public class ApiServer {

	public ApiServer() {
		try {
			HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
			Controller controller = new Controller();

			server.createContext("/transactions", new HttpHandler() {
				@Override
				public void handle(HttpExchange exchange) {
					try {
						if ("GET".equals(exchange.getRequestMethod())) {
							String response = controller.getResponse();
							exchange.getResponseHeaders().add("Content-Type", "application/json");
							exchange.sendResponseHeaders(200, response.getBytes().length);

							OutputStream os = exchange.getResponseBody();
							os.write(response.getBytes());
						} else {
							String error = "{\"error\":\"Method not allowed\"}";
							exchange.sendResponseHeaders(405, error.getBytes().length);
							
							OutputStream os = exchange.getResponseBody();
							os.write(error.getBytes());
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
