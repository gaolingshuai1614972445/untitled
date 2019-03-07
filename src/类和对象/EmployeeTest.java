package 类和对象;

import java.time.LocalDate;
import java.util.Arrays;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee [] staff = new  Employee[3];
        staff[0] = new Employee("tom",75000, LocalDate.of(2019,12,15));
        staff[1] = new Employee("twm",75000, LocalDate.of(2019,12,15));
        staff[2] = new Employee("tr",75000, LocalDate.of(2019,12,15));
        for (int i =0;i<staff.length;i++)
            System.out.println(staff[i]);
        for(Employee e : staff)
            System.out.println(e);
        Arrays.stream(staff).forEach(System.out::println);
        Employee e =new Employee("tome",782222,LocalDate.now());
    }
}
