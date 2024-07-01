class StringMethods {
    public static void main(String[] args) {
        // String Methods

        // Finding length
        String name = "Pramod";
        int length = name.length();
        System.out.println("The length of the string is " + name.length());
        System.out.println(length);

        // To uppercase()
        String country = "india";
        System.out.println(country.toUpperCase());

        // To lowercase()
        String city = "Hyderabad";
        String state = "TELANGANA";
        System.out.println("The lowercased string is " + city.toLowerCase());
        System.out.println("The lowercased string is " + state.toLowerCase());

        // Finding a charecter in a string
        String story = "Once upon a time in  a forest, there was a boy named Mogli";
        System.out.println("The index of Mogli is " + story.indexOf("Mogli"));
    }
}