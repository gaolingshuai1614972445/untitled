package ch05;

import java.time.LocalDate;

public class Test3 {

    public static void main(String[] args) throws CloneNotSupportedException {

        LocalDate l3 = LocalDate.of(2001,2,9);


            User tom = new User(1, "tom", LocalDate.now());
            User tomClone = (User) tom.clone();//tom.clone 克隆
            System.out.println("tom" + tom);
            System.out.println("tom Clone" + tomClone);
            System.out.println(tom == tomClone);
            System.out.println(tom.getBirthday() == tomClone.getBirthday());

//浅拷贝/克隆只拷贝了基本类型，对于引用类型依然是功用的
        //深拷贝/克隆要对每一个类型都进行拷贝，达到这两个对象的每个部分都完全被克隆
        //如何进行深拷贝/ 克隆？先进行浅拷贝，即supper.clone(),在对每一个引用类型单独拷贝
    }
}
