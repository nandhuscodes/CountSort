import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    static void countSort(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] countArray = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        int[] sortedArray = new int[array.length];
        int indexOfSortedArray = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[indexOfSortedArray++] = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = sortedArray[i];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        countSort(A);
        System.out.println(Arrays.toString(A));
    }
}
