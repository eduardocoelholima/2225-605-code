package streams;

import java.util.*;
import java.util.function.*;

public class Altogether {
    public static void main( String[] args ) {
        Collection< Person > people = Set.of(
                new Person( "Alice", 20 ),
                new Person( "Bob", 22 ),
                new Person( "Carol", 21 ),
                new Person( "Dan", 18 ),
                new Person( "Bob", 20 )
        );

        System.out.println( "..using a loop.." );
        for ( Person p: people ) {
            System.out.println( p );
        }
        System.out.println( "\n..using PersonPrinter and forEach" );
        people.forEach( new PersonPrinter() );
        System.out.println( "\n..using an anonymous class and forEach" );
        people.forEach( new Consumer<Person>() {
                        public void accept( Person t ) {
                            System.out.println( t );
                        }
        });
        System.out.println( "\n..using a lambda (big) and forEach" );
        people.forEach( (Person t) -> System.out.println(t) );
        System.out.println( "\n..using a lambda (small) and forEach" );
        people.forEach( t -> System.out.println(t) );
        System.out.println( "\n..using a method reference and forEach" );
        people.forEach( System.out::println );
        System.out.println( "\n..using a lambda filter and forEach" );
        people.stream()
                .filter( p -> p.mayDrink() )
                .forEach( System.out::println );
        System.out.println( "\n..using a method reference filter and forEach" );
        people.stream()
                .filter( Person::mayDrink )
                .forEach( System.out::println );
        System.out.println( "\n..using a parallel stream, method reference filter and forEach" );
        people.parallelStream()
                .filter( Person::mayDrink )
                .forEach( System.out::println );
        System.out.println( "\n..sorting with comparators" );
        List< Person > peeps = new ArrayList<>( people );
        peeps.sort(
                Comparator
                        .comparing( Person::getAge )
                        .thenComparing( Person::getName )
        );
        peeps.forEach( System.out::println );
    }
}

class Person {
    private String name;
    private int age;
    public Person( String n, int a ) { name = n; age = a; }

    public String getName() { return name; }

    public int getAge() { return age; }

    @Override public int hashCode() { return name.hashCode(); }
    @Override public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( getClass() == o.getClass() ) {
            Person op = (Person)o;
            return name.equals( op.name ) && age == op.age;
        }
        return false;
    }
    @Override public String toString() { return name + '[' + age + ']'; }
    public boolean mayDrink() { return age >= 21; }
}

class PersonPrinter implements Consumer< Person > {
    @Override public void accept( Person t ) {
        System.out.println( t );
    }
}

