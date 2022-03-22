package demo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JDemo {
Logger logger = LogManager.getLogger("Mylogger");
	

@Test
public void testOne() {
	logger.trace("this is coming fron trace");
	logger.debug ("this is coming fron debug");
	logger.info("this is coming fron info");
	logger.warn("this is coming fron warn");
	logger.error("this is coming fron error");
	logger.fatal("this is coming fron fatal");
	
}
}
