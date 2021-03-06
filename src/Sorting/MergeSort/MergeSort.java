package Sorting.MergeSort;

public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = {2, -11, 9, 23, 15, 6, -4, 7, 18, -31, 49, 37, -71, 56, -54, 67, 1, -19,
                12, -1, 69, 32, 51, 96, -14, 71, -13, 31, -49, 77, 0, 65, -45, -76, -51, -15,
                112, -10, 169, 132, -151, -96, 114, 171, -133, 131, -41, 40, 100, 89, 93, -84, -21, -88,
                -121, -12, -69, 23, 151, -7, -141, -171, 133, 28, 44, -27, 50, -98, -91, 80, -111, -62};

        System.out.print("Unsorted Array is : [");
        for (int i : intArray) {
            System.out.print(" " + i);
        }
        System.out.println("]");

        mergeSort(intArray, 0, intArray.length);

        long startTime = System.nanoTime();

        for (int firstUnsortedIndex = intArray.length - 1; firstUnsortedIndex > 0; firstUnsortedIndex--) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

        long endTime = System.nanoTime();

        float timeElapsed = (float) (endTime - startTime) / 1000000;

        System.out.print("Sorted Array is : [");
        for (int i : intArray) {
            System.out.print(" " + i);
        }
        System.out.println("]");

        System.out.println("Time of Execution : " + timeElapsed);
    }

    private static void mergeSort(int[] input, int start, int end){

        if(end-start < 2){
            return;
        }

        int mid = (end + start)/2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end){

        if(input[mid-1]<=input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while(i<mid && j<end){
            temp[tempIndex++] = (input[i]<=input[j]? input[i++] : input[j++]);
        }

        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}

/*
OUTPUT :

Complexity : O[N(logN)]
Stable Sort.
Not In-Place Sort.

Unsorted Array is : [ 2 -11 9 23 15 6 -4 7 18 -31 49 37 -71 56 -54 67 1 -19 12 -1 69 32 51 96 -14 71 -13 31 -49 77 0 65 -45 -76 -51 -15 112 -10 169 132 -151 -96 114 171 -133 131 -41 40 100 89 93 -84 -21 -88 -121 -12 -69 23 151 -7 -141 -171 133 28 44 -27 50 -98 -91 80 -111 -62]
Sorted Array is : [ -11 -91 -10 -62 -7 -4 -151 -96 -31 -171 -111 -71 -121 -54 -41 -15 -19 -133 -1 -141 -27 -98 -84 -14 -21 -13 -88 -49 -12 0 -69 -45 -76 -51 2 1 9 23 15 6 7 18 49 37 12 56 67 69 32 51 23 96 71 31 28 77 65 112 169 132 40 114 171 44 131 100 89 50 93 151 133 80]
Time of Execution : 0.0024

 */
