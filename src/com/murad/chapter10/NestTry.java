package com.murad.chapter10;


public class NestTry {
    public static void main(String[] args) {
        try {

            int a = args.length;
            /*Если не указаны аргументы командной строки,
            в следующем операторе будет сгенерировано исключение в связи с делением на нуль.
             */
            int b = 42 / a;
            System.out.println("a=" + a);
            try { // вложенный блок try
                 /* Если указан один аргумент командной строки ,
                 то исключение в связи с делением на нуль будет сгенерировано в следующем коде . */
                if (a == 1) a = a / (a - a);
                if (a == 2) {
                    int[] c = {1};
                    c[21] = 22;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" Индeкc за пределами массива: " + e);
            }

        } catch (ArithmeticException e) {
            System.out.println(" Дeлeниe на нуль :" + e) ;
        }
    }
}
