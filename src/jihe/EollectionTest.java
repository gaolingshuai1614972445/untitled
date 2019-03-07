package jihe;

import java.util.*;
import java.util.logging.Handler;

public class EollectionTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ads");
        list.add("sadsa");
        list.add("asd");
        list.add("abc");
        list.add("abc");
        list.get(0);//取出
        System.out.println(list.get(1));
       System.out.println("--------------------");

        list.forEach(System.out::println);//lambda表达式遍历集合
        for (String s : list)           //foreach循环来遍历集合
            System.out.println(s);
        Iterator<String> it = list.iterator();//取到一个集合上的迭代器用于遍历集合
        while (it.hasNext())//hasNaxt尝试跨过一个元素，如果能跨过去意味这个元素存在
            System.out.println(it.next());//nest 把刚才跨过去的元素取出来
        //Arrays.sort(list); Array是数组的反射类，Arrays是操纵数组的一些工具集合
        //Collection是所有集合的父接口 ，Collections是操纵集合的一些工具
        //foreach循环在后台实际上就是迭代器来完成的

        /*Collection接口下面的三大接口：
        1.List接口：允许重复元素，元素有下标（有序）
            1.1实现类LinkedList：在开头和结尾插入和删除元素较快，查询较慢
            1.2实现类ArrayList:查询较快，但是插入和删除较慢
        2.set接口：不允许重复元素,元素无下标（无序）
            2.1实现类HashSet:速度快，元素之间完全无顺序
            2.2实现类TreeSet：速度较HashSet慢，但是元素是排序的
            2.3实现类LinkedHashSet:速度快，元素之间按照插入的顺序，有顺序
        3.Queue接口：一种特殊的先进先出的结构
            3.1双端队列
            3.2优先级队列
        4.Stack:一种特殊的后进先出结构
         */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("asds");//在最后一个位置插入
        linkedList.addFirst("asaasa");//在第一个位置插入
        linkedList.addLast("ASSAD");//在最后一个位置插入
        linkedList.forEach(System.out::println);
        linkedList.removeFirst();//删除第一个元素
        linkedList.removeLast();//删除最后一个元素
        linkedList.forEach(System.out::println);

        HashSet<Integer> set = new HashSet<>();//HashSet 不保证有顺序   TreeSet:有顺序   LinkedHashSet 按着插入顺序，有重复只写一次
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(7);
        set.add(1);
        set.forEach(System.out::println);

        Queue<Integer> queue = new ArrayDeque<>();//双端队列
        //优先级队列：PriorityQueue   从小到大
        queue.offer(3);//元素放入队列
        queue.offer(4);
        queue.offer(4);
        System.out.println(queue.peek());//查看队列的第一个元素（不取出）
        System.out.println(queue.poll());//取出队列的第一个元素（出队列）
        queue.forEach(System.out::println);

        Stack<Integer> stack = new Stack<>();
        stack.push(8);//将元素压入堆栈（入栈）
        stack.push(5);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack.pop());//将栈顶元素弹出堆栈（弹栈，出栈）
        Map<String,Integer>map=new HashMap<>();
        /*TreeMap 是按照Key有序来排序的
        LinkedHashMap是按照插入顺序有序的
        HashMap是无序的
         */
        map.put("tom",10);
        map.put("jerry",6);
        //Map的Key建是不允许重复，值是最后一次放入的建所对应的
        //Map的key虽然不允许重复，但值的确允许重复的
        //Set中的元素也是不允许重复的
        System.out.println(map.get("tom"));
        System.out.println(map.get("jerry"));
        Set<String>keys=map.keySet();
        /*keySet方法的作用是将map

         */
        Set<String>keys1 =new HashSet<>(keys);
        keys.add("aaa");
        List<Integer>list1=new ArrayList<>();
        list1.add(8);
        Set<String>keys2 = new HashSet<>(list);
        for (String key :map.keySet()){
            System.out.printf("%-5s:%-3d",key,map.get(key));

        }
        System.out.println();
        map.forEach((k, v)->System.out.printf("%-5S:%-3d",k,v));

    }

}
