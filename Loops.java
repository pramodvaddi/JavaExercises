class Loops {
    public static void main(String[] args) {
        // For loop
        for(int i = 0; i <= 5; i++) {
            for(int x = 0; x < 5; x++) {
                System.out.println("Inner loop " + x);
            }
            System.out.println("Outer loop "+ i);
        }

        // While loop
        int y = 0;
        while(y <= 10){
            System.out.println("This is while loop" + y);
            y++;
        }

        // Do while loop
        int b = 0;
        do {
            System.out.print("Good morning");
            b ++;

        }while (b > 10);
    }
}