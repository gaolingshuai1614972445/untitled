package gao;


class MyException extends Throwable {//所有异常的父类

    public MyException() {
        super("余额不足");
    }

}


public class Test2 {
    void f() throws IndexOutOfBoundsException, Error, Throwable {
        throw new IndexOutOfBoundsException();
        //RuntimeException(运行异常）及其子类没有必要被声明或捕获

    }
//
//    public static void main(String[] args) throws MyException {//声明异常
//        throw  new MyException();
//        //抛出异常
//        //一旦程序发生异常就不再继续执行了

    public static void main(String[] args) {
        try {
            if (args.length > 10)
                throw new MyException();
            //try一旦发生异常，就会立刻停止之后的语句，转而执行catch
            //System.exit(1);程序立刻终止
            //return;//finaly 会执行。finaly是在return之前执行的
        } catch (MyException e) {
            //多个catch中最多只会有一个执行
            //catch的参数捕获的异常类型必须时抛出异常本身或其父类
            e.printStackTrace();//捕获异常
        } catch (Throwable e) {
            System.out.println("DFGHJKL");
            //catch可以有多个，但是最下面应该是类型最宽泛的
        } finally {
            //无论是否产生异常，finaly里面的内容必须执行
        }
    }

}

