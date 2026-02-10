// John Chiero
// 2/9/2026
// Main class for my Main objects.

public class Main {
    public static void main(){
        // A1: Create a Dog with no constructors defined.
        Dog dog1 = new Dog();

        // A2: Print the object directly.
        System.out.println("\nPrinting dog1 directly:");
        System.out.println(dog1);

        Dog d1 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + d1.getName());   // expected: null
        System.out.println("age = " + d1.getAge());     // expected: 0
        System.out.println("breed = " + d1.getBreed()); // expected: null

        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        /*
        System.out.println("\nMutating public fields directly:");
        d3.age = 5;      // direct write
        d3.name = "Max"; // direct write
        System.out.println("After mutation, d3 = " + d3); // uses toString()
        */

        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);


        // A1: Create a Cat with no constructors defined.
        Cat cat1 = new Cat();

        // A2: Print the object directly.
        System.out.println("\nPrinting cat1 directly:");
        System.out.println(cat1);

        Cat c1 = new Cat();
        System.out.println("\nDefaults for c1 fields (before any assignment):");
        System.out.println("name = " + c1.getName());                   // expected: null
        System.out.println("clawsTrimmed = " + c1.getClawsTrimmed());   // expected: false
        System.out.println("eyeColor = " + c1.getEyeColor());           // expected: null

        Cat c2 = new Cat(); // uses default constructor values
        System.out.println("\nc2 after default constructor:");
        System.out.println("name = " + c2.getName() + ", clawsTrimmed = " + c2.getClawsTrimmed() + ", eyeColor = " + c2.getEyeColor());

        Cat c3 = new Cat("Blue", false, "Blue"); // uses parameterized constructor
        System.out.println("\nc3 after parameterized constructor:");
        System.out.println("name = " + c3.getName() + ", clawsTrimmed = " + c3.getClawsTrimmed() + ", eyeColor = " + c3.getEyeColor());

        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        System.out.println("\nMutating via setters after making fields private:");
        c3.setClawsTrimmed(true);
        c3.setName("Maverick");
        c3.setEyeColor("Green");
        System.out.println("c3 clawsTrimmed via getter = " + c3.getClawsTrimmed());
        System.out.println("c3 now = " + c3);
    }
}