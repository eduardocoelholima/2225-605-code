package inheritance.fruit.v2;
// most docstrings have been omitted for instructional brevity
class Banana2 extends FruitA {

    private boolean beenPeeled ;

    public Banana2( int weight, int costPerWt, String origin, boolean organic ) {
        super( weight, costPerWt, origin, organic ) ;
        beenPeeled = false ;
    }

    @Override
    public String toString() {
        // organic and origin fields now require accessor calls
        return ( this.isOrganic() ? "organic " : "" ) + "Banana2 from "
             + this.getOrigin() ;
    }

    public void peel() {
        beenPeeled = true ;
        System.out.println( this + " has been peeled." );
    }

    public double getPrice() {
        return getCost() * getMultiplier() ;
    }

    /**
     * This equals cares about the class, the total cost and organic.
     */
    public boolean equals( Object obj ) {
        if ( ! ( obj instanceof Banana2 ) ) {
            return false;
        }
        Banana2 other = (Banana2)obj;   // cast
        return this.getCost() == other.getCost() 
            && this.isOrganic() == other.isOrganic() ;
    }

}