package lecture.lec05.creational_patterns.builder;


/**
 *
 * @author Ashwani
 */
public class SmallCoke extends Coke{

    @Override
    public String name() {
         return "300 ml Coke";  
    
    }

    @Override
    public String size() {
       
        return "Small Size";
    
    }

    @Override
    public float price() {
    
        return  25.0f;
    
    }
    
}
