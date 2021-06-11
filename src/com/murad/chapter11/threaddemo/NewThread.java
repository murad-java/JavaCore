package com.murad.chapter11.threaddemo;

/**
 * @author Murad Salmanov (legenda)
 */
public class NewThread implements Runnable {
    Thread t;

    public NewThread() {
        t=new Thread(this,"Демонстрационный поток");
        System.out.println("Дочерный поток создан: "+t);
        t.start();

    }

    @Override
    public void run() {
        try {
            for(int n=5;n>0;n--){
                System.out.println("Дочерный поток: "+n);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Дочерный поток прерван: "+e);
        }
        System.out.println("Дочерный поток завершон.");
    }
}
