import java.util.*;

public class main {

    // Method to calculate the number of unique missed chapters
    public static int missedLectures(int numChapters, int b, int e) {
        Set<Integer> missed = new HashSet<>();

        for (int i = b; i <= e; i++) {
            missed.add(i % numChapters); // Use modulus to get the chapter taught on day i
        }

        return missed.size(); // Return the count of unique missed chapters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.println("Enter number of chapters:");
        int numChapters = sc.nextInt();

        System.out.println("Enter start day of absence (b):");
        int b = sc.nextInt();

        System.out.println("Enter end day of absence (e):");
        int e = sc.nextInt();

        // Calling the method and displaying result
        int result = missedLectures(numChapters, b, e);
        System.out.println("Total missed unique chapters: " + result);
    }
}