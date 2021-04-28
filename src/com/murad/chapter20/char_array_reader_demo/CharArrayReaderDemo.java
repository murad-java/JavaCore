package com.murad.chapter20.char_array_reader_demo;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 28/04/2021 - 6:18
 * @project JavaCore
 */
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp    = "abcdefghijklmnopqrstuvwxyz";
        int    lenght = tmp.length();
        char[] c      = new char[lenght];
        tmp.getChars(0, lenght, c, 0);
        int i;
        try (CharArrayReader input1 = new CharArrayReader(c)) {
            System.out.println("input1: ");
            while ((i = input1.read()) != -1) System.out.print((char) i);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        try (CharArrayReader input2 = new CharArrayReader(c,6,5)) {
            System.out.println("input2: ");
            while ((i = input2.read()) != -1) System.out.print((char) i);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
