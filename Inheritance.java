class Father {
    String phone = "iPhone";

}

class Mother extends Father {
    String car = "Hyundai";

}

class Son extends Mother {
    int Grade = 4;
}

class Inheritance {
    public static void main(String[]args) {

        Father james = new Father();
        Mother lisa = new Mother();
        Son tim = new Son();


        System.out.println("Father is using an " + james.phone);
        System.out.println("Mother is using a " + lisa.car);
        System.out.println("Mother can also use fathers " + lisa.phone);
        System.out.println("Son is studying in Grade " + tim.Grade);
        System.out.println("Son can access both " + james.phone + " and " + lisa.car);


        
    }
}