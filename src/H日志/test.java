package H日志;

public class test {
   void f(){
       System.out.println("111");
   }
    }

abstract class a extends test{
    @Override
    abstract void f();

    void g(){
        System.out.println("2222222222222222");
    }

}
class b extends a{
    void v(){
        System.out.println("11111111111111111111100");
    }
    void f(){
        System.out.println("aaaaaaaaa");

    }

    public static void main(String[] args) {
        test m=new b();
        m.f();
    }

}

