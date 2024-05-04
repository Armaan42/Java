import java.util.Scanner;

public class linear_search {

    public static int LS(int arr[], int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key you want to searh: ");
        int key = sc.nextInt();

        int result = LS(arr, n, key);
        System.out.println("Key found at index " + result);


        sc.close();
    }
    
}
