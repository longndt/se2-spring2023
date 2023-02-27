package lecture.lec05.creational_patterns.abstractfactory;

abstract class AbstractFactory{  
	  public abstract Bank getBank(String bank);  
	  public abstract Loan getLoan(String loan);  
	}  
