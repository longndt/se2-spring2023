package lecture.lec05.creational_patterns.builder;


/**
 *
 * @author Ashwani
 */
public class MediumCoke extends Coke{
    
    @Override
    public String name() {
         return "500 ml Coke";  
    
    }

    @Override
    public String size() {
       
        return "Medium Size";
    
    }

    @Override
    public float price() {
    
        return  35.0f;
    
    }
    
    
}
