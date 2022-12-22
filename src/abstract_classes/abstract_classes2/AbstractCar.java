package abstract_classes.abstract_classes2;

abstract public class AbstractCar extends Vehicle1 {
    int wheels;
    String honkSound;

    abstract public void setHonkSound(String sound);
    abstract public void honk();

    abstract public int getWheels();
    abstract public void setWheels(int wheels);
}
