package abstract_classes.abstract_classes2;

// In this task, did we specify other than in the abstract classes which
// methods and fields Camry should have?

// Check comments below

public class CamrySolution extends AbstractToyotaCar{
    String honkSound = "Camry honk";

    public void setHonkSound (String honkSound) {
        this.honkSound = honkSound;
    }

    public void honk()	{
        System.out.println( honkSound );
    }

    public int getWheels ()    {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    boolean hasPendingRecalls() {
        return false;
    }

    static public void main(String[] args) {
        CamrySolution myCar = new CamrySolution();
        myCar.honk();
        myCar.setWheels(3);
        System.out.printf("myCar has %d wheels %n",myCar.getWheels());
        System.out.printf("myCar has %d years of warranty %n",
                myCar.warrantyInYears);

        // Why can't I instantiate AbstractCar()?
//        new AbstractCar();

        // Assume every Toyota car should have 4 wheels (that might actually
        // be the case). How could we force it without hiding the original
        // wheel field?

        // Could we implement Camry class defining AbstractCar and
        // AbstractToyotaCar as interfaces instead of abstract classes?

    }


}
