package G泛型;

import java.util.ArrayList;

public class PairTest1 {
    public static void main(String[] args) {
        class Employee {
        }

        class  User <T extends  Cloneable>{
        //    类型限定：自定义泛型类自定义泛型方法
        }



        //通配泛型：通配泛型一定带？
        Pair<? extends Number> num1 = new Pair<Integer>();
        //<子类extends 父类>
        Pair<? super  Number> num2 = new Pair<Object>();
        //<父类 super 子类>
        Number number = 1;
        ArrayList list1 = new ArrayList<Employee>();
        ArrayList list2 = new ArrayList<Number>();
    }
}
