package lecture.lec05.behavioral_patterns.command;


public class ActionOpen implements ActionListenerCommand{
	
	private Document doc;
	 
    public ActionOpen(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.open();
    }

}
