package problems;

import java.util.*;

/*
        Array containing N number, findout largest sum of array.

        e.g., arr = {1,2,3,4}
              i=0, j=0 [1] = 1
                   j=1 [1,2] = 2
                   j=2 [1,2,3] = 6
                   j=3 [1,2,3,4] = 10 // This is the Solution.

              i=1, j=1 [2] = 2
                   j=2 [2,3] = 5
                   j=3 [2,3,4] = 9

              i=2, j=2 [3] = 3
                   j=3 [3,4] = 7

              i=3, j=3 [4] = 4
 */
public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the " + i + " element: ");
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                    sum = sum + arr[j];
                if(sum > largest){
                    largest = sum;
                }
            }
        } 

        System.out.println("Largest sum of subarray is " + largest);
        sc.close();
    }
}
