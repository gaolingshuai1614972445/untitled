package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
        //数组长度固定，不便插入
        //动态数组
        List <Integer> list1 = new ArrayList<>();
        list1.add(1);//将数字1放入数组的第0个位置
        list1.add(10);//将数字10放入数组的第一个位置
        list1.add(9);//将数字9放入数组的第2个位置
        list1.forEach(System.out::println);
//        list1.remove(0);//删除第0个位置
        list1.forEach(e ->System.out.printf("%-3d",e));
        System.out.println("\n"+list1.get(0));
        list1.sort(Integer::compareTo); //排序
        Optional<Integer> max =//求出从最大值
                list1.stream().max(Integer::compareTo);
        System.out.println(max.get());//打印求出的值

    }

}
