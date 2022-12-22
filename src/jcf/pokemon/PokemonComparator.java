package jcf.pokemon;

import java.util.Comparator;

public class PokemonComparator implements Comparator<Pokemon> {

    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        int result = o1.getType().compareTo(o2.getType());
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }

}
