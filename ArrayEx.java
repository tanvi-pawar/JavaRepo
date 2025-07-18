 class ArrayEx{
 
 public static void main(String[] args) {
     
 
 

 int[] arr = {2, 3, 4, 5, 6};

        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n--- Calculations ---");
        System.out.println("Total Sum: " + getTotalSum(arr));


    }


     public static int getTotalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

}