package Sorting.SelectionSort;

public class SelectionSort {

    public static void main(String[] args){

        int[] intArray = {2, -11, 9, 23, 15, 6, -4, 7, 18, -31, 49, 37, -71, 56, -54, 67, 1, -19,
                12, -1, 69, 32, 51, 96, -14, 71, -13, 31, -49, 77, 0, 65, -45, -76, -51, -15,
                112, -10, 169, 132, -151, -96, 114, 171, -133, 131, -41, 40, 100, 89, 93, -84, -21, -88,
                -121, -12, -69, 23, 151, -7, -141, -171, 133, 28, 44, -27, 50, -98, -91, 80, -111, -62};

        System.out.print("Unsorted Array is : [");
        for (int i : intArray) {
            System.out.print(" "+i);
        }
        System.out.println("]");

        long startTime = System.nanoTime();

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i=1; i<=lastUnsortedIndex; i++) {
                if (intArray[i] > largest) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        long endTime = System.nanoTime();

        float timeElapsed = (float)(endTime - startTime)/1000000;

        System.out.print("Sorted Array is : [");
        for (int i : intArray) {
            System.out.print(" "+i);
        }
        System.out.println("]");

        System.out.println("Time of Execution : " + timeElapsed);
    }

    private static void swap(int[] array, int i, int j){
        if(i==j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


/*
OUTPUT :

Complexity : O(N^2)
Stable Sort.
In-Place Sort.

Unsorted Array is : [ 2 -11 9 23 15 6 -4 7 18 -31 49 37 -71 56 -54 67 1 -19 12 -1 69 32 51 96 -14 71 -13 31 -49 77 0 65 -45 -76 -51 -15 112 -10 169 132 -151 -96 114 171 -133 131 -41 40 100 89 93 -84 -21 -88 -121 -12 -69 23 151 -7 -141 -171 133 28 44 -27 50 -98 -91 80 -111 -62]
Sorted Array is : [ -11 -91 -10 -62 -7 -4 -151 -96 -31 -171 -111 -71 -121 -54 -41 -15 -19 -133 -1 -141 -27 -98 -84 -14 -21 -13 -88 -49 -12 0 -69 -45 -76 -51 2 1 9 23 15 6 7 18 49 37 12 56 67 69 32 51 23 96 71 31 28 77 65 112 169 132 40 114 171 44 131 100 89 50 93 151 133 80]
Time of Execution : 0.0793

 */