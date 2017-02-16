/**
 * Created by mac on 23/01/2017.
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.CsvListReader;
import org.supercsv.io.CsvListWriter;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.io.ICsvListReader;
import org.supercsv.io.ICsvListWriter;
import org.supercsv.prefs.CsvPreference;


public class superCSVTesting {
   private static final String CSV_FILENAME_OSX = "/Users/mac/Downloads/writeWithCsvBeanWriter.csv";
   private static final String CSV_FILENAME_WINDOWS = "C:\\Users\\I336852\\Downloads\\writeWithCsvBeanWriter.csv";
    
   private static CellProcessor[] getProcessors(){
	   //test
	   final CellProcessor[] processors = new CellProcessor[] {
			   new NotNull(),
			   new UniqueHashCode(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull(),
	           new NotNull()
	    };
	   
	   return processors;
   }
    
    private static void writeWithCsvBeanWriter(int number) throws Exception {
    	
//    	List<CustomerBean> customers = Arrays.asList(john);
//    	System.out.println(customers.size());
//    	CustomerBean john = new CustomerBean ("1","john1");
//      CustomerBean john2 = new CustomerBean ("2","john2");
//    	customers.add(john);
//    	customers.add(john2);
    	
    	List<CustomerBean> customers = new ArrayList<CustomerBean>();    	
    	for ( int i = 0 ; i < number ; i ++) {
    		String no = Integer.toString(i);
    		CustomerBean user = new CustomerBean("active","1705SuperCSV"+no,"1705SuperCSV"+no
    				,"1705xiaofeng","ge","mi","F","xiaofeng.ge@sap.com","NO_MANAGER","NO_HR"
    				,"dep01","job01","DI01","LO01","US/Alaska","2017-01-01","empid01","title01"
    				,"phone01","fax01","addr1","addr2","NY","NY","123456","USA","review","2017-01-01"
    				,"CF1_001","CF2_001","CF3_001","CF4_001","CF5_001","CF6_001","CF7_001","CF8_001"
    				,"CF9_001","CF10_001","CF11_001","CF12_001","CF13_001","CF14_001","CF15_001"
    				,"NO_MANAGER","en_US","xf_admin","NO_MANAGER","NO_MANAGER");
    		customers.add(user);
    	}
   
    	
    	
    	
    	ICsvBeanWriter beanWriter = null;
    	try {
    		beanWriter = new CsvBeanWriter(
    				new FileWriter(CSV_FILENAME_WINDOWS)
    				,CsvPreference.STANDARD_PREFERENCE);
    		final String[] header = new String[]{"STATUS","USERID","USERNAME","FIRSTNAME","LASTNAME"
    				,"MI","GENDER","EMAIL","MANAGER","HR","DEPARTMENT","JOBCODE","DIVISION"
    				,"LOCATION","TIMEZONE","HIREDATE","EMPID","TITLE","BIZ_PHONE","FAX","ADDR1"
    				,"ADDR2","CITY","STATE","ZIP","COUNTRY","REVIEW_FREQ","LAST_REVIEW_DATE"
    				,"CUSTOM01","CUSTOM02","CUSTOM03","CUSTOM04","CUSTOM05","CUSTOM06","CUSTOM07"
    				,"CUSTOM08","CUSTOM09","CUSTOM10","CUSTOM11","CUSTOM12","CUSTOM13","CUSTOM14"
    				,"CUSTOM15","MATRIX_MANAGER","DEFAULT_LOCALE","PROXY","CUSTOM_MANAGER","SECOND_MANAGER"};
    		final String[] headername = new String[] {"STATUS","USERID","Username","First Name","Last Name" 
    		,"Middle Name","Gender","Email","Manager","Human Resource","Department","Job Code","Division"
    		,"Location","Time Zone","Hire Date","Employee Id","Title","Business Phone","Business Fax"
    		,"Address 1","Address 2","City","State","ZIP","Country","Review Frequency","Last Review Date"
    		,"Customizable Field 1","Customizable Field 2","Customizable Field 3","Customizable Field 4"
    		,"Customizable Field 5","Customizable Field 6","Customizable Field 7","Customizable Field 8"
    		,"Customizable Field 9","Customizable Field 10","Customizable Field 11","Customizable Field 12"
    		,"Customizable Field 13","Customizable Field 14","Customizable Field 15","Matrix Manager"
    		,"Default Locale","Proxy","Custom Manager","Second Manager"};
    		final CellProcessor[] processors = getProcessors();
    	
    		beanWriter.writeHeader(header);
    		beanWriter.writeHeader(headername);
    		
    		final String[] headerLowercase = new String[]{"status", "userid", "username", "firstname"
    				, "lastname", "mi", "gender", "email", "manager", "hr", "department", "jobcode"
    				, "division", "location", "timezone", "hiredate", "empid", "title", "biz_phone"
    				, "fax", "addr1", "addr2", "city", "state", "zip", "country", "review_freq"
    				, "last_review_date", "custom01", "custom02", "custom03", "custom04", "custom05"
    				, "custom06", "custom07", "custom08", "custom09", "custom10", "custom11"
    				, "custom12", "custom13", "custom14", "custom15", "matrix_manager"
    				, "default_locale", "proxy", "custom_manager", "second_manager"};
    		
    		for (final CustomerBean customer : customers) {
    			beanWriter.write(customer, headerLowercase, processors);
    		}
    	}
    	finally {
    		if(beanWriter != null){
    			beanWriter.close();
    		}
    	}
    	
    }
    
private static void writeWithCsvBeanWriterWithBean(List<CustomerBean> customersList) throws Exception {
    	
    	ICsvBeanWriter beanWriter = null;
    	try {
    		beanWriter = new CsvBeanWriter(
    				new FileWriter(CSV_FILENAME_WINDOWS)
    				,CsvPreference.STANDARD_PREFERENCE);
    		final String[] header = new String[]{"STATUS","USERID","USERNAME","FIRSTNAME","LASTNAME"
    				,"MI","GENDER","EMAIL","MANAGER","HR","DEPARTMENT","JOBCODE","DIVISION"
    				,"LOCATION","TIMEZONE","HIREDATE","EMPID","TITLE","BIZ_PHONE","FAX","ADDR1"
    				,"ADDR2","CITY","STATE","ZIP","COUNTRY","REVIEW_FREQ","LAST_REVIEW_DATE"
    				,"CUSTOM01","CUSTOM02","CUSTOM03","CUSTOM04","CUSTOM05","CUSTOM06","CUSTOM07"
    				,"CUSTOM08","CUSTOM09","CUSTOM10","CUSTOM11","CUSTOM12","CUSTOM13","CUSTOM14"
    				,"CUSTOM15","MATRIX_MANAGER","DEFAULT_LOCALE","PROXY","CUSTOM_MANAGER","SECOND_MANAGER"};
    		final String[] headername = new String[] {"STATUS","USERID","Username","First Name","Last Name" 
    		,"Middle Name","Gender","Email","Manager","Human Resource","Department","Job Code","Division"
    		,"Location","Time Zone","Hire Date","Employee Id","Title","Business Phone","Business Fax"
    		,"Address 1","Address 2","City","State","ZIP","Country","Review Frequency","Last Review Date"
    		,"Customizable Field 1","Customizable Field 2","Customizable Field 3","Customizable Field 4"
    		,"Customizable Field 5","Customizable Field 6","Customizable Field 7","Customizable Field 8"
    		,"Customizable Field 9","Customizable Field 10","Customizable Field 11","Customizable Field 12"
    		,"Customizable Field 13","Customizable Field 14","Customizable Field 15","Matrix Manager"
    		,"Default Locale","Proxy","Custom Manager","Second Manager"};
    		final CellProcessor[] processors = getProcessors();
    	
    		beanWriter.writeHeader(header);
    	//	beanWriter.writeHeader(headername);
    		
    		final String[] headerLowercase = new String[]{"status", "userid", "username", "firstname"
    				, "lastname", "mi", "gender", "email", "manager", "hr", "department", "jobcode"
    				, "division", "location", "timezone", "hiredate", "empid", "title", "biz_phone"
    				, "fax", "addr1", "addr2", "city", "state", "zip", "country", "review_freq"
    				, "last_review_date", "custom01", "custom02", "custom03", "custom04", "custom05"
    				, "custom06", "custom07", "custom08", "custom09", "custom10", "custom11"
    				, "custom12", "custom13", "custom14", "custom15", "matrix_manager"
    				, "default_locale", "proxy", "custom_manager", "second_manager"};
    		
    		for (final CustomerBean customer : customersList) {
    			beanWriter.write(customer, headerLowercase, processors);
    		}
    	}
    	finally {
    		if(beanWriter != null){
    			beanWriter.close();
    		}
    	}
    	
    }
    
    
    private static void readWithCsvBeanReader() throws Exception {
    	
    	ICsvBeanReader beanReader = null;
    	try {
    		beanReader = new CsvBeanReader(new FileReader(CSV_FILENAME_WINDOWS)
    				,CsvPreference.STANDARD_PREFERENCE);
    		
    		final String[] header = beanReader.getHeader(false);
    		final CellProcessor [] processors = getProcessors();
    		
    		CustomerBean customer;
    		while(( customer = beanReader.read(CustomerBean.class, header, processors)) != null ) {
    			System.out.println(String.format("lineNo=%s, rowNo=%s, customer=%s"
    					, beanReader.getLineNumber(),beanReader.getRowNumber(),customer));
    				
    		}
    	}
    	finally {
    		if (beanReader != null ){
    			beanReader.close();
    		}
    	}
    }
    
    
private static void updateWithCsvBeanReader() throws Exception {
    	
    	ICsvBeanReader beanReader = null;
    	List<CustomerBean> customers = new ArrayList<CustomerBean>();
    	try {
    		beanReader = new CsvBeanReader(new FileReader(CSV_FILENAME_WINDOWS)
    				,CsvPreference.STANDARD_PREFERENCE);
    		
    		final String[] header = beanReader.getHeader(false);
    		final CellProcessor [] processors = getProcessors();
    		
    		CustomerBean customer;
    		 
    		while(( customer = beanReader.read(CustomerBean.class, header, processors)) != null ) {
    			if (beanReader.getRowNumber() == 5) {
    				String name = customer.getFirstname();
    				customer.setFirstname(name+"03");
    			}
    			customers.add(customer);		
    		}
  
        		
    	}
    	finally {
    		if (beanReader != null ){
    			beanReader.close();
    		}
    	}
    	
    	writeWithCsvBeanWriterWithBean(customers);
    
    }
    
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
    		listReader = new CsvListReader(new FileReader(CSV_FILENAME_WINDOWS),CsvPreference.STANDARD_PREFERENCE);
    		
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
//    	writeWithCsvListWriter();
//    	readWithCsvListReader();
    	

    	writeWithCsvBeanWriter(100000);
//    	readWithCsvBeanReader();
//    	System.out.println("=====================updated===============");
//    	updateWithCsvBeanReader();
//    	readWithCsvBeanReader();
    	

    	
    }
}
