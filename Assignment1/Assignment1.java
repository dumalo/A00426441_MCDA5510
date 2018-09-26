
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Assignment1 {
	
	// Walk through a directory structure, examine each CSV file for "valid" (complete) rows
	// class fields
	private int file_count;
	private int num_rows;
	private int num_good_rows;
	private static Logger logger;
	private static FileHandler fh;
	
	// constructor
	public Assignment1() {
		file_count = 0;
		num_rows = 0;
		num_good_rows = 0;
		logger = Logger.getLogger("Assignment_1");
		try {
			fh = new FileHandler("Assignment_1.log");
			logger.addHandler(fh);
			logger.setUseParentHandlers(false);
			SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);
		}
		catch (IOException e) {  
			e.printStackTrace();
		}
	}
	
	public void increaseFileCount(int n) {
		this.file_count = this.file_count + n;
	}
	
	public int getFileCount() {
		return this.file_count;
	}
	
	public void addNumRows(int r) {
		this.num_rows = this.num_rows + r;
	}
	
	public int getNumRows() {
		return this.num_rows;
	}
	
	public void addNumGoodRows(int r) {
		this.num_good_rows = this.num_good_rows + r;
	}
	
	public int getNumGoodRows() {
		return this.num_good_rows;
	}
	
	public void walk( String path ) {

		File root = new File( path );
        File[] list = root.listFiles();

        if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                walk( f.getAbsolutePath() );
            }
            else {
                increaseFileCount(1);
            	parseCSV( f.getAbsoluteFile() );
            }
        }
    }

	public void parseCSV( File f ) {
		Reader in;
		int rowNum = 0;
		int num_good = 0;
		try {
			in = new FileReader(f);
			Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().withSkipHeaderRecord().parse(in);
			boolean rowGood = true;
			for (CSVRecord record : records) {
				for (int i=0; i<record.size(); i++) {
					if (!record.get(i).isEmpty()) {
			    		rowGood = true;
			    	}
			    	else {
			    		rowGood = false;
			    		break;
			    	}
				}
				rowNum++;
				if (rowGood) {
					num_good++;
				}
//				else {
//					logger.info("Missing data in record: "+ record.getRecordNumber());
//				}
			}
			logger.info("\n"+f.getAbsoluteFile()+"\nTotal rows= "+rowNum+"\nValid rows= "+num_good+"\n");
		} catch ( IOException e) {
			e.printStackTrace();
		}
		addNumRows(rowNum);
		addNumGoodRows(num_good);
	}
	
	public static void main(String[] args) {
		System.out.println("Started...");
		final long startTime = System.currentTimeMillis();
		Assignment1 fw = new Assignment1();
        fw.walk("/home/student_2018_winter/d_malone/MsCDA_5510/data" );
        final long endTime = System.currentTimeMillis();
        logger.info("\nTotal execution time: " + (endTime - startTime) +" ms" + "\n" +
                    "Files read : " + fw.getFileCount() + "\n" +
        			"Number of records read: "+ fw.getNumRows() + "\n" +
        			"Number of valid records: "+ fw.getNumGoodRows() + "\n" +
                    "Number of records with missing data: "+ (fw.getNumRows()-fw.getNumGoodRows()));
        System.out.println("Total execution time: " + (endTime - startTime) +" ms");
	}

}
