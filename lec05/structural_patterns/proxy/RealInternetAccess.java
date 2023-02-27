package lecture.lec05.structural_patterns.proxy;


public class RealInternetAccess implements OfficeInternetAccess {
	
	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println(" \n Internet Access granted for employee: "+ employeeName);
	}

}
