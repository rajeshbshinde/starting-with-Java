package src.rajesh.programingbasics;

import java.util.*;

public class DataTypesInJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // List - Can be used as FIFO, can have duplicates. Element have indexes
        List<String> list = new ArrayList<>();
        list.add("Rajesh");
        list.add("Rakesh");
        list.add("Rajath");
        list.add("Rajesh");
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("Rajesh"));
        // Set - Can store only unique objects. No index to element.
        // It is sorted.
        Set<String> set = new HashSet<>();
        set.add("Raj");
        set.add("Rakesh");
        set.add("Abc");
        //set.add("Raj");
        System.out.println(set.size());
        if(set.contains("Raj")){
            System.out.println("Element present");
        }
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<Integer> intSet = new HashSet<>();
        intSet.add(10);
        intSet.add(9);
        intSet.add(1);

        Iterator<Integer> intItr = intSet.iterator();
        while(intItr.hasNext()){
            System.out.println(intItr.next());
        }
        Map<Integer,Integer> map = new HashMap<>();
//        List<Double> a = Arrays.asList(20,40,60,0,60,50,50,60.5);
        if(map.containsKey(10)){

        }
    }
}
