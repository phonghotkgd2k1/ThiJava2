package thi;

import java.io.*;

public class XFile implements Serializable {

    public static Object readObject(String path) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Object book = new Object();
        try {
            book = ois.readObject();
            ois.close();
            return book;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    public static void writeObject(Object staffObject, String path) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(staffObject);
        oos.close();
    }
}
