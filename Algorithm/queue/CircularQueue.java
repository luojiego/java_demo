public class CircularQueue {
    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public CircularQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
        System.out.printf("Create CircularQueue capactity size: %d\n", capacity);
    }

    public boolean enqueue(String item) {
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % n;

        System.out.printf("CircularQueue enqueue head: %d tail: %d value: %s\n", 
            head, tail, item);
        return true;
    }

    public String dequeue() {
        // 表示队列为空
        if (head == tail) {
            return null;
        }

        String ret = items[head];
        head = (head + 1) % n;
        System.out.printf("CircularQueue dequeue head: %d tail: %d value: %s\n", 
            head, tail, ret);
        return ret;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(4);
        cq.enqueue("hello");
        cq.enqueue("world");
        cq.dequeue();
        cq.dequeue();
        cq.enqueue("I");
        cq.enqueue("Love");
        cq.enqueue("LiuTing");
    }

}
