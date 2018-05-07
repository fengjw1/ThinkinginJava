package RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by fengjw on 2018/5/5
 * Code Change The World!
 */

public class ChannelTestDemo {

    public static void main(String [] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("./raf.txt", "rw");
        FileChannel inChannel = raf.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(48);
        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1){
            System.out.println("Read " + bytesRead);
            buf.flip();

            while (buf.hasRemaining()){
                System.out.println((char) buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);

        }
        raf.close();
    }

}
