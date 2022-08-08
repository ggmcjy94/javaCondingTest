package fastcampus.chapter1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class MyQueue<T> {
    private final List<T> list = new ArrayList<>();
    public boolean add(T t) {
        if (t == null) return false;
        list.add(t);
        return true;
    }

    public Integer poll() {
        if (list.size() == 0) return null;
        int a = 0;
        a = (int) list.get(0);
        list.remove(0);
        return a;
    }
    public Integer peek() {
        if (list.size() == 0) return null;
        return (Integer) list.get(0);
    }
}

class MyQueue1<T> {
    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) return null;
        return  queue.remove(0);
    }

    public boolean isEmpty() {
        return  queue.isEmpty();
    }
}

public class 큐 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<String> queue_str = new LinkedList<>();
        queue.offer(1);
        queue.add(2);
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.size());

        MyQueue<Integer> myQ = new MyQueue<>();
        myQ.add(1);
        myQ.add(2);
        myQ.add(3);

        System.out.println(myQ.peek());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());

        MyQueue1<Integer> myQueue = new MyQueue1<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
