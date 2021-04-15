package com.murad.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Murad Salmanov (legenda)
 * @created 15/04/2021 - 19:26
 * @project JavaCore
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввидите символы, 'q' -для выхода.");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
