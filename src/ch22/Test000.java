package ch22;

import java.io.*;

public class Test000 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos =
        new DataOutputStream(new FileOutputStream("abc.dat"));
        DataInputStream dis =
                new DataInputStream(new FileInputStream("abc.dat"));
        dos.writeInt(1);
        dos.writeBytes("ssss");
        dos.writeBoolean(true);
        System.out.println(dis.readInt()/3);/* / 1 可以对文件相应类型进行计算
      */
    }
}
