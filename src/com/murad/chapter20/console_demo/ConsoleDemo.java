package com.murad.chapter20.console_demo;

import java.io.Console;

/**
 * @author Murad Salmanov (legenda)
 * @created 02/05/2021 - 8:38
 * @project JavaCore
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        String log;
        char[] pass;
        Console con;

        con=System.console();
        if(con==null) {
            System.out.println("Consol вернул NULL!!!");
            return;
        }

        log=con.readLine("Введите логин: ");
        pass=con.readPassword("Введите пароль: ");

        con.printf("Ваш логин \"%s\" и пароль \"%s\"",log,pass);

    }
}
