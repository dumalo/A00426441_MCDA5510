package com.dmalone.mcda5510;

import java.rmi.RemoteException;
import java.util.Collection;

import com.dmalone.mcda5510.entity.Transaction;
import com.dmalone.mcda5510.service.TrxnWebServiceProxy;

public class TestClient {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		TrxnWebServiceProxy proxy = new TrxnWebServiceProxy();
        proxy.setEndpoint("http://localhost:8080/Ass3WebService/services/TrxnWebService");//defined in wsdl

        try {
        	Float f = proxy.addFloat(100);
        	System.out.println(f.toString());
			Transaction trxn = proxy.getTransaction(1);
			System.out.println("Name: "+trxn.getNameOnCard());
			System.out.println("This seemed to work?");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}