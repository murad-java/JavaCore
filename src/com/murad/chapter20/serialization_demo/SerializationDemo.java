package com.murad.chapter20.serialization_demo;

import java.io.*;

/**
 * @author Murad Salmanov (legenda)
 * @created 15/05/2021 - 23:56
 * @project JavaCore
 */
public class SerializationDemo {
    public static void main(String[] args) {


        try (
                ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass object1=new MyClass("Hello",7,2.7e10);
            System.out.println("object1: "+object1);
            objOStrm.writeObject(object1);

        } catch (IOException e) {
            System.out.println("Исключение при сериализации: "+e);
        }

        try(ObjectInputStream objIStrm=new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2=(MyClass) objIStrm.readObject();
            System.out.println("object2: "+object2);
        }catch (Exception e){
            System.out.println("Исключение при десериализации: ");
        }

    }
}
