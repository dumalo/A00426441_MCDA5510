import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

public class MyLog {

	// Fields
	private static Logger logger;
	private static FileHandler fh;
	
	public Logger setupLogger(String logName) {
		
		logger = Logger.getLogger(logName);
		logger.setLevel(Level.FINER);
		try {
			fh = new FileHandler(logName+".log");
			SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);
	        logger.addHandler(fh);
			logger.setUseParentHandlers(false);  // Sets whether to also print log output to the console
		}
		catch (IOException e) {  
			e.printStackTrace();
		}
		return logger;
	}
	
}
