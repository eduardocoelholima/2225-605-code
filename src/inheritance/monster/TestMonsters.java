package inheritance.monster;

import java.util.ArrayList;

/**
 * Testing the concrete Monster class with concrete Phoenix class, and a
 * Flyer interface.
 *
 * @author RIT CS
 */
public class TestMonsters {

    /**
     * Play around with the different types of objects and references to
     * understand what gets called.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        // first look at valid and invalid assignments
        Monster m1 = new Monster("m1", 100);
        m1.getName();                // OK
        m1.getHitPoints();           // OK
        m1.takeDamage(10);   // OK, call's
        //m1.fly(10);                // Monster is not a Flyer
        m1.toString();               // call's Monster::toString()

        Phoenix p1 = new Phoenix("p1", 50);
        p1.getName();                // OK, call's Monster::getName()
        p1.getDistanceFlown();       // OK, call's Phoenix::getDistanceFlown()
        p1.takeDamage(5);            // OK, call's Phoenix::takeDamage()
        p1.fly(10);         // OK, Phoenix is a Flyer
        p1.toString();               // OK, call's Phoenix::toString()

        Monster m2 = new Phoenix("p2", 70);
        m2.getName();                // OK, call's Monster::getName()
        // m2.getDistanceFlown();    // Monster reference cannot call on Phoenix::getDistanceFlown()
        m2.takeDamage(15);   // OK, call's Phoenix::takeDamage()
        // m2.fly()                  // Monster is not a Flyer
        m2.toString();               // OK, call's Phoenix::toString()

        Flyer f1 = new Phoenix("p3", 55);
        f1.fly(5);          // OK, call's Phoenix::fly()
        //f1.getName();              // Flyer is not a Monster
        //f1.getDistanceFlown();     // Flyer is not a Phoenix
        f1.toString();               // OK, call's Phoenix::toString()

        // these should be invalid for obvious reasons
        // Phoenix p4 = new Monster("p4", 40);   // Monster object cannot be a Phoenix reference
        // Flyer f2 = new Monster("f2", 60);     // Monster is not a Flyer
        // Flyer f3 = new Flyer();               // Flyer is an interface, cannot be instantiated

        // add them to a collection and manipulate them
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(m1);
        monsters.add(p1);
        monsters.add(m2);
        for (Monster monster : monsters) {
            monster.takeDamage(15);
        }

        for (Monster monster : monsters) {
            System.out.println(monster);
        }
    }
}

/*
$ java TestMonsters
m1 takes 10 damage.
p1 takes 5 damage.
p1 regens 10 hit points.
p1 flies 10 units.
p2 takes 15 damage.
p2 regens 10 hit points.
p3 flies 5 units.
m1 takes 15 damage.
p1 takes 15 damage.
p1 regens 10 hit points.
p2 takes 15 damage.
p2 regens 10 hit points.
Monster{name='m1', hitPoints=75}
Phoenix{distanceFlown=10, Monster{name='p1', hitPoints=50}
Phoenix{distanceFlown=0, Monster{name='p2', hitPoints=60}
*/