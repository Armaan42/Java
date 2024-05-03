package arrays;

import java.util.*;

public class arrayListUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the length: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Enter the " + i + " element: ");
            Integer num = sc.nextInt();
            arr.add(num);
        }

        for(Integer x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
