package com.murad.chapter21.mapped_channel_write;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/05/2021 - 2:43
 * @project JavaCore
 */
public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fCan = (FileChannel) Files.newByteChannel(Paths.get("test3.txt"),
                                                                   StandardOpenOption.READ,
                                                                   StandardOpenOption.WRITE,
                                                                   StandardOpenOption.CREATE)) {
            MappedByteBuffer mbuf=fCan.map(FileChannel.MapMode.READ_WRITE,0,26);
            for(int i=0;i<26;i++) mbuf.put((byte)('A'+i));
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
