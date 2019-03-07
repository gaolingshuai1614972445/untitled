package G泛型;

import java.util.ArrayList;

class Node<T, E> {
    private T data;
    public E num;
    private String name;


    public static <T> T f() {    // 泛型方法
        T a = null;
        return a;
    }
}


public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i = list.get(0);
        Node<Integer, Double> node = new Node<>();
        Node<String, String> node1 = new Node<>();
        Node.<String>f();
    }
}

