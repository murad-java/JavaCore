package com.murad.chapter20.char_array_writer_demo;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 28/04/2021 - 6:32
 * @project JavaCore
 */
public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f   = new CharArrayWriter();
        String          s   = "Эти данные должны быть выведены в массив.";
        char[]          buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Оштбка вывода в буфер.");
        }
        System.out.println("Буфер в виде символьной строки.");
        System.out.println(f.toString());
        System.out.println("В массив");

        char[] c = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);

        }
        System.out.println();
        System.out.println("В поток вывода типа FileWriter()");
        try (FileWriter f2 = new FileWriter("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        System.out.println("Установка в исходное состояние.");
        f.reset();
        for(int i=0;i<3;i++)f.write('X');
        System.out.println(f.toString());
    }
}
