package com.google;

import java.lang.reflect.*;
import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class cl= User.class;

//        Field[] fields = cl.getFields();//属性
//
//
//        System.out.println(Arrays.toString(fields));
//
//        System.out.println("------------------------------------------------------------");
//
//        fields = cl.getDeclaredFields();
//        for (Field field : fields)
//            System.out.println(field);
//        User tom = new User();
//        User jerry = new User();
//        Field id  =  cl.getField("id");
//        id.set(tom,1);
//        id.set(jerry,2);
//        Field name  = cl.getDeclaredField("name");
//        name.setAccessible(true);//打破私有界限
//        name.set(tom,"tom");
//        name.set(jerry,"jerry");
//        System.out.println(tom+"\n"+jerry);

//        User user = new User();
//        Method goo
//                =cl.getDeclaredMethod("goo",int.class,double.class);
//        goo.setAccessible(true);
//        goo.invoke(user,1,1.34);
//        Method foo = cl.getMethod("foo");
//        foo.invoke(user);
        Constructor constructorNoArgs = cl.getConstructor();
        User user = (User)constructorNoArgs.newInstance();
        System.out.println(user);
        Constructor constructor=
                cl.getConstructor(String.class,int.class,int.class);
        user = (User)constructor.newInstance("Tom",1,2);
        System.out.println(user);

    }
}
