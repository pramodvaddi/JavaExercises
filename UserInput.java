import java.util.Scanner;

class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        System.out.println("The user age is " + age);

        // String input
        System.out.println("Enter your name ");
        String name = sc.next();
        System.out.println("The user name is " + name );

    }
}