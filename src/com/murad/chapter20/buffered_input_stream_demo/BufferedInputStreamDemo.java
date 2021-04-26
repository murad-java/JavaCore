package com.murad.chapter20.buffered_input_stream_demo;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 26/04/2021 - 22:03
 * @project JavaCore
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "Это знак авторского знака &copy; " +
                "а &copy - нет.\n";
        byte[]               buf    = s.getBytes();
        ByteArrayInputStream in     = new ByteArrayInputStream(buf);
        int                  c;
        boolean              marked = false;

        try (BufferedInputStream f = new BufferedInputStream(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;

                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if(marked){
                            marked=false;
                            f.reset();
                            System.out.print("&");
                        }else System.out.print((char)c);
                        break;
                    default:
                        if(!marked) System.out.print((char)c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
