package RandomAccessFile;

import java.io.RandomAccessFile;

/**
 * Created by fengjw on 2018/5/5
 * Code Change The World!
 */

public class RandomAccessFileTestDemo {

    public static final int KBSIZE = 1024;
    public static final long SIZE = 1024 * KBSIZE;

    public static void main(String [] args) throws Exception{
        RandomAccessFile raf = new RandomAccessFile("./raf.txt", "rw");
        raf.setLength(SIZE);
        raf.close();

        String str1 = "first write string.";
        String str2 = "second write string.";
        String str3 = "third write string.";
        String str4 = "fourth write string.";
        String str5 = "fifth write string.";

        new FileWriteThread(KBSIZE * 1, str1.getBytes()).start();
        new FileWriteThread(KBSIZE * 2, str2.getBytes()).start();
        new FileWriteThread(KBSIZE * 3, str3.getBytes()).start();
        new FileWriteThread(KBSIZE * 4, str4.getBytes()).start();
        new FileWriteThread(KBSIZE * 5, str5.getBytes()).start();

    }

    static class FileWriteThread extends Thread{
        private int skip;
        private byte[] content;

        public FileWriteThread(int skip, byte[] content){
            this.skip = skip;
            this.content = content;
        }

        public void run(){
            RandomAccessFile raf = null;
            try {
                raf = new RandomAccessFile("./raf.txt", "rw");
                raf.seek(skip);
                raf.write(content);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try {
                    raf.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }

}
