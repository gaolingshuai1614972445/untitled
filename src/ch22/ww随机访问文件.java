package ch22;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ww随机访问文件 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile inOut =
                new RandomAccessFile("abc","rw");
        inOut.seek(3);
        System.out.println((char)inOut.read());
        inOut.seek(inOut.length());
        inOut.write('z');
        inOut.close();
    }
}
