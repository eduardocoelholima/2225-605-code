package inheritance.fruit.v0;
// most docstrings have been omitted for instructional brevity
class Banana0 implements FruitI {       // Ralph's initial effort

    private final int CENTS_PER_OZ;
    private int weight;
    private String origin;
    private boolean organic;
    private boolean hasBeenPeeled;


    public Banana0(int weight, int cost, String origin, boolean organic) {
        this.weight = weight;
        this.CENTS_PER_OZ = cost;
        this.origin = origin;
        this.organic = organic;
        this.hasBeenPeeled = false;
    }

    @Override
    public String toString() {
        return (this.organic ? "organic " : "") + "Banana0 from "
                + this.origin;
    }

    public int getCost() {      // Banana0 class implements a FruitI method
        return this.weight * CENTS_PER_OZ;
    }

    public void peel() {
        System.out.println(this + " is peeled."); // silly implementation
        this.hasBeenPeeled = true;
    }
}