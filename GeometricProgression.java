import java.util.Scanner;

public class GeometricProgression {

    // Function to generate and print the elements of a geometric progression
    public static void printGeometricProgression(int firstTerm, int commonRatio, int numberOfTerms) {
        // Print the first term
        System.out.println("Geometric progression:");
        System.out.print(firstTerm + " ");

        // Generate and print the subsequent terms
        int term = firstTerm;
        for (int i = 1; i < numberOfTerms; i++) {
            term *= commonRatio; // Multiply the previous term by the common ratio
            System.out.print(term + " ");
        }
        System.out.println(); // Print a new line after printing all terms
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first term, common ratio, and number of terms
        System.out.print("Enter the first term: ");
        int firstTerm = scanner.nextInt();

        System.out.print("Enter the common ratio: ");
        int commonRatio = scanner.nextInt();

        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();

        // Generate and print the geometric progression
        printGeometricProgression(firstTerm, commonRatio, numberOfTerms);

        scanner.close();
    }
}
