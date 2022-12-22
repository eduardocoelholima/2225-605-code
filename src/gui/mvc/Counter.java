package gui.mvc;

import java.util.List;
import java.util.LinkedList;

/**
 * A class that maintains an integer counter and can be observed
 * by a UI. It represents the model in the MVC architectural pattern.
 *
 * @author James Heliotis
 */
public class Counter {
    /** the model's state is the current count value */
    private int count;
    /** the collection of observers of this model */
    private List < Observer< Counter > > observers = new LinkedList<>();

    /**
     * Create the counter.
     */
    public Counter() {
        this.count = 0;
    }

    /**
     * The view calls this to add itself as an observer.
     *
     * @param observer the view
     */
    public void addObserver( Observer< Counter > observer ){
        observers.add( observer );
    }

    /**
     * The model's state has changed (the counter), so inform the view via
     * the update method
     */
    private void alertObservers(){
        for ( Observer< Counter > observer: observers ) {
            observer.update( this );
        }
    }

    /**
     * Get the current value of the counter.  Called by the view when update
     * is called so it can display the new counter value.
     * @return
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Increment the counter by one.  Called by the controller whenever the
     * user initiates an increment.
     */
    public void increment() {
        this.count += 1;
        this.alertObservers();
    }

    /**
     * Decrement the counter by one.  Called by the controller whenever the
     * user initiates a decrement.
     */
    public void decrement() {
        this.count -= 1;
        this.alertObservers();
    }

}
