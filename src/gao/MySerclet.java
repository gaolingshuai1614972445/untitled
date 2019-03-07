package gao;
interface A{
    void f();
    default void g(){
        System.out.println("qqqqqqqqqqqqqqq");
    }
}
public class MySerclet implements A{
    @Override
    public void f() {
        System.out.println("11111111111111111");

    }

    @Override
    public void g() {
        System.out.println();

    }
}
