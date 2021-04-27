package com.murad.chapter20.data_io_demo;

import java.io.*;

/**
 * @author Murad Salmanov (legenda)
 * @created 27/04/2021 - 3:57
 * @project JavaCore
 */
public class DataIODemo {
    public static void main(String[] args) {


        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыт файл вывода");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("test.dat"))) {

            double  d = din.readDouble();
            int     i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Получаемые значения: " + d + " " + i + " " + b);

        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыт файл ввода");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
