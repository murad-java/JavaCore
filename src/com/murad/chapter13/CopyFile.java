package com.murad.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 15/04/2021 - 22:12
 * @project JavaCore
 */
public class CopyFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fin = null; // text.txt
        FileOutputStream out = null;// out.txt
        if (args.length != 2) {
            System.out.println(" Иcпoльзoвaниe : CopyFi le откуда куда");
            return;
        }

        try {
            fin=new FileInputStream(args[0]);
            out=new FileOutputStream(args[1]);
            do{
                i=fin.read();
                if(i!=-1) out.write(i);
            }while (i!=-1);

        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException e){
            System.out.println("Ошибка ввода вывода");
        }finally {
            try {
                if(fin!=null) fin.close();
            }catch (IOException e) {System.out.println("Ошибка закрытия файла ввода");}
            try {
                if(out!=null) out.close();
            }catch (IOException e) {System.out.println("Ошибка закрытия файла вывода");}
        }
    }
}
