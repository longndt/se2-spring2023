package lecture.lec05.behavioral_patterns.strategy;


public class Addition implements Strategy{

	@Override
	public float calculation(float a, float b) {
		return a+b;
	}

}
