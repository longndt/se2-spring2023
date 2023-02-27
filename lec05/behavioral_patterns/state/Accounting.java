package lecture.lec05.behavioral_patterns.state;


public class Accounting implements Connection {
	
	   @Override
	   public void open() {
	      System.out.println("open database for accounting");
	   }
	   @Override
	   public void close() {
	      System.out.println("close the database");
	   }
	   
	   @Override
	   public void log() {
	      System.out.println("log activities");
	   }
	   
	   @Override
	   public void update() {
		   System.out.println("Accounting has been updated");
	   }
	   

}
