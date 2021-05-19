package com.murad.chapter21.explicit_channel_read;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Murad Salmanov (legenda)
 * @created 19/05/2021 - 0:37
 * @project JavaCore
 */
public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count     = 0;
        Path filePath =null;

        try {
            filePath= Paths.get("test.txt");
        }catch (InvalidPathException e){
            System.out.println("Path error: "+e);
        }

        try(SeekableByteChannel fChan= Files.newByteChannel(filePath)) {

            ByteBuffer mBuf=ByteBuffer.allocate(128);
            do {
                count=fChan.read(mBuf);
                if(count!=-1){
                    mBuf.rewind();
                    for(int i=0;i<count;i++){
                        System.out.print((char)mBuf.get());
                    }
                }
            }while (count!=-1);
        }catch (IOException e){
            System.out.println("Ошибка ввода вывода: "+e);
        }
    }
}
