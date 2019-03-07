package gao;

public class Test异常链 {
    static  void  f()  throws Exception  {
        try {
            g();
        } catch (Exception e) {
            throw  new  Exception("f里面的异常",e);
        }

    }

    static void g() throws Exception {
        throw  new Exception("g里面的异常");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
