package com.murad.chapter21.explicid_channel_write;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/05/2021 - 2:24
 * @project JavaCore
 */
public class Explicid_Channel_Write {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test2.txt"),
                                                                    StandardOpenOption.WRITE,
                                                                    StandardOpenOption.CREATE)) {
            ByteBuffer mBuf = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) mBuf.put((byte) ('A' + i));
            mBuf.rewind();
            fChan.write(mBuf);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
