package array;

public class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int leftChild = 2 * i + 1; // left = 2*i + 1
        int rightChild = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // If right child is larger than largest so far
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};

        System.out.println("Original array:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Array sorted using Heap Sort:");
        printArray(arr);
    }
}

