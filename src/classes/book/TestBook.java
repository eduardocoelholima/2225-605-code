package classes.book;

public class TestBook {

    public static void main(String[] args) {
        Book ullises = new Book("Ullises", 500, true);
        System.out.println(ullises);

        Book dracula = new Book("Dracula", 700, false);
        Book dracula2 = new Book("Dracula", 700, false);

        System.out.println(dracula == dracula2); // checking if both are pointing to the same object
        System.out.println(dracula.equals(dracula2)); // check for equivalence
        System.out.println(ullises.equals(dracula));

        // reading books
        dracula.turnPage(1);
        System.out.println(dracula.read());
        System.out.println(dracula.read(3));

        System.out.println("Number of books created: " + Book.getNumOfBooks());
        System.out.println("Max number of pages" + Book.MAX_PAGES);
    }
}
