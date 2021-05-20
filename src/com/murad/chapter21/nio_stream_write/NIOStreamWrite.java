package com.murad.chapter21.nio_stream_write;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/05/2021 - 4:58
 * @project JavaCore
 */
public class NIOStreamWrite {
    public static void main(String[] args) {
        try(OutputStream out=new BufferedOutputStream(Files.newOutputStream(Paths.get("test4.txt"),
                                                                            StandardOpenOption.WRITE,
                                                                            StandardOpenOption.CREATE))) {
            for(int i=0;i<26;i++) out.write((byte) ('A'+i));
        }catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
