class TypeCasting {
    public static void main(String[] args){
        // Type casting: Widening(smaller to bigger) and Narrowing(bigger to smaller)
        
        // Widening Casting
        byte age = 12;
        int newAge = age;

        int number = 98;
        double newNumber = number;

        System.out.println(newAge);
        System.out.println(newNumber);

        // Narrowing Casting
        float percent = 98.7F;
        int newPercent = (int)percent;

        double pieValue = 3.14132;
        byte newPie = (byte) pieValue;

        System.out.println(newPercent);
        System.out.println(newPie);


    }
}