package com.murad.chapter21.noi_copy;

import java.io.IOException;
import java.nio.file.*;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/05/2021 - 4:37
 * @project JavaCore
 */
public class NIOCopy {
    public static void main(String[] args) {
        try{
            Path source = Paths.get("test.txt");
            Path target = Paths.get("test_copy.txt");

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }

}
