package jihe;

import java.util.*;

public class dfdsd {
    public static void main(String[] args) {
        Collection<Integer>list =new ArrayList<>();
        ((ArrayList<Integer>) list).add(1);
        ((ArrayList<Integer>) list).add(2);
        ((ArrayList<Integer>) list).add(1);
        ((ArrayList<Integer>) list).add(9);
        ((ArrayList<Integer>) list).add(8);
        list.forEach(System.out::println);
        System.out.println("-----------------------------");
        for (Integer s:list)
            System.out.println(s);
        System.out.println("-------------------------------");
        Iterator<Integer> it=list.iterator();
//        while (it.hasNext())
//            System.out.println(it.next());
        it.forEachRemaining(System.out::println);
  System.out.println("----------");
  System.out.println(((ArrayList<Integer>) list).get(0));
  System.out.println("---------------");

        LinkedList<Integer>list1=new LinkedList<>();
        ((LinkedList<Integer>) list1).add(1);
        ((LinkedList<Integer>) list1).add(2);
        ((LinkedList<Integer>) list1).add(3);
        ((LinkedList<Integer>) list1).add(8);
        ((LinkedList<Integer>) list1).addFirst(9);
        ((LinkedList<Integer>) list1).addLast(3);
//      ((LinkedList<Integer>) list1).remove(0);
        list1.forEach(System.out::println);
        System.out.println("------------------------");
        for (Integer i:list1)
            System.out.println(i);
        System.out.println("-----------");
        Iterator<Integer>it1=((LinkedList<Integer>) list1).listIterator();
        while (it1.hasNext())
            System.out.println(it1.next());
        System.out.println("------------");
        System.out.println(((LinkedList<Integer>) list1).get(0));
        Set<Integer>list3=new HashSet<>();
        list3.add(1);
        list3.add(1);
        list3.add(5);
        list3.add(9);
        list3.add(3);
        for (Integer i:list3)
            System.out.println(i);
        list3.forEach(System.out::println);
        Iterator<Integer>it3=list3.iterator();
        while (it3.hasNext())
            System.out.println(it3.next());



    }
}
