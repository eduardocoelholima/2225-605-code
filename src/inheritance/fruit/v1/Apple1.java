package inheritance.fruit.v1;
// most docstrings have been omitted for instructional brevity
public class Apple1 extends FruitC {

    private String variety;
    private boolean beenCored;

    /**
     * The best apples are New York apples!!
     */
    public Apple1(int weight, int costPerWt, String variety) {
        super(weight, costPerWt, "New York");   // must supply an origin
        this.variety = variety;
        this.beenCored = false;
    }

    @Override
    public String toString() {
        return this.variety + " Apple1";
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
}