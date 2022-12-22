package abstract_classes.abstract_classes2;

public class Vehicle1 {

    String honkSound = "Vehicle honk";
    int wheels       = 4;

    public void setHonkSound (String honkSound)    {
      this.honkSound = honkSound;
    }

    public void honk()	{
    System.out.println(honkSound);
  }

    public void setWheels (int wheels)    {
      this.wheels = wheels;
    }

    public int getWheels ()	{
      return wheels;
    }

}
