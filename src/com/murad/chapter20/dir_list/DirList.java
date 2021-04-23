package com.murad.chapter20.dir_list;

import java.io.File;

/**
 * @author Murad Salmanov (legenda)
 * @created 23/04/2021 - 10:58
 * @project JavaCore
 */
public class DirList {
    public static void main(String[] args) {
        String dirName="/Users";// для операционной системы windows используйте для примера "C:\\Users"
        File f1=new File(dirName);
        if(f1.isDirectory()){
            System.out.println("Каталог "+dirName);
            String[] list=f1.list();

            for (int i=0;i<list.length;i++){
                File f2=new File(dirName+File.separator+list[i]);
                if(f2.isDirectory()){
                    System.out.println(list[i]+" является каталогом.");

                }else {
                    System.out.println(list[i]+" не является каталогом.");
                }
            }
        }else {
            System.out.println(dirName+" не является каталогом.");
        }
    }
}
