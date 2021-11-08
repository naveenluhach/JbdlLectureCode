public class Car {
    //Non-primitive data types : String, Array, Stack, Queue...
    //primitive : int, char, boolean...
    //fields
    String name;//ferrari
    String color;//1-red, 2-yellow,
    int max_speed;//300

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", max_speed=" + max_speed +
                '}';
    }

    //contructor
    Car(int max_speed){
       this.max_speed = max_speed;
    }

    //methods
    public void run(int speed){
        speed = 250;
        System.out.println("I can run at "+ speed + "kmph");
    }

    public static void main(String args[]){
        //consume this class
        Car car = new Car(200);
        car.max_speed = 200;
        System.out.println(car.toString());
        car.run(100);

        try{
            Class cls = Class.forName("Car");
            Class[] args1 = new Class[1];
            args1[0]=int.class;
            Car car1 = (Car) cls.getDeclaredConstructor(args1).newInstance(120);
            car1.run(123);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

}
