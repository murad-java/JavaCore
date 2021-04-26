package com.murad.chapter20.pushback_input_stream_demo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * @author Murad Salmanov (legenda)
 * @created 26/04/2021 - 22:35
 * @project JavaCore
 */
public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String s = "if (a==4) a=0;\n";
        byte[] buf=s.getBytes();
        int c;
        ByteArrayInputStream in =new ByteArrayInputStream(buf);

        try(PushbackInputStream f=new PushbackInputStream(in)) {
            while ((c=f.read())!=-1){
                switch (c){
                    case '=':
                        if((c=f.read())=='='){
                            System.out.print(".eq.");
                        }else {
                            System.out.print("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                }
            }
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: "+e);
        }
    }
}
