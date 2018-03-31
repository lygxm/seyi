
package com;

import java.io.*;

public class FileTest {
   public static void main(String... args){
       File file = new File("\\Users/LYG/abc");
       try{
          file.createNewFile();
       }catch (IOException e){
           e.printStackTrace();
       }

       try {
           try (
                   BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));
                   BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(file));){
               os.write("中文".getBytes());
               os.write('a');
               os.write('b');
               os.flush();

               int i1 = is.read();
               int i2 = is.read();
               System.out.println((char) i1);
               System.out.println((char) i2);


               byte[] result = new byte[6];
               is.read(result);
               String s = new String(result);
               System.out.println(s);
           }catch (FileNotFoundException e){
               e.printStackTrace();
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}