package com.murad.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 15/04/2021 - 22:24
 * @project JavaCore
 */
public class CopyFileAutoClose {

    public static void main(String[] args) {
        int i;

        if (args.length != 2) {
            System.out.println(" Иcпoльзoвaниe : CopyFi le откуда куда");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]) ; FileOutputStream out =new FileOutputStream(args[1])
            ){
            do {
                i = fin.read();
                if (i != -1) out.write(i);
            } while (i != -1);

        }catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch(IOException e){
            System.out.println("Ошибка ввода вывода");
        }
    }
}
