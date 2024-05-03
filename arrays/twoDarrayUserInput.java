

import java.util.*;

public class twoDarrayUserInput {

    public static void printArray(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createArrayUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];

        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
            sc.close();
        }
        return arr;
  
    }

    public static void main(String[] args) {

        int[][] arr = createArrayUserInput();
        printArray(arr);

    } 
    
}
