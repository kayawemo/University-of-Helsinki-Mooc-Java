
import java.util.Arrays;


public class MainProgram {

    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here

        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallestIndexInTable = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[smallestIndexInTable] > table[i]) {
                smallestIndexInTable = i;
            }
        }

        return smallestIndexInTable;

    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here

        int holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;

    }

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }

}
