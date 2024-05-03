package arrays;

import java.util.Scanner;

public class countElements {

    public static int check_count(int[] arr, int key) {
        
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();          
        }

        System.out.print("Enter the key to check: ");
        int key = sc.nextInt();

        int result = check_count(arr, key);
        System.out.println(result);

        sc.close();

    }
    
}
