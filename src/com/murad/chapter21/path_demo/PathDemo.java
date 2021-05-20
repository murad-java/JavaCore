package com.murad.chapter21.path_demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/05/2021 - 22:57
 * @project JavaCore
 */
public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("test.txt");
        System.out.println("Имя файла: " + filepath.getName(0));
        System.out.println("Путь к файлу: " + filepath);
        System.out.println("Абсолютный путь к файлу: " + filepath.toAbsolutePath());
        System.out.println("Родительский коталог: " + filepath.getParent());

        if (Files.exists(filepath)) {
            System.out.println("Файл сущиствует.");
        } else {
            System.out.println("Файл не сущиствует.");
        }
        try {
            if (Files.isHidden(filepath)) {
                System.out.println("Файл скрыт.");
            } else {
                System.out.println("Файл не скрыт.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        Files.isWritable(filepath);
        System.out.println("Файл доступен для записи.");
        Files.isReadable(filepath);
        System.out.println("Файл доступен для чтения.");
        try {
            BasicFileAttributes attrib = Files.readAttributes(filepath, BasicFileAttributes.class);

            if (attrib.isDirectory()) {
                System.out.println("Это каталог.");
            } else {
                System.out.println("Это не каталог.");
            }

            if (attrib.isRegularFile()) {
                System.out.println("Это обычный файл.");
            }else {
                System.out.println("Это не обычный файл.");
            }

            if(attrib.isSymbolicLink()){
                System.out.println("Это символическая ссылка.");
            }else {
                System.out.println("Это не символическая ссылка.");
            }

            System.out.println("Время последней модификации файла: "+attrib.lastModifiedTime());
            System.out.println("Размер файла: "+attrib.size()+" байтов.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов: " + e);
        }
    }
}
