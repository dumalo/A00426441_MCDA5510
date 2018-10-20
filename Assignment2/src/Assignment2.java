import java.sql.Connection;
import java.sql.Timestamp;
import java.util.logging.Logger;

public class Assignment2 {
	
	public static void main(String[] args) {
        // setup logger
		MyLog myLog = new MyLog();
        Logger logger = myLog.setupLogger("Assignment2");
        // build a test Transaction
		Transaction transaction = createTestTransaction();
		// create a dao object
		MySQLAccess dao = new MySQLAccess();
		
        try {
        	Connection connection = dao.setupConnection();
        	// display contents of table
        	dao.getAllTransactions(connection);
        	// create the test Transaction in the database table
			dao.createTransaction(connection, transaction);
			// alter the test Transaction and then update in database
			transaction.setNameOnCard("Dave");
			dao.updateTransaction(connection, transaction);
			// retrieve the updated transaction
			dao.getTransaction(connection, 2);
			// attempt to create the test Transaction again
			dao.createTransaction(connection, transaction);
			// remove the test Transaction according to the ID value
			dao.removeTransaction(connection, 2);
			// now attempt again to create the test Transaction
			dao.createTransaction(connection, transaction);
			// finally print all contents of the table
			dao.getAllTransactions(connection);
			
			if (connection != null) {
				connection.close();
				logger.info("Connection closed.");
			}
			
		} catch (Exception e) { 
			e.printStackTrace();
			logger.throwing("", "", e);
		}
	}
	
	// build out a simple Transaction to insert
	public static Transaction createTestTransaction () {
		Transaction trxn = new Transaction();
		trxn.setId(2);
		trxn.setNameOnCard("Dave");
		trxn.setCardNumber(11);
		trxn.setExpiryDate("test date");
		trxn.setUnitPrice(5);
		trxn.setQuantity(10);
		// totalPrice is calculated in Transaction class
		// createdOn should be created in the database with 'now()'
		trxn.setCreatedOn(new Timestamp(118,10,16,11,00,00,0));
		trxn.setCreatedBy("Cashier123");
		return trxn;
	}

}
