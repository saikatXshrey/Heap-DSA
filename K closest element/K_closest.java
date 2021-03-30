import java.util.*;

class Pair {
    Integer key;
    Integer value;

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

class Kclosest {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 5, 40, 38, 80, 70 };
        int x = 35;
        int k = 3;
        printKClosest(arr, x, k);
    }

    static void printKClosest(int[] arr, int x, int k) {
        PriorityQueue<Pair> heap = new PriorityQueue<>(new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                return p2.getValue().compareTo(p1.getValue());
            }
        });

        for (int i = 0; i < k; i++)
            heap.add(new Pair(arr[i], Math.abs(arr[i] - x)));

        for (int i = k; i < arr.length; i++) {
            int difference = Math.abs(arr[i] - x);

            if (heap.peek().getValue() > difference) {
                heap.poll();
                heap.add(new Pair(arr[i], difference));
            }
        }

        while (!heap.isEmpty()) {
            System.out.print(heap.poll().getKey() + " ");
        }
    }
}