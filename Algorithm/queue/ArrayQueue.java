public class ArrayQueue {
    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    public boolean enqueue(String item) {
        if (tail == n) {
            return false;
        }

        items[tail] = item;
        ++tail;
        return true;
    }

    public String dequeue() {
        if (head == tail) {
            return null;
        }

        String ret = items[head];
        ++head;
        return ret;
    }

    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(10);
        aq.enqueue("hello");
        aq.enqueue("world");

        // String v = aq.dequeue();
        System.out.printf("aq.dequeue(): %s\n", aq.dequeue());
        System.out.printf("aq.dequeue(): %s\n", aq.dequeue());
    }
}