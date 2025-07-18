import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        AscSelectionSort(arr);

        System.out.println("Ascending Sorted array:");
        System.out.println(Arrays.toString(arr));

          DecSelectionSort(arr);

        System.out.println("DecendingSorted array:");
        System.out.println(Arrays.toString(arr));



    }

    public static void AscSelectionSort(int[] arr) {
        int n = arr.length;

       
        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    public static void DecSelectionSort(int[] arr) {
        int n = arr.length;

       
        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }                               
}
