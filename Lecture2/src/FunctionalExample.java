@FunctionalInterface
interface sample1{
    public int say(String name, String address);
}

public class FunctionalExample {
    //uses
    //1.provide impl
    //2.less coding
    public static void main(String[] args){
        sample1 sample1=(name, address)->{
            //api call
            //sys out
            return 1;
        };
        int output = sample1.say("naveen", "blore");
        System.out.println(output);

    }
}
