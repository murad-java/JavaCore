package com.murad.chapter20.byte_array_input_stream_demo;

import java.io.ByteArrayInputStream;

/**
 * @author Murad Salmanov (legenda)
 * @created 26/04/2021 - 1:50
 * @project JavaCore
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte[] b   = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);

    }
}
