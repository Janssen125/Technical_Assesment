package controller;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import model.ResponseWrapper;
import model.Status;
import model.Transaction;
import repository.Repository;

public class Controller {

	Gson gson = new Gson();

	private Repository repo = new Repository();
	
	public String getResponse() {
		try {
			List<Transaction> transactions =  repo.getAllTransaction();
			List<Status> status = Arrays.asList(
					new Status(0, "Success"),
					new Status(1, "Failed")
			);
			
			ResponseWrapper response = new ResponseWrapper(transactions, status);
			
			return gson.toJson(response);
		} catch (Exception e) {
			e.printStackTrace();
			return "{\"error\":\"Failed to fetch data\"}";
		}
	}
	
}
