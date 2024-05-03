import java.util.Scanner;

public class prime_number {

    public static int isPrime(int n){
        int count = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = isPrime(n);

        if(result == 2){
            System.out.println("Prime.");
        }
        else{
            System.out.println("Non-prime.");
        }

        sc.close();
    }
    
}
