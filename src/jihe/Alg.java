package jihe;

import java.util.*;

public class Alg {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        Collections.reverse(list);
        list.forEach(e->System.out.printf("%-3d",e));
        System.out.println();
        Collections.sort(list);
        list.forEach(e->System.out.printf("%-3d",e));
        System.out.println();
        Collections.shuffle(list);
        list.forEach(e->System.out.printf("%-3d",e));
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,1));
        System.out.println("-----------------");
        Set<Integer>keys1=new HashSet(list);
        keys1.forEach(System.out::println);
        Set<Integer>list3=new HashSet<>();
        list3.add(1);
        Map<String,Integer>map=new HashMap<>();
        map.put("tom",5);
        map.put("jerry",7);
        Set<String> keys=map.keySet();
        Set<String>keys8=new HashSet<>(keys);




    }
}
