import java.util.PriorityQueue;

class BuyMax {
    public static void main(String[] args) {
        int n = 5;
        int[] cost = new int[] { 1, 12, 5, 111, 200 };
        int sum = 10;
        int result = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i : cost)
            q.add(i);

        for (int i = 0; i < n; i++) {
            if (q.peek() <= sum) {
                sum = sum - q.poll();
                result = result + 1;
            } else
                break;
        }

        System.out.println(result);
    }
}