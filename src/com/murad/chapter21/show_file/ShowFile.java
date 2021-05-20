package com.murad.chapter21.show_file;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/05/2021 - 4:50
 * @project JavaCore
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        try (InputStream fin = Files.newInputStream(Paths.get("test.txt"))) {
            do {
                i=fin.read();
                if(i!=-1) System.out.print((char)i);
            }while (i!=-1);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
