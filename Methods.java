class Methods {
    public static void main(String[] args) {
        // Methods / Functions

        // Method calling area
        addition(2,3);

        String greeting = greet("Pramod");
        System.out.println(greeting);

        drivingEligibility(20);

        System.out.println(add(2,4));
        System.out.println(add(8.9,9.4));
        

    }
    // Method with parameter
    static void addition(int a, int b) {
        System.out.println(a + b);
    }

    // Method with return value
    static String greet(String name){
        return "Good Morning " + name;
    }

    // Method with if-condition
    static void drivingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You can drive");
        } else {
            System.out.println("you cannot drive");
        }
    }

    // Method Overloading

    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
   
}