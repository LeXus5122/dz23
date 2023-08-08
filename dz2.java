public class dz2 {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            adjustHeap(arr, i, 0);
        }
    }

    private static void adjustHeap(int[] arr, int size, int root) {
        int max = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && arr[left] > arr[max]) {
            max = left;
        }

        if (right < size && arr[right] > arr[max]) {
            max = right;
        }

        if (max != root) {
            int swap = arr[root];
            arr[root] = arr[max];
            arr[max] = swap;

            adjustHeap(arr, size, max);
        }
    }

    public static void main(String[] args) {
        int[] testArray = {12, 11, 13, 5, 6, 7};
        heapSort(testArray);
        for (int item : testArray) {
            System.out.print(item + " ");
        }
    }
}
