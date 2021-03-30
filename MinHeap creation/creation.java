class MinHeap {
    int arr[];
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
}

class Driver {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(11);
    }
}