package inheritance.fruit.v1;
// most docstrings have been omitted for instructional brevity
class Lemon1 extends FruitC {

    private boolean beenSqueezed = false;

    public Lemon1(int weight, int costPerWt, String origin) {
        super(weight, costPerWt, origin);
    }

    @Override
    public String toString() {
        return "Lemon1 from " + this.getOrigin();
    }

    public void squeeze() {
        beenSqueezed = true;
        System.out.println(this + " has been squeezed");
    }
}
