abstract class Car1{
    Car1(){
        System.out.println("Car is created");
    }
    abstract void drive();
    void run(){
        System.out.println("Car is running");
    }
}

class Ferrari extends Car1{
    void drive(){
        System.out.println("Drive is added.");
    }
}

class Toyoto extends Car1{
    void drive(){
        System.out.println("Drive is added now.");
    }
}


public class AbstractionExample {

    public static void main(String[] args){
         Ferrari ferrari= new Ferrari();
         ferrari.drive();
         ferrari.run();
    }

}
