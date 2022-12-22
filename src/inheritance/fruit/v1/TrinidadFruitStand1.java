package inheritance.fruit.v1;
// most docstrings have been omitted for instructional brevity

import java.util.ArrayList;
import java.util.List;

/**
 * The main class TrinidadFruitStand1 demonstrates inheritance solution v1.
 */
public class TrinidadFruitStand1 {

    private List<FruitC> stock;

    public TrinidadFruitStand1() {
        this.stock = new ArrayList<FruitC>();
    }

    public static void main(String[] args) {

        // construct a stand, open it, and close it.
        TrinidadFruitStand1 theStand = new TrinidadFruitStand1();

        theStand.openShop();
        theStand.closeShop();
    }

    public String toString() {
        return "Ralph's Trinidad Fruit Stand1";
    }

    public void openShop() {
        System.out.println(this);
        System.out.println("\nNow Opening ...");
        System.out.println();

        List<FruitC> stock = new ArrayList<>();
        stock.add(new Apple1(3, 42, "Empire"));
        stock.add(new Banana1(3, 12, "Honduras", true));
        stock.add(new Banana1(2, 9, "Costa Rica", false));
        stock.add(new Lemon1(3, 4, "California"));
        stock.add(new Lemon1(7, 1, "Chile"));
        for (FruitC item : stock) {
            System.out.print(item + " for sale. ");
            System.out.println("I'll sell it for " + item.getCost());
        }
    }

    public void closeShop() {
        System.out.println("\nNow closing\n");
        for (FruitC item : this.stock) {
            System.out.print("Doesn't anybody want this " + item + "? ");
            System.out.println("I'll discount it to " + (item.getCost() / 2));
        }
    }
}