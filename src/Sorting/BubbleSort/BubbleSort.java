package Sorting.BubbleSort;

public class BubbleSort {

    public static void main(String[] args) {

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

        for (int arrayLength = intArray.length - 1; arrayLength > 0; arrayLength--) {
            for (int i = 0; i < arrayLength; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
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
Sorted Array is : [ -171 -151 -141 -133 -121 -111 -98 -96 -91 -88 -84 -76 -71 -69 -62 -54 -51 -49 -45 -41 -31 -27 -21 -19 -15 -14 -13 -12 -11 -10 -7 -4 -1 0 1 2 6 7 9 12 15 18 23 23 28 31 32 37 40 44 49 50 51 56 65 67 69 71 77 80 89 93 96 100 112 114 131 132 133 151 169 171]
Time of Execution : 0.1208

 */
