package arrays;

import java.util.ArrayList;

public class wrapperClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;

        ArrayList<Integer> a = new ArrayList<>();

        //Wrapper class - Integer
        //              - Character
        //              - Boolean
        //              - Long
        //              - Float
        //              - Short
        //              - Byte
        //              - Double

        a.add(x);
        a.add(y); //adding liks this thing is called autoboxing

        a.add(10);
        a.add(10);
        a.add(20);
        a.add(30);

        for(Integer z : a){
            System.out.print(z + ",");
        }

        System.out.println();
        a.remove(2);

        for(Integer z : a){
            System.out.print(z +",");
        }
    }
}
