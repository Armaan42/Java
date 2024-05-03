package Functions;

import java.util.Scanner;

public class functionWithArguments {
    public static void Add(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Add(a,b);
        sc.close();
    }
    
}