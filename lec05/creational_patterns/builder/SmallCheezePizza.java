package lecture.lec05.creational_patterns.builder;

public class SmallCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 170.0f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
       return "Small size";  
    }    
}// End of the SmallCheezePizza class.  