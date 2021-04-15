package com.murad.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 15/04/2021 - 21:56
 * @project JavaCore
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println(" Иcпoльзoвaниe: ShowFile имя_файла");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i!=-1) System.out.println((char)i);

            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Оштбка чтения из файла");
        }finally {
            if(fin!=null)
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }


    }
}
