package lecture.lec05.behavioral_patterns.state;


public class StatePatternDemo {

	   Controller controller;
	   StatePatternDemo(String con) {
	      controller = new Controller();
		  //the following trigger should be made by the user
	      if(con.equalsIgnoreCase("management"))
		     controller.setManagementConnection();
	      if(con.equalsIgnoreCase("sales"))
		     controller.setSalesConnection();
	      if(con.equalsIgnoreCase("accounting"))
	             controller.setAccountingConnection();
	      controller.open();
	      controller.log();
	      controller.close();
	      controller.update();
	   }
	   
	   
	   public static void main(String args[]) {

		   new StatePatternDemo(args[0]);
		   
	   }
	   
	
	
	
}
