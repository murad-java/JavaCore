package com.murad.chapter21.dir_list;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/05/2021 - 23:26
 * @project JavaCore
 */
public class DirList {
    public static void main(String[] args) {
        String dirName = "./";
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirName))) {
            System.out.println("Каталог: " + dirName);
            for (Path entry : dirstrm) {
                BasicFileAttributes attr = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attr.isDirectory()) {
                    System.out.print("<DIR> ");
                }else {
                    System.out.print("      ");
                }
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirName + " не является каталогом: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода: " + e);
        }
    }
}
