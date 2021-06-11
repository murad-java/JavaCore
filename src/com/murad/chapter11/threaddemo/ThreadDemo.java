package com.murad.chapter11.threaddemo;

/**
 * @author Murad Salmanov (legenda)
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for(int n=5;n>0;n--){
                System.out.println("Главный поток: "+n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван: "+e);
        }
        System.out.println("Главный поток завершон.");
    }
}
