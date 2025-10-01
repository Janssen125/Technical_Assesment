package model;

import java.util.List;

public class ResponseWrapper {

	private List<Transaction> data;
	private List<Status> status;

	public ResponseWrapper(List<Transaction> data, List<Status> status) {
		super();
		this.data = data;
		this.status = status;
	}

	public List<Transaction> getData() {
		return data;
	}

	public void setData(List<Transaction> data) {
		this.data = data;
	}

	public List<Status> getStatus() {
		return status;
	}

	public void setStatus(List<Status> status) {
		this.status = status;
	}

}
