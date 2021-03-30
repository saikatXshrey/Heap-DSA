import java.util.PriorityQueue;

class SortK {
    static void sortK(int[] arr, int n, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i <= k; i++)
            q.add(arr[i]);

        int index = 0;

        for (int i = k + 1; i < n; i++) {
            arr[index++] = q.poll();
            q.add(arr[i]);
        }

        while (!q.isEmpty())
            arr[index++] = q.poll();
    }

    static void display(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 12, 56, 8 };
        int k = 3;
        int n = arr.length;
        sortK(arr, n, k);
        System.out.println("Following is sorted array");
        display(arr);
    }
}