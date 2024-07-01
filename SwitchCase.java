class SwitchCase {
    public static void main(String[] args ){
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Its Monday");
                break;
            case "Tuesday", "Wednesday":
                System.out.println("Working days of the week");
                break;
            case "Thursday", "Friday":
                System.out.println("Good Days");
                break;
            case "Saturday", "Sunday":
                System.out.println("Holidays");
                break;
            default:
                System.out.println("Enter a valid day");
        }
    }
}