package cd.rr.objects;

public class Read {

    public static void main(String[] args) {

        // Read 8
        Dog myDog = new Dog("Mixed", 3, "White", "Gracie");
// Dog is class name, myDog is object name, new is keyword to create object and Dog() is the constructor.
        // breed, age, color, name are the properties

        //Read 9
        System.out.println(myDog.age);
        // getting value of object myDog's age which will be 3

        // Read 10
        System.out.println(myDog.getAge());
        //Calling get method on myDog object to get Age

        // Read 11
        myDog.age = 6;
// Defining age property of myDog object as 6
        // Read 12
        myDog.setAge(4);
// Changing Age to 4 through setter method
        // Read 13
        myDog.bark();
// calling bark method using object myDog
    }

}
