package lecture.lec05.behavioral_patterns.memento;

import java.util.ArrayList;
import java.util.List;


public class Caretaker {
	
	private List<Memento> mementoList = new ArrayList<Memento>();

	   public void add(Memento state){
	      mementoList.add(state);
	   }

	   public Memento get(int index){
	      return mementoList.get(index);
	   }

}
