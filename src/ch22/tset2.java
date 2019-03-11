package ch22;

import java.io.*;

public class tset2 {
    public static void main(String[] args) {
        try(OutputStream outputStream =new DataOutputStream(
                    new BufferedOutputStream(//桥流：多个留组合在一起，成为
                    new FileOutputStream(" from 2019-02-24 07-30-46.png.gif")));
            InputStream inputStream =new BufferedInputStream(
                    new FileInputStream("Screenshot from 2019-02-24 07-30-46.png"));) {
int date;
long start = System.currentTimeMillis();
while ((date = inputStream.read())!=-1)
    outputStream.write(date);
long end = System.currentTimeMillis();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
