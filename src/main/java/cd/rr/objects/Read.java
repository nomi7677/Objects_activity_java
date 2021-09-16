package cd.rr.objects;

public class Read {

    public static void main(String[] args) {

        // Read 8
        Dog myDog = new Dog("Mixed", 3, "White", "Gracie");

        //Read 9
        System.out.println(myDog.age);

        // Read 10
        System.out.println(myDog.getAge());

        // Read 11
        myDog.age = 6;

        // Read 12
        myDog.setAge(4);

        // Read 13
        myDog.bark();

    }

}
