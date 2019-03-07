public class Gao11 {
    //JAVA中的参数用于给方法传递值
    int foo(int i,double d) {
        //参数格式；类型 变量名
        //多个参数用逗号分开，这些参数叫做形式参数
        //形式参数可以被认为是在方法中的变量
        System.out.println("foo:"+i+d);
//        System.out.println("foo");
//        System.out.println("foo");
//        System.out.println("foo");
        return 1;//带返回值的方法必须写retrun

    }
void  goo () {
        System.out.println("foo");
        return;//可选
}

    public static void main(String[] args) {
        Gao11 t = new Gao11();
        //带返回之的方法可以被当作一个常量使用
        int i  = t.foo(1,2);//带返回值
        t.foo(3,2);
        System.out.println(t.foo(1,1));
        //不带返回值的方法只能用于调用，即t.goo():
    }

    }
