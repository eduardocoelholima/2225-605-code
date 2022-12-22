package abstract_classes;

import java.util.ArrayList;

/**
 * Testing the concrete Monster class with concrete Phoenix class, and a
 * Flyer interface.
 *
 * @author RIT CS
 */
public class TestMonsters {

    public static void main(String[] args) {
        // create a monster obj
//        Monster mike = new Monster("Mike", 50);
        // create a phonenix obj
        Phoenix fawkes = new Phoenix("Fawkes", 200);

        Ogre shrek = new Ogre("Shrek", 500, "green");

        while (fawkes.getHitPoints() > 0 && shrek.getHitPoints()>0){
            fawkes.attack(shrek);
            shrek.attack(fawkes);
            System.out.println(fawkes);
            System.out.println(shrek);
            System.out.println();
        }
    }
}

