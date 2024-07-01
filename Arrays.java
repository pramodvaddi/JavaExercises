class Arrays {
    public static void main(String[] args) {
        String[] countries = {"India", "USA", "UK"};
        System.out.println(countries[0]);
        
        // For each loop
        for(String i: countries){
            System.out.println(i);
        }

        // 2 D Array
        String[][] details = { {"Pramod", "Saatvik", "Aaron"}, {"India", "UK", "USA"} }; 
        System.out.println(details[0][0]);

     
    }
}