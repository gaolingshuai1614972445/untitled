package ch22;

import java.io.*;

public class test6 {
    public static void main(String[] args) {
        try(OutputStream outputStream = new DataOutputStream(
                    new BufferedOutputStream(
                    new FileOutputStream("d")));
            InputStream inputStream = new DataInputStream(
                    new BufferedInputStream(
                    new FileInputStream("d")));) {
            ((DataOutputStream) outputStream).writeUTF("hhhhhhhhhhh");
            ((DataOutputStream) outputStream).writeInt(123132131);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

