package cd.rr.objects;

public class Fix {

    public static void main(String[] args) {

        // Fix 1
        // object was missing in line 9. i created it later
        Dog doggy = new Dog();
        doggy.age = 4;
        doggy.breed = "Beagle";
        System.out.println("Doggy's breed is " + doggy.breed);

        // Fix 2
        // gender property was missing in Dog class.
        Dog myDog = new Dog();
        myDog.gender = "Male";

        // Fix 3
        // can't have 2 same name for object creation so i changed 1 name
        Dog yourDog = new Dog();
        Dog yourDog1 = new Dog();

        // Fix 4
        //called all properties for same object dog1 so changing as per object name
        Dog dog1 = new Dog();
        dog1.name = "Spot";

        Dog dog2 = new Dog();
        dog2.name = "Fluffy";

        Dog dog3 = new Dog();
        dog3.name = "Chloe";

        // Fix 5
        //variable is not defined but called for print statement
        Dog doggo = new Dog();
        doggo.name="Lucy";
        System.out.println(doggo.name);

    }

}

class FixExample {

    int numberOfFixes;
    FixExample(){

    }

    void FixExample1() {
        System.out.println("TODO: Implement Constructor");
    }

    // Fix 7
    void setNumberOfFixes(int numberOfFixes){
        this.numberOfFixes = numberOfFixes;
    }

}

// Fix 8
void fixMe(){
    System.out.println("I need fixin");
}
}