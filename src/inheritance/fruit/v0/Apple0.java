package inheritance.fruit.v0;
// most docstrings have been omitted for instructional brevity
public class Apple0 implements FruitI {       // Ralph's initial effort

    private int weight;

    /** CENTS_PER_OZ is an 'instance constant' (specified by final) */
    private final int CENTS_PER_OZ;

    private String variety;

    private boolean beenCored;

    public Apple0( int weight, int cost, String variety ) {
        this.weight = weight;
        this.CENTS_PER_OZ = cost;
        this.variety = variety;
        this.beenCored = false;
    }

    @Override
    public String toString() {
        return this.variety + " Apple0" ;
    }

    public int getCost() {      // Apple0 class implements a FruitI method
        return this.weight * CENTS_PER_OZ ;
    }

    public String getVariety() {
        return this.variety ;
    }

    public void core() {
        this.beenCored = true;
    }
}