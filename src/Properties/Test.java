package Properties;

import java.io.*;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.setProperty("tom","neme");
        properties.setProperty("jerry","name");
        System.out.println(properties.getProperty("tom"));
        OutputStream outputStream=new FileOutputStream("my.properties");
        properties.store(outputStream,"Tisisdfdfdsfs");


        //假设事先已经存在一个文件，如db.properties.
        Properties db=new Properties();
        db.load(new FileInputStream("db.properties"));
        db.forEach((k,v)->System.out.println(k+"="+v));
        for(Object key:db.keySet()){
            System.out.println(key+"="+db.getProperty((String)key));
        }
    }
}
