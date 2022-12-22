package inheritance.fruit.v2;
// most docstrings have been omitted for instructional brevity
/**
 * Only the store owner has access to this class to change the profit factor.
 */
public class ProfitFactor {

    private static double factor;

    private static ProfitFactor oneAndOnly = null;

    private ProfitFactor() {
        this(1.5);  // default 50% markup for profit
    }

    /**
     * @param factor must be greater than or equal to 1.0
     */
    private ProfitFactor(double factor) {
        this.factor = factor;
    }

    public static ProfitFactor instance() {

        if (oneAndOnly == null) {
            oneAndOnly = new ProfitFactor();
        }
        return oneAndOnly;
    }

    public double getFactor() {
        return oneAndOnly.factor;
    }

    public void setFactor(double newFactor) {
        oneAndOnly.factor = newFactor;
    }

}