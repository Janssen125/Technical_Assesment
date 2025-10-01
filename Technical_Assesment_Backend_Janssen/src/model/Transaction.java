package model;

//Transaction.java
public class Transaction {

	private int id;
	private String productID;
	private String productName;
	private String amount;
	private String customerName;
	private int status;
	private String transactionDate;
	private String createBy;
	private String createOn;

	public Transaction(int id, String productID, String productName, String amount, String customerName, int status,
			String transactionDate, String createBy, String createOn) {
		super();
		this.id = id;
		this.productID = productID;
		this.productName = productName;
		this.amount = amount;
		this.customerName = customerName;
		this.status = status;
		this.transactionDate = transactionDate;
		this.createBy = createBy;
		this.createOn = createOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateOn() {
		return createOn;
	}

	public void setCreateOn(String createOn) {
		this.createOn = createOn;
	}

}
