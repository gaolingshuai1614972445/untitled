package ch22;

import java.io.*;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("ooo");
        /*只适合编辑文本文件

         */
        writer.write("hello");
        writer.flush();
        Scanner in = new Scanner(new FileReader("ooo"));
        System.out.println(in.nextLine());
    }
}
