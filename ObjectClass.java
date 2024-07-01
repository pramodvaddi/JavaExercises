class Animal {
    String breed;
    int age;

}

class Human {
    String name;
    int birthYear;

    // creating a constructor for class Human
    Human() {
        name = "Pramod";
        birthYear = 1990;
    }
}

// Parametarised constructors

class Insect {
    String origin;

    Insect(String country) {
        this.origin = country;
    }
}

// Copy Constructor

class Bird {
    String birdType;

    Bird(Bird copy){
        this.birdType = copy.birdType;
    }
}


class ObjectOriented {

    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.breed = "St Bernard";
        dog.age = 6;
        System.out.println("I am having a dog named Jimmie and he is a "+ dog.breed);
        System.out.println("Jimmie is " + dog.age + " Years old");


        Human person = new Human();
        System.out.println("The person name is "+ person.name);

        Insect bug = new Insect("India");
        System.out.println("This insect is found in some parts of " + bug.origin);

       

    }
}