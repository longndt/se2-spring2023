package lecture.lec05.structural_patterns.composite;

public class CompositePatternDemo {
	
	public static void main(String args[])
	
	{
		
		 Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);
		 
		 Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);
		 
		 Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0); 
		 
		 Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);
		 Employee manager2 = new BankManager(105, "David", 2000000);

		 //1 manager can manage 1 or many employee (cashier or account)
		  manager1.add(emp1);
		  manager1.add(emp2);
		  manager1.add(emp3);

		  manager2.add(emp1);
		 
		  manager1.print();
		  manager2.print();
                                      
	      }

}
