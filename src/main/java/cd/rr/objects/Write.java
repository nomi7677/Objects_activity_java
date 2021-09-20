package cd.rr.objects;

public class Write {

    public static void main(String[] args) {

        // Write 7
        // Create a new dog named yourDog. It should have all the info on your dog. If you don't have one, use Scooby Dog
    Dog yourDog = new Dog();
    yourDog.name = "Scooby Dog";
    yourDog.breed = "Great Dane";
    yourDog.age = 5;
    yourDog.color="brown";

        // Write 8
        // Change your dog's name to Zeva
    yourDog.setName("Zeva");
        // Write 9
        // Change your dog's age to 12
    yourDog.setAge(12);
        // Write 10
        // Change your dog's breed to German Shepard
    yourDog.setBreed("German Shepard");
        // Write 11
        // Change your dog's color to Black Sable
    yourDog.setColor("Black Sable");
    }

}
