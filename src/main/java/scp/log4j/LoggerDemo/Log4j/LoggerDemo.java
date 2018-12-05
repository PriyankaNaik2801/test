package scp.log4j.LoggerDemo.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import com.journaldev.log4j.logic.MathUtils;


public class LoggerDemo {
		
		static Logger logger = Logger.getLogger(LoggerDemo.class);
		
		public static void main(String[] args) {
			
			//logger.setlLevel(Level1.INFO);
			 logger.fatal("My fatal log");
			 logger.error("My error log");
			logger.warn("My Warn Log");
			logger.info("My Info Log");
		    logger.debug("My Debug Log");
			logger.trace("My trace Log");
			
			
			
		}

		private static void init() {
			// TODO Auto-generated method stub
			PropertyConfigurator.configure("Log4j.priperties");
			
		}
}