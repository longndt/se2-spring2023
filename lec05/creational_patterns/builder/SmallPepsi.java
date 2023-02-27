package lecture.lec05.creational_patterns.builder;

/**
 *
 * @author Ashwani
 */
public class SmallPepsi  extends Pepsi{

    @Override
    public String name() {
       return "300 ml Pepsi";
    }

  

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String size() {
        return "Small Size";
    }

   
}
