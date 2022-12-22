package inheritance.fruit.v2;
// most docstrings have been omitted for instructional brevity

import java.util.ArrayList;
import java.util.List;

/**
 * The main class TrinidadFruitStand2 demonstrates inheritance solution v2.
 */
public class TrinidadFruitStand2 {

    private List<FruitA> stock;

    public TrinidadFruitStand2() {
        this.stock = new ArrayList<FruitA>();
    }

    public static void main(String[] args) {
        TrinidadFruitStand2 theStand = new TrinidadFruitStand2();
        System.out.println(theStand);
        System.out.println();
        theStand.openShop();

        theStand.closeShop();
    }

    public String toString() {
        return "Ralph's Trinidad Fruit Stand2";
    }

    public void openShop() {
        System.out.println("\nOpening " + this + "...");
        System.out.println();
        this.stock.add(new Apple2(3, 42, "Empire"));
        this.stock.add(new Apple2(3, 42, "McIntosh"));
        this.stock.add(new Banana2(3, 12, "Honduras", true));
        this.stock.add(new Banana2(2, 9, "Costa Rica", false));
        this.stock.add(new Lemon2(3, 4, "California"));
        this.stock.add(new Lemon2(7, 1, "Chile"));
        for (FruitA item : this.stock) {
            System.out.print(item + " for sale. ");
            System.out.printf("I'll sell it for %.2f\n", item.getPrice());
        }
        return;
    }

    public void closeShop() {
        System.out.println("\nNow closing\n");
        ProfitFactor.instance().setFactor(1.08);
        for (FruitA item : this.stock) {
            System.out.print("Doesn't anybody want this " + item + "? ");
            System.out.printf("I'll discount it to %.2f\n", item.getPrice());
        }
    }
}