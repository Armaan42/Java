package problems;

import java.util.Scanner;

public class problem_2_using_prefix_sum_method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefixsum = new int[n];

        //input array element
        for(int i=0; i<n; i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }

        //calculate prefix sum
        prefixsum[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixsum[i] = prefixsum[i-1] + arr[i];
        }

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = prefixsum[j] - (i > 0 ? prefixsum[i-1] : 0);
                largest = Math.max(largest, sum);
            }
        }

        System.out.println("Largest sum of subarray is " + largest);
        sc.close();
    }
    
}
