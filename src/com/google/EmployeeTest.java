package com.google;

import java.time.LocalDate;
import java.util.Arrays;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
//        new Employee();//无参构造器构造的对象（匿名对象）
//        System.out.println(new Employee());

        staff[0] = new Employee("carl", 750000, LocalDate.of(1997, 8, 24));
        staff[1] = new Employee("carl", 750000, LocalDate.of(1997, 8, 24));
        staff[2] = new Employee("carl", 750000, LocalDate.of(1997, 8, 24));
        //new  后面调的都是构造器，用来创建对象

        for (int i = 0; i < staff.length; i++)
            System.out.println(staff[i]);
        System.out.println("-------------------------------------------");
        for (Employee e : staff)
            e.raiseSalary(5);




//for(类型 任意的变量名 ： 数组或集合名 ForEach循环
        System.out.println("-------------------------------------------");

        Arrays.stream(staff).forEach(System.out::println);
    }
}