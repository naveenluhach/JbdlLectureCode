class Sample extends Thread{
    //steps
    //class extends Thread Class
    //implement the run method

    @Override
    public void run() {
        //business code will be here
        //I was calling a API which was getting some data and writing this data to some index.
        System.out.println("Thread is running");
    }
}

public class MultithreadingExample{

  public static void main(String[] args){
      Sample sample = new Sample();//create the object of Thread via child class
      sample.start();
      System.out.println(sample.getState());
      sample.stop();
      System.out.println(sample.getState());
      System.out.println(sample.getName());
  }

}
