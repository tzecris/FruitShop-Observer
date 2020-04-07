package fruitshop.observers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NotifyChannel {

    String name;

    private List<Observer> customers = new ArrayList();

    public NotifyChannel(String name) {
        this.name = name;
    }

    public NotifyChannel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyAllCustomers("The new " + name + " is now available.");
    }

    public List<Observer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Observer> customers) {
        this.customers = customers;
    }


    protected void add(Customer customer) {
        customers.add(customer);
        String successMessage = "You are subscribed to " + getName() + ".";
        notifyCustomers(customer, successMessage);
    }

    protected void remove(Customer customer) {
        customers.remove(customer);

        String successMessage = "You are unsubscribed from " + getName() + ".";
        notifyCustomers(customer, successMessage);
    }

    private void notifyCustomers(Observer o, String message) {
        o.upDate(message);
    }

    private void notifyAllCustomers(String message) {
        for (Observer o : customers) {
            o.upDate(message);
        }
    }

    public void updateQuantity() {
        String message = getName() + " quantity is updated.";
        notifyAllCustomers(message);
    }

    public void printChannelCustomers() {
        System.out.println("******Printing Customers of Channel " + name);
        for (Observer o : customers) {
            Customer customer = (Customer) o;
            System.out.println(customer.getName());
        }
    }


}
