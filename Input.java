/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

public class Input {
    public static void save_nio(ArrayList<Integer> wynik, String name) throws IOException{ //it overrides file
        FileChannel fc = new FileOutputStream(name).getChannel();
        String buff;
        buff = String.valueOf(wynik);
        fc.write(ByteBuffer.wrap(buff.getBytes()));
    }
}
