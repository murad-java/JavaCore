package com.murad.chapter20.filereader_demo;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 28/04/2021 - 5:52
 * @project JavaCore
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        int c;
        try(FileReader fr=new FileReader("./src/com/murad/chapter20/filereader_demo/FileReaderDemo.java")){
            while ((c=fr.read())!=-1) System.out.print((char)c);
        }catch (IOException e){
            System.out.println("Ошибка вводы вывода: "+e);
        }
    }
}
