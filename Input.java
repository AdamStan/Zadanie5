package Zadanie5;

 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.nio.ByteBuffer;
 import java.nio.channels.FileChannel;
 import java.util.ArrayList;
 
public class Input {
    public static void save_nio(ArrayList<Integer> wynik, String name) throws IOException{
        FileChannel fc = new FileOutputStream(name).getChannel();
        String buff;
        buff = String.valueOf(wynik);
        fc.write(ByteBuffer.wrap(buff.getBytes()));
        fc.close();
    }
}
