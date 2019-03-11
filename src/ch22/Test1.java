package ch22;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try(OutputStream outputStream = new FileOutputStream("bcd");
            InputStream inputStream = new FileInputStream("bcd");) {
            outputStream.write(new byte[]{'b','b','b','b'});
            outputStream.write("asdfg".getBytes());//能更方便
            outputStream.flush();
            byte[]bytes1=new byte[]{'1','1','1','1'};
//            outputStream.write(bytes1,0,2);//从第零个写入两个字节
            inputStream.read(bytes1,2,2);//从第二个开始读入两个
          System.out.println(new String(bytes1));
            byte [] bytes = new byte[inputStream.available()];//文件有多少个字节
            inputStream.read(bytes);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;


    }
}
