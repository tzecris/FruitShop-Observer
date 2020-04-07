package fruitshop.observers;

/**
 *
 * @author Admin
 */
public class Customer extends Observer {

    String name;

    public void subscribe(NotifyChannel channel) {
        super.channel = channel;
        channel.add(this);
    }

    public void unsubscribe(NotifyChannel channel) {
        this.channel = null;
        channel.remove(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name) {
        this.name = name;
    }

    @Override
    protected void upDate(String message) {
        System.out.println(this.name + ": " + message);
    }

}
