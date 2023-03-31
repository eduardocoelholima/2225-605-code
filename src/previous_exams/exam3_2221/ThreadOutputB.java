package previous_exams.exam3_2221;

public class ThreadOutputB extends Thread {
    static Object lock;
    int id;

    public ThreadOutputB(Object lock, int id) { this.lock = lock; this.id = id; }

    public void run () {
        System.out.println(id + "before");
        synchronized (lock) { printSomething(id); }
        System.out.println(id + "after");
    }

    private static synchronized void printSomething (int id) {
        System.out.println(id + "in");
        try { sleep(100); } catch (Exception e) {}
        System.out.println(id + "out");
    }

    public static void main(String[] args) {
        new ThreadOutputB(new Object(), 1).start();
        new ThreadOutputB(new Object(), 2).run();
    }
}

// Answer the questions.
// 1 - Are the threads always synchronized on the same objects? Explain. Mention all objects that work as locks/monitors.
// 2 - Can the main thread finish before thread 2 finishes?
