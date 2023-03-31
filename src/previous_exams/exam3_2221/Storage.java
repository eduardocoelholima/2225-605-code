package previous_exams.exam3_2221;

public class Storage {
    private String message;
    private boolean empty = true;
    static Object lock = new Object();

    public String take() {
        synchronized (lock) {
            while (empty) { try { lock.wait(); } catch (InterruptedException e) {} }
            empty = true;
            lock.notifyAll();
            return message;
        }
    }

    public void put(String message) {
        synchronized (lock) {
            while (!empty) { try { lock.wait(); } catch (InterruptedException e) {} }
            empty = false;
            this.message = message;
            lock.notifyAll();
        }
    }
}
