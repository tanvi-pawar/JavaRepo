
import java.util.Arrays;

class ArrayExample{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));

        int[] count = findCount(arr);
        String compare = "";
        if (count[0] == count[1])
            compare = arr[0] % 2 == 0 ? "EVEN" : "ODD";
        else
            compare = count[0] > count[1] ? "EVEN" : "ODD";

        System.out.println(compare);
        convert(arr, compare);
        System.out.println(Arrays.toString(arr));
    }

    public static void convert(int[] arr, String compare) {
        if (compare.equals("EVEN")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0)
                    arr[i] += 1;
            }
        } else {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == 0)
                    arr[j] += 1;
            }
        }
    }

    public static int[] findCount(int[] arr) {
        int[] count = new int[2];
        for (int ele : arr) {
            if (ele % 2 == 0)
                count[0]++;
            else
                count[1]++;
        }
        return count;
    }
}