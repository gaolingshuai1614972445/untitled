package com.google;

import java.util.Arrays;
import java.util.Comparator;
//Comparable接口用于指定对象排序的方法
//对象如果需要排序，比较等操作，必须实现该接口

public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
//    }
//
//    @Override
//    public int compareTo(User o) {
//        //return 负数表示当前对象比0小
//        //return 0 表示两个对象相等
//        //return 正数表示当前对象比0大
//        if(this.id>o.id) return  1;
//        else  if (this.id==o.id)return  0 ;
//
//        else return -1;


    }
    //Comparator接口用于指定对象排序的方法。但是又无法修改类源代码的情况，既不能用Comparable时

    static class UserOrder implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            if (o1.getId() > o2.getId())
                return 1;
            else if (o1.getId() > o2.getId())
                return 0;
            else return -1;
        }
    }

    static class Test {
        public static void main(String[] args) {
            User tom = new User(1, "tom");
            User ben = new User(3, "ben");
            User jerry = new User(2, "jerry");
            User[] users = {tom, ben, jerry};
            Arrays.sort(users,new UserOrder());
            Arrays.stream(users).forEach(System.out::println);

        }
    }
}