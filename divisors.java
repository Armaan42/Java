import java.util.*;

public class divisors {

    public static void Divisors_or_not(long n){
        for(long i=1; i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long  n = sc.nextLong();

        Divisors_or_not(n);

        sc.close();
    }
}
