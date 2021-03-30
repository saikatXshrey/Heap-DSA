
class Test {

    public static class MinHeap {
        int[] arr;
        int size;
        int capacity;

        MinHeap(int c) {
            size = 0;
            capacity = c;
            arr = new int[c];
        }

        int left(int i) {
            return (2 * i + 1);
        }

        int right(int i) {
            return (2 * i + 2);
        }

        int parent(int i) {
            return (i - 1) / 2;
        }

        public void insert(int x) {
            if (size == capacity)
                return;
            size++;
            arr[size - 1] = x;

            for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i];) {
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = temp;
                i = parent(i);
            }
        }

        void minHeapify(int x) {
            int lt = left(x);
            int rt = right(x);
            int smallest = x;

            if (lt < size && arr[lt] < arr[parent(x)])
                smallest = lt;

            if (lt < size && arr[rt] < arr[smallest])
                smallest = rt;

            if (smallest != x) {
                int temp = arr[x];
                arr[x] = arr[smallest];
                arr[smallest] = temp;
                minHeapify(smallest);
            }
        }

        void decreaseKEY(int i, int x) {
            arr[i] = x;
            minHeapify(0);
        }

        void display() {
            for (int i : arr)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);

        h.display();

        h.decreaseKEY(2, 1);

        h.display();
    }
}