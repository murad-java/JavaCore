package com.murad.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Murad Salmanov (legenda)
 * @created 15/04/2021 - 19:34
 * @project JavaCore
 */
public class BRReadLines {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите мтроки текста.");
        System.out.println("Bвeдитe 'стоп' для завершения.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
