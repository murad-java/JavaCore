package com.murad.chapter11.synch;

/**
 * @author Murad Salmanov (legenda)
 */
public class Synch {
    public static void main(String[] args) {
        Callme callme=new Callme();
        Caller ob1=new Caller(callme,"Добро пожаловать");
        Caller ob2=new Caller(callme,"в синхронизированный");
        Caller ob3=new Caller(callme,"мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Приерван");
        }
    }
}
