import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: ");
        System.out.print(first + " " + second +" ");

        for(int i=0; i<n; i++){
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;

        }

        sc.close();
    }
    
}
