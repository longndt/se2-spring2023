package tuts.tut10.to_dos.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import tuts.tut10.complete.strategy.order.Order;
import tuts.tut10.complete.strategy.strategies.PayByCreditCard;
import tuts.tut10.complete.strategy.strategies.PayByPayPal;
import tuts.tut10.complete.strategy.strategies.PayStrategy;

/**
 * World first console e-commerce application.
 */
public class Demo {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                //TO-DO: get the input value and save to new variable 'choice' (int)
                 
                //TO-DO: set the cost based on the choice
                 
                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                //TO-DO: set total cost of order = cost * count
                 
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                //TO-DO: get the input value and save to new variable 'paymentMethod' (String)

                // Client creates different strategies based on input from user,
                // application configuration, etc.
                
                //TO-DO: if paymentMethod = 1 => pay by PayPal 
                //else pay by credit card
                

                // Order object delegates gathering payment data to strategy
                // object, since only strategies know what data they need to
                // process a payment.
                order.processOrder(strategy);

                System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
                String proceed = reader.readLine();
                if (proceed.equalsIgnoreCase("P")) {
                    // Finally, strategy handles the payment.
                    if (strategy.pay(order.getTotalCost())) {
                        System.out.println("Payment has been successful.");
                    } else {
                        System.out.println("FAIL! Please, check your data.");
                    }
                    //TO-DO: close the order
                     
                }
            }
        }
    }
}