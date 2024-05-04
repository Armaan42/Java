package problems;

import java.util.Scanner;

/*
    Given a array of size N, construct a prefix array where prefix[i] stores sum of all even indices values from [0,i]

                        (0)  (1)  (2)  (3)  (4)  (5)
    e.g., arr[6]       = 3,  -2,   4,   6,  -3,   5
          prefixarr[6] = 3,   3,   7,   7,   4,   4
 */


 public class problem_3 {
     public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in);
 
         System.out.print("Enter the size of array: ");
         int n = sc.nextInt();
 
         int[] arr = new int[n];
         int[] prefixsum = new int[n];
 
         for(int i = 0; i < n; i++){
             System.out.print("Enter the " + (i + 1) + " element: ");
             arr[i] = sc.nextInt();
         }
 
         // Construct the prefix sum array
         prefixsum[0] = arr[0];
         for(int i = 1; i < n; i++){
             prefixsum[i] = prefixsum[i - 1] + arr[i];
         }
 
         // Calculate the sum of even-indexed elements up to each index
         for(int i = 0; i < n; i++){
             int sum = 0;
             for(int j = 0; j <= i; j += 2){ // Only consider even indices
                 sum += arr[j];
             }
             prefixsum[i] = sum; // Update prefixsum[i] with the sum
         }
 
         // Print the prefix sum array
         System.out.println("Prefix Sum Array:");
         for(int i = 0; i < n; i++){
             System.out.print(prefixsum[i] + " ");
         }
 
         sc.close();
     }
 }
 