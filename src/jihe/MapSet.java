package jihe;

import java.util.*;

public class MapSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(88);
        list.add(101);
        list.add(12);
        list.add(100);

        System.out.println(list.get(1));

        Map<String, Integer> map = new HashMap<>();//所谓Set就是用Map做出来的，
        //Map<String,Integer> map = new TreeMap<>();
        //TreeMap是按照Key有序来排序的
        //LinkedHashMap是按照插入顺序来排序的
        //HashMap是无顺序的
        map.put("Tom", 1);
        map.put("Jerry", 2);
        map.put("Ben", 3);
        map.put("Ben", 5);
        map.put("Mark", 2);
        //Map的key键是不允许重复的，有重复的不会出错，但是最后放的会把前面的覆盖，但值确实是允许重复的
        //Set中的元素也是不允许重复的

        System.out.println(map.get("Tom"));
        System.out.println(map.get("Jerry"));
        System.out.println(map.get("Ben"));
        System.out.println(map.get("Mark"));
        System.out.println("---------------");


        Set<String> keys = map.keySet();
        //keys.add("zzzz");//是错的，没有这个方法
        //keySet的作用是把map映射中所有的键都拿出来作一个Set
        //但这个Set并不是java.util.Set中的，而是class KeySet
        //KeySet实际上是实现了Set接口，但是其中大部分都是抛异常的

        Set<String> keys1 = new HashSet<>(keys);
        //把keys加到keys1里面，直接在后面括号里写keys，或者写for循环
//        for (String key : keys)
//            keys1.add(key);
        keys1.add("sss");

        //将一个List集合中的重复元素去掉
        //ArrayList里面是可以有重复元素的，Set里是没有重复元素的，所以一提到去重就要想到Set（面试题）
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);

        Set<Integer> keys2 = new HashSet(list1);
        keys2.forEach(System.out::println);
        list1.forEach(System.out::println);


        for (String key : map.keySet()) {//依次循环所有的键
            System.out.printf("%-5s: %-3d", key, map.get(key));
        }//forEach循环

        System.out.println();
    }
}
