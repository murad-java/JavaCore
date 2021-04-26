package com.murad.chapter20.sequence_input_stream_demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * @author Murad Salmanov (legenda)
 * @created 27/04/2021 - 1:59
 * @project JavaCore
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int            c;
        Vector<String> files = new Vector<>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreanEnumerator is=new InputStreanEnumerator(files);

        try(InputStream input=new SequenceInputStream(is)) {
            while ((c=input.read())!=-1){
                System.out.print((char)c);
            }
        }catch (NullPointerException e){
            System.out.println("Ошибка открытия файла.");
        }
        catch (IOException e){
            System.out.println("Ошибка ввода-вывода: "+e);
        }
    }

}
