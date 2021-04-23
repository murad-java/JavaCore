package com.murad.chapter20.file_demo;

import java.io.File;

/**
 * @author Murad Salmanov (legenda)
 * @created 23/04/2021 - 10:26
 * @project JavaCore
 */
public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("./src/com/murad/chapter20/COPYRIGHT");
        p("Имя файла: " + f1.getName());
        p("Путь: " + f1.getPath());
        p("Абсолютный путь: " + f1.getAbsolutePath());
        p("Родительский коталог: " + f1.getParent());
        p(f1.exists() ? "Файл существует" : "Файл не существует");
        p(f1.canWrite() ? "Доступен для записи" : "Не доступен для записи");
        p(f1.canRead() ? "Доступен для чтения" : "Не доступен для чтения");
        p(f1.isDirectory() ? "Является каталогом" : "Не является каталогом");
        p(f1.isFile() ? "Является обычным файлом" : "Может быть именоыанным каналом");
        p(f1.isAbsolute() ? "Является абсолютным" : "Не является абсолютным");
        p("Последнее изменение в файле: " + f1.lastModified());
        p("Размер: " + f1.length() + " байт");
    }
}
