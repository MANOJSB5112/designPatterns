package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static class CompareHelper implements Comparator<Integer>
    {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        CompareHelper helper=new CompareHelper();
        Collections.sort(l, helper);
        System.out.println(l);
    }
}
