package lecture.lec05.behavioral_patterns.interpreter;


public class InterpreterPatternClient {

    public static void main(String[] args) {
        String infix = "f+i*t-h*a+n-u";

        InfixToPostfixPattern ip = new InfixToPostfixPattern();

        String postfix = ip.conversion(infix);
        System.out.println("Infix:   " + infix);
        System.out.println("Postfix: " + postfix);
    }
}
