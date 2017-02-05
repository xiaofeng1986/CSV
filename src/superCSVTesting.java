/**
 * Created by mac on 23/01/2017.
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvListReader;
import org.supercsv.io.CsvListWriter;
import org.supercsv.io.ICsvListReader;
import org.supercsv.io.ICsvListWriter;
import org.supercsv.prefs.CsvPreference;


public class superCSVTesting {
   private static final String CSV_FILENAME = "/Users/mac/Downloads/writeWithCsvListWritet.csv";
    
   private static CellProcessor[] getProcessors(){
	   
	   final CellProcessor[] processors = new CellProcessor[] {
	            new UniqueHashCode(),//number
	            new NotNull()//name
	    };
	   
	   return processors;
   }
    
    
   
    
//    private static void writeWithCsvBeanWriter() throws Exception {
//    	final CustomerBean john = new CustomerBean ("1","John");
//    }
    
    private static void writeWithCsvListWriter() throws Exception {
    	final List<Object> john = Arrays.asList(new Object[]{"1","john"});
    	final List<Object> bob = Arrays.asList(new Object[]{"2","bob"});
    	
    	ICsvListWriter listWriter = null;
    	try {
    		listWriter = new CsvListWriter(new FileWriter("/Users/mac/Downloads/writeWithCsvListWritet.csv"),CsvPreference.STANDARD_PREFERENCE);
    		
    		final CellProcessor[] processors = getProcessors();
    		final String[] header = new String[] { "customerNo","name"};
    		
    		listWriter.writeHeader(header);
    		
    		listWriter.write(john,processors);
    		listWriter.write(bob, processors);
    	}
    	finally {
    		if(listWriter != null) {
    			listWriter.close();
    		}
    	}
    	
    }
    
    private static void readWithCsvListReader() throws Exception {
    	
    	ICsvListReader listReader = null;
    	try {
    		listReader = new CsvListReader(new FileReader(CSV_FILENAME),CsvPreference.STANDARD_PREFERENCE);
    		
    		listReader.getHeader(false);
    		final CellProcessor[] processors = getProcessors();
    		
    		List<Object> customerList;
    		while ((customerList = listReader.read(processors)) != null ) {
    			System.out.println(String.format("lineNo=%s, rowNo=%s, customerList=%s", listReader.getLineNumber(),
    					listReader.getRowNumber(),customerList));
    		}
    		
    	}
    	finally {
    		if (listReader != null) {
    			listReader.close();
    		}
    	}
    	
    }
    
    public static void main(String[] args) throws Exception {
    	//System.out.print("Hello world");
    	//test
    	writeWithCsvListWriter();
    	readWithCsvListReader();
    }
}
