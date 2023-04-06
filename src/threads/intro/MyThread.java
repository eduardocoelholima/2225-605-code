package threads.intro;

public class MyThread extends Thread {
    public MyThread(String name) { super(name); }

    public void run() { System.out.println(getName()); }

    public static void main(String[] args) { new MyThread("my thread name").start(); }
}
