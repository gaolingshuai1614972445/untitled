package jihe;

import java.lang.reflect.Array;
import java.util.*;

public class ListAndArray {
    public static void main(String[] args) {
        Integer[] arr= {1,2,3,4,5,6,7,8};
        List<Integer> list = Arrays.asList(arr);
        list.forEach(e ->System.out.printf("%-3d",e));
        System.out.println();
        List<Integer>list1=new ArrayList<>(list);
        list.add(9);
        list.forEach(e->System.out.printf("%-3d",e));



        Object[]arr1=list1.toArray();
        Arrays.stream(arr1).forEach(e->System.out.printf("%-3d",e));
        Integer[] arr2= list1.toArray(new Integer[0]);
        Arrays.stream(arr2).forEach(e->System.out.printf("%-3d",e));
        list1.subList(1,3).forEach(e->System.out.printf("%-3D",e));
        List<Integer>list2= Collections.unmodifiableList(list1);
    }
}
