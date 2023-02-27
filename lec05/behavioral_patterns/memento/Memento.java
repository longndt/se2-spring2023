package lecture.lec05.behavioral_patterns.memento;


public class Memento {
	
	private String state;

	public Memento(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
	}
	
}
