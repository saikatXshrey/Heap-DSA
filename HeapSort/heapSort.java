class HeapSort {
    void maxHeapify(int[] arr, int n, int i) {
        int lt = 2 * i + 1;
        int rt = 2 * i + 2;
        int highest = i;

        if (lt < n && arr[lt] > arr[highest])
            highest = lt;
        if (rt < n && arr[rt] > arr[highest])
            highest = rt;

        if (highest != i) {
            int temp = arr[i];
            arr[i] = arr[highest];
            arr[highest] = temp;
            maxHeapify(arr, n, highest);
        }
    }

    void buildHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(arr, n, i);
    }

    void sort(int[] arr) {
        int n = arr.length;

        buildHeap(arr, n);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, i, 0);
        }
    }

    static void display(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        display(arr);
    }
}