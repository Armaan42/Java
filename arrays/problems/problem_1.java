package problems;

import java.util.Scanner;

/*
    Given a list of overs, and numbers of runs scored in each over. So your task is to complete the total runs scored between [L,R]. You will be multiple queries(Q) each query containing two numbers [L,R].
    You have to find how many runs were scored in the overs starting from starting from L till R.

    And i want to see the total runs on the leadership board after each over.

    10-Over Match

    Indexes -> 0 1 2 3 4 5  6  7 8 9
    Runs    -> 8 5 3 2 6 20 12 9 4 11

            e.g => How many runs scored in 1 to 3

            L - R ( 1 - 3)

            runs scored = 5 + 3 + 2 = 10 runs
*/

public class problem_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] runs = new int[10];
        int totalruns = 0;

        for(int i=0; i<10; i++){ //0-based indexing
            System.out.print("Enter the runs of " + i + " over: ");
            runs[i] = sc.nextInt();
            totalruns += runs[i];
            System.out.println("Total runs after over " + i + " is " + totalruns);
            System.out.println();
        }

        System.out.print("Enter the lower over: ");
        int L = sc.nextInt();

        System.out.print("Enter the highest over: ");
        int R = sc.nextInt();
        
        int sum = 0;
        for(int i=L; i<=R; i++){
            sum = sum + runs[i];
        }
            
        System.out.println("Total runs scored from over " + L + " to " + R + " is " + sum);
        sc.close();
    }
}
