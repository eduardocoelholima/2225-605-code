package inheritance.fruit.v2;
// most docstrings have been omitted for instructional brevity
class Lemon2 extends FruitA {

    private boolean beenSqueezed = false;

    public Lemon2(int weight, int costPerWt, String origin) {
        super(weight, costPerWt, origin);
    }

    @Override
    public String toString() {
        return "Lemon2 from " + this.getOrigin();
    }

    public void squeeze() {
        beenSqueezed = true;
        System.out.println("squeeze " + this); // silly implementation
    }

    public double getPrice() {
        return getCost() * getMultiplier();
    }

    /**
     * This equals cares about the class, the total cost and organic.
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Lemon2)) {
            return false;
        }
        Lemon2 other = (Lemon2) obj;   // cast
        return this.getCost() == other.getCost()
                && this.isOrganic() == other.isOrganic();
    }

}
