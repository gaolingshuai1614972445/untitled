package G泛型;

class  ArrayAlg{
    public static <T> T getMiddle(T...a){
        return  a [a.length /2];
    }
}

public class Test1 {
    public static void main(String[] args) {
        int i =ArrayAlg.<Integer>getMiddle(1,2,23,4,5);
        System.out.println(i);
        String s = ArrayAlg.<String>getMiddle("aa","bb","ccc");
        System.out.println(s);
    }
}
