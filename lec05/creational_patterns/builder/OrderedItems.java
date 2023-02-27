package lecture.lec05.creational_patterns.builder;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashwani
 */
public class OrderedItems {
    
    List<Item> items=new ArrayList<Item>();
    
    public void addItems(Item item){
        
        items.add(item);
    }
    
    
    public float getCost(){
        
        float cost=0.0f;
            for (Item item : items) {
                cost+=item.price();
             }
        return cost;
    }
    
    public void showItems(){
        
        for (Item item : items) {
            System.out.println("Item is:" +item.name());
            System.out.println("Size is:" +item.size());
            System.out.println("Price is: " +item.price());
            
        }
    }
    
}
