package com.murad.chapter21.mapped_channel_read;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/05/2021 - 2:03
 * @project JavaCore
 */
public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {
            long fSize = fChan.size();
            MappedByteBuffer mBuf=fChan.map(FileChannel.MapMode.READ_ONLY,0,fSize);
            for(int i=0;i<fSize;i++)
                System.out.print((char) mBuf.get());
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
