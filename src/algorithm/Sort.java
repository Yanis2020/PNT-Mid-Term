package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int temp;
        int n = array.length;
        for (int i = 1; i < n; i++) {
            temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

        return list;
    }

    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

    public int[] quickSort(int[] array, int begin, int end) {
        int[] list = array;
        //implement here
        int pivot = array[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;


        return list;
    }

    public int[] heapSort(int[] array) {

        //implement here
        int n = array.length;


        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);


        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;


            heapify(array, i, 0);
        }
        return array;
    }


    void heapify(int array[], int n, int i) {
        int[] list = array;
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;


        if (l < n && array[l] > array[largest])
            largest = l;


        if (r < n && array[r] > array[largest])
            largest = r;


        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;


            heapify(array, n, largest);
        }

    }

    public int[] bucketSort(int[] array, int MaxVal) {
        int[] list = array;
        //implement here
        list = new int[MaxVal + 1];
        int[] sortedNums = new int[array.length];
        for (int i = 0; i < array.length; i++)
            list[array[i]]++;
        int outPos = 0;
        for (int i = 0; i < list.length; i++)
            for (int j = 0; j < list[i]; j++)
                sortedNums[outPos++] = i;
        return sortedNums;
    }

    static int[] max_value(int[] array) {
        int max_value = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > max_value)
                max_value = array[i];

        return array;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here
        int n = array.length;


        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i += 1) {

                int temp = array[i];


                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];


                array[j] = temp;
            }
        }


        return list;
    }
}
