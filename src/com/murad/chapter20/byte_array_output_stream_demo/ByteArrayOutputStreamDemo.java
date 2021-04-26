package com.murad.chapter20.byte_array_output_stream_demo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 26/04/2021 - 3:44
 * @project JavaCore
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f=new ByteArrayOutputStream();
        String s="Эти данные должны быть выведены в массив.";
        byte[] buf=s.getBytes();

        try {
            f.write(buf);
        }catch (IOException e){
            System.out.println("Ошибка записи в буффер.");
        }

        System.out.println("Буффер в виде символьной строки.");
        System.out.println(f.toString());
        System.out.println("В массив");
        byte[] b=f.toByteArray();
        for(int i=0;i<b.length;i++) System.out.print((char) b[i]);
        System.out.println("\nВ поток вывода типа OutputStream");
        try(FileOutputStream f2=new FileOutputStream("test.txt")){
            f.writeTo(f2);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: "+e);
            return;
        }

        System.out.println("Установка в исходное состояние.");
        f.reset();
        for(int i=0;i<3; i++) f.write('X');
        System.out.println(f.toString());

    }
}
