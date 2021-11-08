import java.io.IOException;

class One extends Thread{
    @Override
    public void run() {
        //arr- write 5
        System.out.println("One");
        for(int i=1;i<=1000000;i++){
            System.out.println(i);
        }
    }
}

class Two extends Thread{
    @Override
    public void run() {
        //arr- write 6
        System.out.println("Two");
        for(int i=1000000;i>=1;i--){
            System.out.println(i);
        }
    }
}

public class MultithreadingExample2 {
    //1-10
    //10-1
    public static void main(String[] args){
        One one = new One();
        Two two = new Two();

        //one.setPriority(10);//print first
        //two.setPriority(1);//print later
        one.start();
        try {
           one.sleep(5000);
        }
        catch(InterruptedException e){
            //procees 1
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            //process 2
            System.out.println(e.getMessage());
        }
        finally {
            //process 1
        }
        two.start();
    }
}
