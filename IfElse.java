import java.util.Scanner;
class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.println(name + "This is from ");
        // name = "Pramod";
        if (name.equals("Pramod")) {
            System.out.println("Good Morning Pramod");
        } 
        else if (name == "Saatvik") {
            System.out.println("Good Morning Saatvik");
        } 
        else if (name == "Aaron") {
            System.out.println("Good Morning Aaron");
        } 
        else if (name == "Aditya") {
            System.out.println("Good Morning Aditya");
        } 
        else {
            System.out.println("Enter a valid name ");
        }

    }
}