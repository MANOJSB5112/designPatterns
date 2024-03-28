package LambdasAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Streams {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("Manoj","Soundarya","Chethan","Chandan","Chotu");

        List<Integer> collect = names.stream()
                .filter(name -> name.charAt(0) == 'C')
                .map(name -> name.length())
                .collect(Collectors.toList());
        System.out.println(collect);


    }


}
