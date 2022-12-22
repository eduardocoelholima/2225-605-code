package inheritance.fruit.v2;
// most docstrings have been omitted for instructional brevity
public class Apple2 extends FruitA {

    private String variety;
    private boolean beenCored;

    /**
     * The best apples are New York apples!!
     */
    public Apple2(int weight, int costPerWt, String variety) {
        super(weight, costPerWt, "New York");   // must supply an origin
        this.variety = variety;
        this.beenCored = false;
    }

    @Override
    public String toString() {
        return this.variety + " Apple2";
    }

    @Override
    public int getCost() {           // overrides getCost() to add surcharge
        return 1 + super.getCost(); // make an ’up call’ to superclass
    }

    public String getVariety() {
        return this.variety;
    }

    public void core() {
        this.beenCored = true;
    }

    public double getPrice() {
        return getCost() * getMultiplier();
    }

    /**
     * This equals cares about the class, the total cost and organic.
     */
    public boolean equals(Object obj) {

        if (!(obj instanceof Apple2)) {
            return false;
        }
        Apple2 other = (Apple2) obj;   // cast
        return this.getCost() == other.getCost()
                && this.isOrganic() == other.isOrganic();
    }

}