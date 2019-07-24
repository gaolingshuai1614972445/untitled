package 继承;

public class Manager extends Employee {//Manager:子类，派生类  Employee:父类，基类，超类
    //    Employee派生了Manager
//    Manager 继承了 Employee
//    一个子类只能有一个父类：单根继承
//    一个父类可以有多个子类
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //    @Override
//    重写：一定发生在父子类中
//     父子类中的方法名和参数列表必须完全相同
//    子类的返回值和父类的相同或者比父类的返回窄
//    子类的访问修饰符要和父类的等或者更宽
    @Override
    public double getSalary() {
return getSalary()+bonus;

    }
}
//重载：可以发生在单独类，也可以父子类
//方法名必须相同
//参数列表必须不同
//和返回值无关
