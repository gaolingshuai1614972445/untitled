package ch05;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        Integer [] nums= {1,2,3,4,56,867,5,3,2};
        Arrays.sort(nums,Integer::compare);
        System.out.println(Arrays.toString(nums));
    }
}
