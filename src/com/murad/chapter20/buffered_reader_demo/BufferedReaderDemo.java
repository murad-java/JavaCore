package com.murad.chapter20.buffered_reader_demo;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author Murad Salmanov (legenda)
 * @created 30/04/2021 - 12:19
 * @project JavaCore
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s   = "Этот знак авторского права &copy; ";
        char[] buf = new char[s.length()];
        s.getChars(0,s.length(),buf,0);
        boolean marked=false;
        CharArrayReader in=new CharArrayReader(buf);
        int c;
        try(BufferedReader f=new BufferedReader(in)){
            while ((c=f.read())!=-1){
                switch (c){
                    case '&':
                        if (!marked){
                            f.mark(32);
                            marked=true;
                        }else marked=false;
                        break;
                    case ';':
                        if(marked){
                            marked=false;
                            System.out.print("(c)");
                        }else System.out.print((char)c);
                        break;
                    case ' ':
                        if (marked){
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
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: "+e);
        }
    }
}
