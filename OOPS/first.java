package OOPS;

class Dog{
    String name;
    String breed;
    int age;

    void introduce(){
        System.out.println("Hi, my name is " + name);

        if(age > 0){
            System.out.println("I am " + age + " years old.");
            System.out.println("");
        }
    }

    int getAge(){
        return age;
    }

    Dog(){
        System.out.println("Making a dog constructor");
    }
    
    Dog(String n, String b, int a){
        System.out.println("Making a dog object - parameterized constructor");
        name = n;
        breed = b;
        age = a;
    }
}

public class first {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Bruto";
        d1.breed = "Lebra";
        d1.age = 6;

        Dog d2 = new Dog("Cruto", "shephard", 2);
        
        // Dog d2 = new Dog();
        // d2.name = "Mono";
        // d2.breed = "shephard";
        // d2.age = 3;

        d1.introduce();
        d2.introduce();

        System.out.println(d1.name + " fighting with " + d2.name);
        
        System.out.println(d1.getAge());
        System.out.println(d2.getAge());
    }
}




