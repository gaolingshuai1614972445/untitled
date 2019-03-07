package ch05;

import java.time.LocalDate;

public class User implements Cloneable {//如果一个接口中没有任何方法，这个接口被认为是一个标记性接口
    //Cloneable     表示这个类和对象是可以进行clone操作的
    private int id;
    private String name;
    private LocalDate birthday;

    @Override
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();//浅拷贝
        User user = (User) super.clone();
        LocalDate localDate = LocalDate.of(
                birthday.getYear(),
                birthday.getMonthValue(),
                birthday.getDayOfMonth()
        );
        user.birthday = localDate;
        return user;   //深拷贝
    }
        // 克隆

        public LocalDate getBirthday () {
            return birthday;
        }

    public User( int id, String name, LocalDate birthday){
            this.id = id;
            this.name = name;
            this.birthday = birthday;
        }

        public int getId () {
            return id;
        }

        @Override
        public String toString () {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

