package com.murad.chapter20.file_input_stream_demo;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 25/04/2021 - 1:21
 * @project JavaCore
 */
public class FileInputStreamDemo {

    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream(
                "./src/com/murad/chapter20/file_input_stream_demo/FileInputStreamDemo.java")) {

            System.out.println("Общаее количество доступных байтов: " + (size = f.available()));
            int n = size / 40;
            System.out.println("Первое " + n + " байтов, прочитанных из файла по очериди методом read()");

            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println("\nВсе еще доступно: "+f.available());
            System.out.println("Чтение следующих " + n + " байтов, по очериди методом read(b[])");

            byte[] b=new byte[n];
            if(f.read(b)!=n){
                System.err.println("Нельзя прочитать "+n+" байтов.");
            }

            System.out.println(new String(b,0,n));
            System.out.println("Все еще доступно: "+(size=f.available()));
            System.out.println("Пропустить половину оставшихся байтов с помошью skip()");

            f.skip(size/2);
            System.out.println("\nВсе еще доступно: "+f.available());
            System.out.println ( " Чтeниe " +n/2+" байтов," +
                    " размещаемых в конце массива" );
            if(f.read(b,n/2,n/2)!=n/2){
                System.err.println("Нельзя прочитать "+n/2+" байтов.");
            }
            System.out.println(new String(b,0,b.length));
            System.out.println("\nВсе еще доступно: "+f.available());

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
