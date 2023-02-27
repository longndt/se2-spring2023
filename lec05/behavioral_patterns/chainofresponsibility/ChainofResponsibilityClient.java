package lecture.lec05.behavioral_patterns.chainofresponsibility;


public class ChainofResponsibilityClient {
	
	private static Logger doChaining(){
		
		// Create the chaining
		
	      Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
	      
	      Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
	      consoleLogger.setNextLevelLogger(errorLogger);
	      
	      Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
	      errorLogger.setNextLevelLogger(debugLogger);
	      
	      return consoleLogger;	
	   }
	
	public static void main(String args[]){
		
		
		Logger chainLogger= doChaining();
		
		
		chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
		
		chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
		
		chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
		
		
		
		
	}
	
	
	

}
