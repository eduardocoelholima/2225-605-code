package previous_exams.exam3_2221;

public class ProducerConsumerStorage {
    public static void main(String[] args) {
        Storage storage = new Storage();
        (new Thread(new ProducerStorage(storage))).start();
        (new Thread(new ConsumerStorage(storage))).start();
    }
}

// Answer the questions
// 1 - Are there busy loops in this implementation? Where?
// 2 - If more than one Storage instance is created, can a 'put' method from one instance run concurrently with a 'take' method of another instance? Why?
