package inheritance.inheritance2;//package classes.inheritance;

public class Parent {
    String value = "";

    public Parent concatenate(String value) {
        this.value = this.value + value;
        return new Parent();
    }

    public static void main(String[] args) {
        Parent o = new Parent();

        o.concatenate("apple")
         .concatenate(" orange")
         .concatenate(" pineaple");

        System.out.println( o.value );

    }

}
