

import java.util.*;

public class pair_add_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the length: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Enter the " + i +" element: ");
            Integer num = sc.nextInt();
            arr.add(num);
        }

        System.out.print("Enter the sum of which you find the combination of: ");
        int targetsum = sc.nextInt();

        boolean found = false;
        
        for(int i=0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                if(arr.get(i) + arr.get(j) == targetsum){
                    System.out.println("Pair found at (" + arr.get(i) + "," + arr.get(j) + ")");
                    found = true;
                }
            }
        }

        if(!found){
            System.out.println("No pair found");
        }

        sc.close();
    }
}
