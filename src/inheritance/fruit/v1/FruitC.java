package inheritance.fruit.v1;
// most docstrings have been omitted for instructional brevity
public class FruitC {

    // these fields are private to this class; subclasses cannot access them.
    // subclasses need to use accessor methods to get values of private fields.

    private final int weight;

    private final int costPerWt;

    private final String origin;

    private boolean isOrganic;

    public FruitC(int weight, int costPerWt, String origin, boolean isOrganic) {
        this.weight = weight;
        this.costPerWt = costPerWt;
        this.origin = origin;
        this.isOrganic = isOrganic;
    }

    public FruitC(int weight, int costPerWt, String origin) {

        this(weight, costPerWt, origin, false);   // call other constructor
    }

    public int getWeight() {
        return this.weight;
    }

    public int getCost() {
        return this.costPerWt * this.weight;
    }

    public String getOrigin() {
        return this.origin;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public String toString() {
        return "Fruit";
    }
}