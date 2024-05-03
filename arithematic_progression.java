import java.util.Scanner;

public class arithematic_progression {

    public static void AP(int first_term, int commom_difference, int terms){

        System.out.print("Arithematic Progression: ");
        System.out.print(first_term + " ");


        for(int i=1; i<terms; i++){
            int term = first_term + i * commom_difference;
            System.out.print(term + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term: ");
        int first_term = sc.nextInt();

        System.out.print("Enter the common difference: ");
        int commom_difference = sc.nextInt();

        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        AP(first_term, commom_difference, terms);

        sc.close();
    }
    
}
