import java.util.Arrays;

public class SelectionSortUsingRecursion {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        AscSelectionSortRecursive(arr, 0);

        System.out.println("Ascending Sorted array:");
        System.out.println(Arrays.toString(arr));

       

        DecSelectionSortRecursive(arr, 0);

        System.out.println("Descending Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
  

 

   
    public static void AscSelectionSortRecursive(int[] arr, int start) {
        if (start >= arr.length - 1) {
            return;
        }

        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

     
        int temp = arr[minIndex];
        arr[minIndex] = arr[start];
        arr[start] = temp;

        
        AscSelectionSortRecursive(arr, start + 1);
    }

     

   public static void DecSelectionSortRecursive(int[] arr, int start) {
        if (start >= arr.length - 1) {
            return;
        }

        int maxIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

       
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[start];
        arr[start] = temp;
 
 
        
        DecSelectionSortRecursive(arr, start + 1);
    }
}
