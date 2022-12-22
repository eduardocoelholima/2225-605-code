package threads;

class Table {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}

public class ClassSynchronization {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Table.printTable(1);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Table.printTable(10);
            }
        });

        t1.start();
        t2.start();
    }
}
