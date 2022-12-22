package abstract_classes;

/**
 * A basic monster with a name and hitpoints.
 *
 * @author RIT CS
 */
public abstract class Monster {
    /** the name of our esteemed monster */
    private String name;
    /** the current number of hit points */
    private int hitPoints;

    /**
     * Create a new monster.
     *
     * @param name the name
     * @param hitPoints current hit points
     */
    public Monster(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }


    public abstract void attack(Monster m);

    /**
     * Get the name.
     *
     * @return the name (derp!)
     */
    public String getName() {
        return name;
    }

    /**
     * Get the current hit points.
     *
     * @return hit points
     */
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Our monster takes some damage.
     *
     * @param amount amount of damage to take
     */
    public void takeDamage(int amount) {
        System.out.println(this.name + " takes " + amount + " damage.");
        this.hitPoints -= amount;
        if (this.hitPoints <= 0) {
            System.out.println(this.name + " was vanquished!");
            this.hitPoints = 0;
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                '}';
    }
}
