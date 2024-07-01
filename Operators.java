class Operators {
    public static void main(String[] args){
        // Arithmetic Operators: +, -, *, / , %, ++, --
        int x = 10;
        int y = 13;
        System.out.println(x+y);

        // Assignment Operators
        String name = "Pramod";
        System.out.println("The value assigned to the variable name is " + name);

        // Comparision Operators: >, <, >=, <=, ==, !=
        int a = 10;
        int b = 20;
        System.out.println("Is a greater than b? " + (a > b));

        // Logical Operators: And(&&), OR(||), Not(!)
        int numberOne = 10;
        int numberTwo = 20;
        System.out.println(numberOne == 10 && numberTwo == 20);
        System.out.println(numberOne == 10 || numberTwo == 10);
        System.out.println( !(numberOne == 10));
    }
}