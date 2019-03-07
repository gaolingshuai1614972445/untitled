package gao;

public interface Myinterface {
   // 接口中的内容默认都是公有的，（但是静态方法可以是私有的）
   public static final int i = 0 ;
   //一个接口当中不能放变量，只能公有的静态的常量,(public static final)
   public  abstract void  foo();
   //公有的抽象的方法，默认的(public abstract)
    //接口不能有对象，不能被NEW，不能放构造器，构造块，静态块都不能放

       public static  void  g (){
           System.out.println();
         //静态方法可以是公有的也可以是私有的，默认是公有的
     }
     default  void  h(){
           System.out.println("hhhhhhhhhhhhhhhhh");
         //默认方法
     }
}
