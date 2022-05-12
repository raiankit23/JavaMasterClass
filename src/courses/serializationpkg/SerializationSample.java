package courses.serializationpkg;

import java.io.*;

public class SerializationSample {
    public static void main(String[] args) {
        try {
        Vehicle polo = new Vehicle("Volkswagon", "poloGT", 2021);
        FileOutputStream fileout = new FileOutputStream("polo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(polo);
        out.close();
        fileout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Serialized data is saved in polo.ser");
    }
}
