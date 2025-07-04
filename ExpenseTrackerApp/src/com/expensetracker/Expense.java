package com.expensetracker;

public class Expense {
	private int id;
	private String title;
	private double amount;
	private String category;
	private String expenseDate; // Still use String for simplicity

	public Expense(String title, double amount, String category, String expenseDate) {
		this.title = title;
		this.amount = amount;
		this.category = category;
		this.expenseDate = expenseDate;
	}
	
	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}


	public String getTitle() {
		return title;
	}

	public double getAmount() {
		return amount;
	}

	public String getCategory() {
		return category;
	}

	public String getExpenseDate() {
		return expenseDate;
	}
}
