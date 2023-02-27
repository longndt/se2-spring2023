package lecture.lec05.structural_patterns.bridge;


public class QuestionFormat extends QuestionManager {

	public QuestionFormat(String catalog){
		super(catalog);
		}

		public void displayAll() {

		System.out.println("\n--------------------------------------------------------------------");
		super.displayAll();
		System.out.println("-----------------------------------------------------------------------");
		}


	
}
