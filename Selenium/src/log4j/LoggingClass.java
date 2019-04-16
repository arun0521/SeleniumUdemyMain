package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingClass {
	
	public static Logger log = LogManager.getLogger(LoggingClass.class.getName());
	public static void main(String[] args) {
		log.debug("This is debug message");
		log.error("This is error log");
		
	}

}
