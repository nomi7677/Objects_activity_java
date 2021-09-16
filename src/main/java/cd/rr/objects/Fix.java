package cd.rr.objects;

public class Fix {

    public static void main(String[] args) {

        // Fix 1
        Dog doggy;
        doggy.age = 4;
        doggy.breed = "Beagle";
        System.out.println("Doggy's breed is " + doggy.breed);

        // Fix 2
        Dog myDog = new Dog();
        myDog.gender = "Male";

        // Fix 3
        Dog yourDog = new Dog();
        Dog yourDog = new Dog();

        // Fix 4
        Dog dog1 = new Dog();
        dog1.name = "Spot";

        Dog dog2 = new Dog();
        dog1.name = "Fluffy";

        Dog dog3 = new Dog();
        dog1.name = "Chloe";

        // Fix 5
        Dog doggo = new Dog();
        System.out.println(doggo.name);

    }



}

class FixExample {

    int numberOfFixes;

    // Fix 6
    void FixExample(){
        System.out.println("TODO: Implement Constructor");
    }

    // Fix 7
    void setNumberOfFixes(int numberOfFixes){
        numberOfFixes = numberOfFixes;
    }

}

// Fix 8
void fixMe(){
    System.out.println("I need fixin'");
}
