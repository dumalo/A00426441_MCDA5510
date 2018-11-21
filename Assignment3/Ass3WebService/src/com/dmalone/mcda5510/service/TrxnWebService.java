package com.dmalone.mcda5510.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import com.dmalone.mcda5510.connect.MySQLJDBCConnection;
import com.dmalone.mcda5510.dao.MySQLAccess;
import com.dmalone.mcda5510.entity.Transaction;

public class TrxnWebService {
	
	public static Connection connection;
	public static MySQLAccess dao;
	
	public TrxnWebService(){
		dao = new MySQLAccess();
		connection = dao.getInstance();
	}

	
	public void updateTransaction(int trxnID, String Name, String CardNumber,
			 double unitPrice, int qty, double totalPrice, String expDate){
		
	}
		
	public Transaction getTransaction(int trxnID) throws SQLException{

		Collection<Transaction> result = new ArrayList<Transaction>();
		Transaction trxn = new Transaction();
		try {
        	result = dao.getTransaction(connection, trxnID);
        	if (result != null && result.size()==1) {
    			trxn = ((ArrayList<Transaction>) result).get(0);
    			return trxn;
    		}
    		else {
    			return trxn;
    		}
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return trxn;
		
	}
	
	public Float addFloat (Float f){
		return f+10;
	}
	
}