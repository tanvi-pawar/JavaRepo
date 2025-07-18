public class RecursiveLinearSearch {

   
    public static int linearSearch(int[] arr, int target, int index) {
        
        if (index >= arr.length) {
            return -1;
        }

        
        if (arr[index] == target) {
            return index;
        }

        
        return linearSearch(arr, target, index + 1);
    }

    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 100;

        int result = linearSearch(arr, target, 0);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
