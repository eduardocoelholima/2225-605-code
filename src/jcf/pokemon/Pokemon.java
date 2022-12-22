package jcf.pokemon;

import java.util.Comparator;
import java.util.Objects;

public class Pokemon implements Comparable<Pokemon> {


    enum Type { GROUND, FIRE, FLYING, WATER}

    private String name;
    private int pokedex;
    private Type type;

    public Pokemon(String name, int pokedex, Type type) {
        this.name = name;
        this.pokedex = pokedex;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public int compareTo(Pokemon o) {
        return o.pokedex - this.pokedex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return pokedex == pokemon.pokedex &&
                Objects.equals(name, pokemon.name) &&
                type == pokemon.type;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode() + this.pokedex + this.type.hashCode();
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", pokedex=" + pokedex +
                ", type=" + type +
                '}';
    }
}
