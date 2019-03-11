package ch22;

import java.io.*;

public class stream {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));//能找出文件在那个位置
       try(
           OutputStream os =new DataOutputStream( new FileOutputStream("BBB"));

        InputStream in = new DataInputStream(new FileInputStream("BBB"));) {
           os.write(97);

           System.out.println((char)in.read());//想要能够读出来，需要强制类型转换
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } ;
    }
}
