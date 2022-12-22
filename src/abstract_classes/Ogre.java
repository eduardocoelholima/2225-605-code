package abstract_classes;

public class Ogre extends Monster {

    private String color;

    public Ogre(String name, int hitPoints, String color){
        super(name, hitPoints);
        this.color = color;
    }

    public void attack (Monster m){
        System.out.println(getName() + " clubs " + m.getName() + " Hue-hue");
        m.takeDamage(50);
    }

    @Override
    public String toString() {
        return super.toString() + "Ogre{" +
                "color='" + color + '\'' +
                '}';
    }
}
