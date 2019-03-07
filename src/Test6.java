import com.google.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

//public class Test6 {
//    public static void main(String[] args) throws CloneNotSupportedException {
//
//        User[] users = {};
//        Comparator<User> userSort = (o1, o2) -> {
//            if (o1.getId() > o2.getId()) return 1;
//            else if (o1.getId() == o2.getId()) return 0;
//            else return -1;
//        };
//        Runnable r  = () ->{};
//        //Java中的两大类型
//        //1.引用类型：类类型，数组类型，
//        //lambda的语法；（）->{ }
//        //lambda本质上是方法，（）是方法的参数，{}内是方法体
//        //由于Lambda本质上是方法，而方法的参数类型已经确定，所以（）内的参数不需要类型
//        Arrays.sort(users, userSort);
//        Lambda l = (num1,num2)->{
//            System.out.println(num1+num2);
//            return 0 ;
//            //lambda表达式其实就是一个方法。
//            //接受这个表达式的必须是一个函数式接口（仅包含一个抽象方法的接口）
//            //所有的函数式接口都可以用来存放lambda表达式
//        };
//    }
////
//////public class  Test0{
////    void  f (final  int i ,double d) {
////        //lambda中使用的变量是不能被修改的
////        //i =  i+1;
//////        d = d + 1;
//////        double j = 1.1;
//////        Comparator c = (x, y) -> {
//////            System.out.println(j);
//////            return 0;
//////
////
////
////
////}
////
////public class  Test4 {
////    public static void main(String[] args) {
////        BinaryOperatorOerator<Integer>b = (o1,o2) -> {
////            return o1 + o2;
////        };
////        BiPredicate<Integer,Double> b1= (t,u)->t>u;
////        //lambda简化：
////        //参数只有一个时可以省略小括号
////        //方法体只有一句话时可以省略大括号
////        }
////
////    }
//}