package jcf.pokemon;

//import java.awt.*;
import java.util.*;
import java.util.List;

public class PokemonStadium {

    List<Pokemon> pokemonList;
    Pokemon charmander;
    Pokemon starly;
    Pokemon squirtle;
    Pokemon diglet;

    public PokemonStadium(){
        pokemonList = new ArrayList<>();

         charmander = new Pokemon("Charmander", 4, Pokemon.Type.FIRE);
         starly = new Pokemon("Starly", 396, Pokemon.Type.FLYING);
         squirtle = new Pokemon("Squirtle", 7, Pokemon.Type.WATER);
         diglet = new Pokemon("Diglet", 150, Pokemon.Type.GROUND);

        pokemonList.addAll(Arrays.asList(charmander, starly, squirtle, diglet));
    }

    public void find(){
        System.out.println("Finding pokemon ...");
        for (Pokemon p : pokemonList){
            System.out.println("Finding pokemon " + p.getName() + "? " + pokemonList.contains(p));
        }

        Pokemon starlyCopy = new Pokemon("Starly", 396, Pokemon.Type.FLYING);
        System.out.println("Finding pokemon " + starlyCopy.getName() + "? " + pokemonList.contains(starlyCopy));
    }

    public void orderPokemon(){
        System.out.println("Printing natural order pokemon ...");
        Set<Pokemon> pokemonSet = new TreeSet<>(pokemonList);
        for (Pokemon p: pokemonSet){
            System.out.println(p);
        }
    }

    public void orderPokemonSpecial(){
        System.out.println("Printing pokemon special order ...");
        Set<Pokemon> pokemonSet = new TreeSet<>(new PokemonComparator());
        pokemonSet.addAll(pokemonList);
        for (Pokemon p: pokemonSet){
            System.out.println(p);
        }
    }

    public void findPokemonFast(){
        System.out.println("Finding pokemon fast ...");
        Map<Pokemon, Double> pokemonMap = new HashMap<>();
        pokemonMap.put(this.charmander, 1.8);
        pokemonMap.put(this.starly, 4.5);
        pokemonMap.put(this.squirtle, 2.3);
        pokemonMap.put(this.diglet, 3.8);

        pokemonMap.put(new Pokemon("Starly", 396, Pokemon.Type.FLYING), 7.5);

        for (Pokemon p: pokemonMap.keySet()){
            System.out.println(p.getName() + " -> " + pokemonMap.get(p) + " - hashCode " + p.hashCode());
        }
    }

    public static void main(String[] args) {
        PokemonStadium stadium = new PokemonStadium();
        for (Pokemon p : stadium.pokemonList){
            System.out.println(p);
        }
        System.out.println();
        stadium.find();
        System.out.println();
        stadium.orderPokemon();
        System.out.println();
        stadium.orderPokemonSpecial();
        System.out.println();
        stadium.findPokemonFast();
    }
}
