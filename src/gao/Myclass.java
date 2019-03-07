package gao;

public class Myclass  implements  Myinterface{
    @Override
    public void foo() {

    }


    //alt +回车，如果不想实现就把class变成abstract(抽象的）

    }

//接口和接口之间可以进行派生，用extends关键字，只能派生一个
//接口和类之间可以实现，用implements关键字，类可以实现多个接口
//当类即继承父类为，也实现接口时，应该先继承再实现
//类实现接口时应该实现里面的抽象方法，否则这个类就变成抽象类