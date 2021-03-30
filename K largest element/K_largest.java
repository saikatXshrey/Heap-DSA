import java.util.*;
import java.util.PriorityQueue;

class K_Largest {

    static void printKlargest(int[] arr, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < k; i++)
            q.add(arr[i]);

        for (int i = k; i < arr.length; i++) {
            if (q.peek() < arr[i]) {
                q.poll();
                q.add(arr[i]);
            }
        }
        Iterator iterator = q.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int k = 3;
        printKlargest(arr, k);
    }
}