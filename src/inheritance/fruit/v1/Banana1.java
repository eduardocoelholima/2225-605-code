package inheritance.fruit.v1;
// most docstrings have been omitted for instructional brevity
class Banana1 extends FruitC {

    private boolean beenPeeled;

    public Banana1( int weight, int costPerWt, String origin, boolean organic ) {
        super( weight, costPerWt, origin, organic ) ;
        this.beenPeeled = false;
    }

    @Override
    public String toString() {
        // organic and origin fields require accessor calls
        return ( this.isOrganic() ? "organic " : "" ) + "Banana1 from "
             + this.getOrigin() ;
    }

    public void peel() {
        this.beenPeeled = true;
        System.out.println( this + " is peeled." );
    }
}