package jihe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sadlj {
    public static void main(String[] args) {
        Map<String,Integer> list= new HashMap<>();
        list.put("tom",2);
        list.put("jerry",9);
        list.put("gao",8);
        Set<String>key=list.keySet();
//        key.add("ling");
        Set<String>key1=new HashSet<>(key);
        key1.add("ling");
        key1.forEach(System.out::println);

        for (String keys : list.keySet()) {//依次循环所有的键
            System.out.printf("%-5s: %-3d", keys, list.get(keys));
        }//forEach循环

    }
}
