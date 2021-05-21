package com.murad.chapter21.dir_list2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Murad Salmanov (legenda)
 * @created 21/05/2021 - 3:42
 * @project JavaCore
 */
public class DirList {
    public static void main(String[] args) {
        String dirName="./";
        DirectoryStream.Filter<Path> how= entry -> { //Филтер для скрытых файлов
            if(Files.isHidden(entry))return false;
            return true;
        };
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirName),how)) {
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
