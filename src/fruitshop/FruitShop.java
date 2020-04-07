package fruitshop;

import fruitshop.observers.Customer;
import fruitshop.observers.NotifyChannel;

/**
 *
 * @author Admin
 */
public class FruitShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NotifyChannel apples = new NotifyChannel("Apples");
        NotifyChannel pineapples = new NotifyChannel("Pineapple");

        Customer c1 = new Customer("Vaggos");
        Customer c2 = new Customer("Lakis");
        Customer c3 = new Customer("Cris");

        c1.subscribe(apples);
        c2.subscribe(apples);

        c3.subscribe(pineapples);
        apples.printChannelCustomers();
        c1.unsubscribe(apples);

        apples.updateQuantity();



    }

}
