package com.murad.chapter10;


public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10) throw new MyException(a);
        System.out.println("Нориальное завершение");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException m) {
            System.out.println("Перехвачено исключение: " + m);
        }
    }
}

class MyException extends Exception {
    private int detail;

    public MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException{ " +
                +detail +
                " }";
    }
}