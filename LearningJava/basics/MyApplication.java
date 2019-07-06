// This is my first application

public class MyApplication {

    public static void main(String agrs[]){
        System.out.println("Amrit: Hello World!!");
        Car nano = new Car("red","Tata-Namo");
        Car honda = new Car("blue","Honda");
        Car maruti = new Car("orange","Maruti");

        // Start all 3 car journy
        System.out.println("nano model is "+nano.getModel());
        nano.setModel("SomeNewModel");
        System.out.println("nano model is "+nano.getModel());
        nano.journy();
        honda.journy();
        maruti.journy();
 
    }

}