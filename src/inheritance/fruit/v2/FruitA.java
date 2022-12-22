package inheritance.fruit.v2;
// most docstrings have been omitted for instructional brevity
public abstract class FruitA { // clients cannot instantiate an abstract class

    private int weight;
    private int costPerWt;
    private String origin;
    private boolean isOrganic;
    private ProfitFactor profitGenerator;

    public FruitA( int weight, int costPerWt, String origin, boolean isOrganic ) {
        this.weight = weight;
        this.costPerWt = costPerWt;
        this.origin = origin;
        this.isOrganic = isOrganic;
        profitGenerator = ProfitFactor.instance();
    }

    public FruitA( int weight, int costPerWt, String origin ) {
        this( weight, costPerWt, origin, false ); // call other constructor
    }

    public int getWeight() {
        return this.weight;
    }

    public int getCost() {
        return this.weight * this.costPerWt;
    }

    public String getOrigin() {
        return this.origin ;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public String toString() {
        return "Fruit";
    }

    public double getMultiplier() {
        return profitGenerator.getFactor();
    }

    /**
     * abstract method forces subclasses to provide an implementation.
     * @return the selling price of the item.
     */
    public abstract double getPrice();

    /**
     * hashCode must produce the same result if 2 instances are equals().
     * By this function, equals should care about weight, cost and isOrganic.
     * Note: this function has not been tested/validated for regular consumption.
     * @see Object#hashCode()
     * @return the hash code of the instance.
     */
    public int hashCode() {
        int val = getCost();
        return val * val + (val << 1) + (isOrganic ? 1 : 0);
    }

}