import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args){
        List<String> names = new LinkedList<>();
        names.add("Naveen");//
        names.add("Joshua");//
        names.add("Ram");//
        names.add("abcd");//
//        int count = 0;
//        for(String name : names){
//            if(name.length()>4){
//                count++;
//            }
            // map(x->x*x)
//        }

       // System.out.println(count);
        //creation of stream, intermediate operations and terminal operations
        //long count = names.stream().filter(str->str.length()>4).count();
        //System.out.println(count);
        //iterate and print

        Stream.iterate(1, count->count+1).filter(number->number%2==0).limit(5).forEach(num->System.out.print(num+" "));
        //output:  2 4 6 8 10

        //concat 2 streams
        List<String> address = Arrays.asList("Delhi", "Mumbai", "Chennai");

        //
        Stream<String> output =  Stream.concat(names.stream(), address.stream());
        //output.forEach(str->System.out.print(str+" "));

        //s->s.replace("/+", "")
        Stream<String> outputStr = Stream.concat(names.stream(), address.stream());

        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> sqrNums = nums.stream().map(x->x*x).collect(Collectors.toList());

    }
}
