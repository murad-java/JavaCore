package com.murad.chapter20.file_output_stream_demo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 26/04/2021 - 1:32
 * @project JavaCore
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good\n" +
                " to come to the aid of their country\n" +
                " and pay their due taxes.";
        byte[]           buf = source.getBytes();
        FileOutputStream f0  = null;
        FileOutputStream f1  = null;
        FileOutputStream f2  = null;
        try {
            f0=new FileOutputStream("file1.txt");
            f1=new FileOutputStream("file2.txt");
            f2=new FileOutputStream("file3.txt");

            //Запись в первый файл
            for (int i=0;i<buf.length;i++) f0.write(buf[i]);
            //Запись во второй файл
            f1.write(buf);
            //Запись в третий файл
            f2.write(buf,buf.length-buf.length/4,buf.length/4);
        } catch (IOException e) {
            System.out.println("Произошло ошибка ввода-вывода");
        }finally {
            if(f0!=null) {
                try {
                    f0.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(f1!=null) {
                try {
                    f1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(f2!=null) {
                try {
                    f2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
