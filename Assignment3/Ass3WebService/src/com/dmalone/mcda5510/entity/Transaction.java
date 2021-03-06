package com.dmalone.mcda5510.entity;

import java.sql.Timestamp;

public class Transaction {

	// Class fields
	private int id;
	private String nameOnCard;
	private int cardNumber;
	private double unitPrice = 0;
	private int quantity = 0;
	private double totalPrice;
	private String expiryDate;
	private Timestamp createdOn;
	private String createdBy;
	
	// Constructor 1
	public Transaction () {
		this.id = 0;
		this.nameOnCard = null;
		this.cardNumber = 0;
		this.unitPrice = 0;
		this.quantity = 0;
		this.totalPrice = this.unitPrice * this.quantity;
		this.expiryDate = null;
		this.createdOn = null;
		this.createdBy = null;
	}
		
	// Constructor 2
	public Transaction (int id, String nameOnCard, int cardNumber, double unitPrice, int quantity,
					double totalPrice, String expiryDate, Timestamp createdOn, String createdBy) {
		this.id = id;
		this.nameOnCard = nameOnCard;
		this.cardNumber = cardNumber;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.totalPrice = this.unitPrice * this.quantity;
		this.expiryDate = expiryDate;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getNameOnCard() {
		return nameOnCard;
	}
	
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}	
	
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
		setTotalPrice();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		setTotalPrice();
	}
	
	public double getTotalPrice() {
		return (this.getQuantity() * this.getUnitPrice());
	}

	public void setTotalPrice() {
		this.totalPrice = (this.getQuantity() * this.getUnitPrice());
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString(){		
		String results = new String();
		results = "[ID: " + id + ", NameOnCard: " + nameOnCard +", CardNumber: " + cardNumber  
					+ ", ExpDate: " + expiryDate + ", UnitPrice: " + unitPrice + ", Quantity: " + quantity
					+ ", TotalPrice: " + totalPrice + ", CreatedOn: " + createdOn + ", CreatedBy: " + createdBy + "]";
		return results;
	}
}
