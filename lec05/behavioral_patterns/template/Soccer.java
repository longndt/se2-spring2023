package lecture.lec05.behavioral_patterns.template;


public class Soccer extends Game {
	
	@Override
	   void initialize() {
	      System.out.println("Soccer Game Initialized! Start playing.");
	   }

    @Override
	   void start() {
	      System.out.println("Game Started. Welcome to in the Soccer game!");
	   }
	   
	@Override
	   void end() {
	      System.out.println("Game Finished!");
	   }

}
