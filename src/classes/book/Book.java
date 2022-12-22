package classes.book;

public class Book {

    public static final int MAX_PAGES = 1500;
    private static int numOfBooks;
    private String title;
    private int pages;
    private int currentPages;
    private boolean hardcover;

    public Book(String title, int pages, boolean hardcover) {
        // using this to call another constructor
        this(title, pages, hardcover, 1);
    }

    // overloading the constructor
    public Book(String title, int pages, boolean hardcover, int currentPages) {
        this.title = title; // use this to prevent shadowing
        if (pages <= MAX_PAGES) {
            this.pages = pages;
        } else {
            this.pages = MAX_PAGES;
        }
        this.hardcover = hardcover;
        this.currentPages = currentPages;
        numOfBooks += 1;
    }

    public static int getNumOfBooks() {
        return numOfBooks;
    }

    public String getTitle() {
        return this.title;
    }

    public String read() {
        return "You read page " + currentPages;
    }

    public String read(int numPages) {
        turnPage(numPages);
        return read();
    }

    public void turnPage(int numPages) { // example of setter
        currentPages += numPages;
        if (currentPages > MAX_PAGES) {
            currentPages = MAX_PAGES;
        }
    }

    @Override
    public String toString() {
        return "Book, title " + this.title + ", " + this.pages + ", " + this.hardcover;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Book)) {
            return false;
        }
        Book b2 = (Book) other;
        return this.title.equals(b2.title) && this.pages == b2.pages && this.hardcover == b2.hardcover;
    }
}
