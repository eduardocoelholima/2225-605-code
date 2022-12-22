package inheritance.fruit.v0;
// most docstrings have been omitted for instructional brevity
import java.util.ArrayList;
import java.util.List;

/**
 * TrinidadFruitStand0 is the main, demonstration of the interface solution.
 */
public class TrinidadFruitStand0 {

    private List<FruitI> stock;

    public TrinidadFruitStand0() {
        this.stock = new ArrayList<FruitI>();
    }

    public static void main(String[] args) {
        TrinidadFruitStand0 theStand = new TrinidadFruitStand0();
        System.out.println(theStand);
        System.out.println();
        theStand.openShop();

        theStand.closeShop();
    }

    public String toString() {
        return "Ralph's Trinidad Fruit Stand0";
    }

    public void openShop() {
        System.out.println("\nOpening " + this + "...");
        System.out.println();
        this.stock.add(new Apple0(3, 42, "Empire"));
        this.stock.add(new Banana0(3, 12, "Honduras", true));
        this.stock.add(new Banana0(2, 9, "Costa Rica", false));
        for (FruitI item : this.stock) {
            System.out.print(item + " for sale. ");
            System.out.println("I'll sell it for " + item.getCost());
        }
        return;
    }

    public void closeShop() {
        System.out.println("\nNow closing\n");
        for (FruitI item : this.stock) {
            System.out.print("Doesn't anybody want this " + item + "? ");
            System.out.println("I'll discount it to " + (item.getCost() / 2));
        }
    }
}