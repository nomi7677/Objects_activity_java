package cd.rr.objects;

// Read 1
class Dog {
// defining class with name of Dog

    // Read 2
    String breed;
    int age;
    String color;
    String name;
    String gender;
// defining data types and instance variables without values
    // Read 3
    Dog(){}
// Creating default constructor with name of Dog

    // Read 4
    Dog(String breed, int age, String color, String name) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.name = name;
    }
// Defining Constructor with parameters, breed, age, color and name are the properties and
// then using this keyword to make instance variables equal to parameters.
    // Read 5
    int getAge() {
        return age;
    }
// Defining getter method to get value of Age
    // Read 6
    void setAge(int age) {
        this.age = age;
    }
// Defining setter method for age to set or update the value of age
    // Read 7
    void bark() {
        System.out.println("Woof!");
    }
// Bark method with null return value, prints Woof!.

    // Write 1
    // Write a setter for breed
 void setBreed(String breed){
       this.breed = breed;}

    // Write 2
    // Write a getter for breed
   String getBreed(){
     return breed;
 }

    // Write 3
    // Write a setter for color
    void setColor(String color){
             this.color = color;}

    // Write 4
    // Write a getter for color
 String getColor(){
       return color;}
    // Write 5
    // Write a setter for name
 void setName(String name){
     this.name =name;}
    // Write 6
    // Write a getter for name
 String getName(){
    return name;}



}
