

import java.util.*;

public class twoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        ArrayList<Integer> row0 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(5,6,7));

        a.add(row0);
        a.get(0).add(12);
        a.add(row1);
        System.out.println(a.get(1).get(1));

        //iteration
        for(int i=0; i<a.size(); i++){

            // System.out.println(a.get(i));

            // for(int x : a.get(i)){
            //     System.out.print(x +" ");
            // }

            for(int j=0; j<a.get(i).size(); j++){
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

