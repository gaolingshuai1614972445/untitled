package ch05;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

class  DateSort implements Comparator<LocalDate>{

    @Override
    public int compare(LocalDate o1, LocalDate o2) {
         if (o1.getDayOfMonth()>o2.getDayOfMonth())return 1;
         else if (o1.getDayOfMonth() == o2.getDayOfMonth())return 0;
         else  return -1;
    }
}
public class Test1 {
    public static void main(String[] args) {
        LocalDate l1 = LocalDate.of(1999,8,24);
        LocalDate l2 = LocalDate.of(2001,2,3);
        LocalDate l3 = LocalDate.of(2001,2,9);
        LocalDate l4 = LocalDate.of(1997,8,9);
        LocalDate[]localDates = {l1,l2,l3, l4};
        Arrays.sort(localDates,new DateSort());
        Arrays.stream(localDates).forEach(System.out::println);

    }
}
