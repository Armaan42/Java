package strings;

public class first {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = b;

        if(a==b && b==c && a==c){
            System.out.println("They are equal");
        }
        else{
            System.out.println("Not equal");
        }

        System.out.println(a);
        System.out.println(a.length());

        //one more way to create a string

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        if(s1 == s2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        // in this above case s1 and s2 have different memory location despite having same values or not

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Hello"));

        System.out.println(s1.charAt(0));

        // you cannot modify the original string but you can modify it by converting it into char array and then modify it

        char arr[] = s1.toCharArray();
        arr[0] = 'B';
        System.out.println(arr);

    }
}