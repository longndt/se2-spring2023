package lecture.lec05.creational_patterns.builder;


/**
 *
 * @author Ashwani
 */
public class ExtraLargeNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 250.0f;
    }

    @Override
    public String name() {
       return "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Extra-Large Size";
    }
    
}
