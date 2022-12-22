package abstract_classes;

/**
 * The mighty Phoenix possesses the power of flight and can regenerate
 * hit points when taking damage if the damage is non-critical.
 *
 * @author RIT CS
 */
public class Phoenix extends Monster implements Flyer {
    private static final int REGEN_POINTS= 10;
    /** how far has this phoenix flown? */
    private int distanceFlown;

    /**
     * Create a new phoenix.
     *
     * @param name their name
     * @param hitPoints their hit points
     */
    public Phoenix(String name, int hitPoints) {
        super(name, hitPoints);
        this.distanceFlown = 0;
    }

    @Override
    public void attack(Monster m) {
        System.out.println(getName() + " claws " + m.getName() + ", Kaw, kaw");
        m.takeDamage(15);
    }

    public int getDistanceFlown() {
        return this.distanceFlown;
    }

    @Override
    public String toString() {
        return "Phoenix{" +
                "distanceFlown=" + this.distanceFlown +
                ", " + super.toString() + "}";
    }

    @Override
    public void fly(int distance) {
        System.out.println(getName() + " flies " + distance + " units.");
        this.distanceFlown += distance;
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (getHitPoints() > 0) {
            System.out.printf("%s regens %d hit points.%n", getName(), REGEN_POINTS);
            setHitPoints(getHitPoints() + REGEN_POINTS);
        }
    }
}