package com.murad.chapter20.byte_array_input_strean_reset;

import java.io.ByteArrayInputStream;

/**
 * @author Murad Salmanov (legenda)
 * @created 26/04/2021 - 3:36
 * @project JavaCore
 */
public class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String tmp="abc";
        byte[] b=tmp.getBytes();
        ByteArrayInputStream in =new ByteArrayInputStream(b);

        for (int i=0;i<2;i++){
            int c;
            while ((c=in.read())!=-1)
            {
                if(i==0){
                    System.out.print((char)c);
                }else {
                    System.out.print(Character.toUpperCase((char)c));
                }
            }
            System.out.println();
            in.reset();
        }
    }
}
