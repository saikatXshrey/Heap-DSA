import java.util.PriorityQueue;

class Pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(15);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}