package lambda;

import java.util.*;
import java.util.function.Consumer;

public class Altogether {
    public static void main(String[] args) {
        Collection<Person3> people = Set.of(
                new Person3("Alice", 20),
                new Person3("Bob", 22),
                new Person3("Carol", 21),
                new Person3("Dan", 18),
                new Person3("Bob", 20)
        );

        System.out.println("..using a loop..");
        for (Person3 p : people) {
            System.out.println(p);
        }
        System.out.println("\n..using PersonPrinter and forEach");
        people.forEach(new PersonPrinter());
        System.out.println("\n..using an anonymous class and forEach");
        people.forEach(new Consumer<Person3>() {
            public void accept(Person3 t) {
                System.out.println(t);
            }
        });
        System.out.println("\n..using a lambda (big) and forEach");
        people.forEach((Person3 t) -> System.out.println(t));
        System.out.println("\n..using a lambda (small) and forEach");
        people.forEach(t -> System.out.println(t));
        System.out.println("\n..using a method reference and forEach");
        people.forEach(System.out::println);
        System.out.println("\n..sorting with comparators");
        List<Person3> peeps = new ArrayList<>(people);
        peeps.sort(
                Comparator
                        .comparing(Person3::getAge)
                        .thenComparing(Person3::getName)
        );
        peeps.forEach(System.out::println);
    }
}

class Person3 {
    private String name;
    private int age;

    public Person3(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() == o.getClass()) {
            Person3 op = (Person3) o;
            return name.equals(op.name) && age == op.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + '[' + age + ']';
    }

}

class PersonPrinter implements Consumer<Person3> {
    @Override
    public void accept(Person3 t) {
        System.out.println(t);
    }
}

