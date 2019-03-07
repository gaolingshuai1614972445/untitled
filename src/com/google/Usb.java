package com.google;

import java.io.Serializable;

public interface Usb extends Serializable {//Serializable 是系统自带的一个接口

//接口就是用来被继承或实现的
    //接口和接口之间可以进行继承或实现的
    //接口和类之间可以进行实现
    interface Bus {

        public abstract void foo();

        //接口中的方法修饰符都是public abstract ，即便不写也是
        public static final int a = 1;
        //接口中的属性都是public static final ，不写也是

        //以下两个语法点在JAVA 8中新添加
        public static void goo() {
            System.out.println("goo...............");

        }   //static 方法可以有实现（带方法体）静态的

        //static方法和类中的static方法一样，用接口名或类名调用即可
        public default void hoo() {
            System.out.println("goo...............");

            // default 方法可以有实现（带方法体）默认的
            //default方法和用实现了接口对象进行调用
            //该方法可以被覆盖
        }
    }
}
class  Test10 {
    public static void main(String[] args) {
        //Bus b = new Bus();接口不能产生对象
        //接口和抽象类在犹豫不决的情况下优先使用接口
        //接口是一个规范或者功能上的实现
        //抽象类侧重父子关系，在共有的功能上进行抽象
        //接口中不能有普通法方，也不能有变量
    }
}