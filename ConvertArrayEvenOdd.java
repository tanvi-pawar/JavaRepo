public class ConvertArrayEvenOdd {

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to convert a number to even (if it's odd, just add 1)
    public static int toEven(int num) {
        return (num % 2 == 0) ? num : num + 1;
    }

    // Method to convert a number to odd (if it's even, just add 1)
    public static int toOdd(int num) {
        return (num % 2 != 0) ? num : num + 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 6, 2, 7}; // Sample array

        int evenCount = 0, oddCount = 0;

        // Count even and odd
        for (int num : arr) {
            if (isEven(num)) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Decide conversion type
        boolean convertToEven;

        if (evenCount > oddCount) {
            convertToEven = true;
        } else if (oddCount > evenCount) {
            convertToEven = false;
        } else {
            convertToEven = isEven(arr[0]); // If equal, follow first element
        }

        // Convert array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = convertToEven ? toEven(arr[i]) : toOdd(arr[i]);
        }

        // Display updated array
        System.out.println("Converted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
