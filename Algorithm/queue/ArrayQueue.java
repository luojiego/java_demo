public class ArrayQueue {
    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
        System.out.printf("Create ArrayQueue capactity size: %d\n", capacity);
    }

    public boolean enqueue(String item) {
        // 旧的操作，如果空间还有，不会做数据搬移操作
        // if (tail == n) {
        //     return false;
        // }

        // items[tail] = item;
        // ++tail;
        // return true;

        if (tail == n) {
            if (head == 0) {
                return false;
            }

            for (int i = head; i < tail; i++) {
                items[i-head] = items[i];
            }
            tail -= head;
            head = 0;
        }
        System.out.printf("ArrayQueue equeue head: %d tail: %d value: %s\n", 
            head, tail, item);
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
        System.out.printf("ArrayQueue deque value: %s\n", ret);
        return ret;
    }

    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(4);
        aq.enqueue("hello");
        aq.enqueue("world");
        aq.dequeue();
        aq.dequeue();
        aq.enqueue("I");
        aq.enqueue("Love");
        aq.enqueue("LiuTing");
    }
}