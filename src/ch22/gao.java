package ch22;



import java.io.*;

public class gao {
    public static void main(String[] args)  {
        user tom = new user(1, "tom");
        user jerry = new user(2, "jerry");
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("iii")))) {
        oos.writeObject(tom);
        oos.writeObject(jerry);
        oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("iii")))) {
      System.out.println(ois.readObject());
      System.out.println(ois.readObject());
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
class user implements Serializable{//Serializable序列化接口
    private Integer id ;
    private  String name;

    public user(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}