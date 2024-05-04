import java.util.Scanner;

public class binary_search {

    public static int BS(int arr[], int n, int key){
        int start = 0;
        int end = arr.length - 1;

        
        while(start < end){
            int mid = start + ( end - start ) / 2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }   

        System.out.print("Enter the key you want to search: ");
        int key = sc.nextInt();

        int result = BS(arr, n, key);

        if(result == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index " + result);
        }
        sc.close();
    }
}
