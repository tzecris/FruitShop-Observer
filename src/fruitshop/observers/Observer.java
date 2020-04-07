package fruitshop.observers;

/**
 *
 * @author Admin
 */
public abstract class Observer {

    protected NotifyChannel channel;

    protected abstract void upDate(String message);
}
