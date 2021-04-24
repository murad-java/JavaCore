package com.murad.chapter20.only_ext;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Murad Salmanov (legenda)
 * @created 24/04/2021 - 22:58
 * @project JavaCore
 */
public class DirListOnly {
    public static void main(String[] args) {
        String dirName="/Users/legenda/Documents";// для операционной системы windows используйте для примера "C:\\Users\..."
        File   f1=new File(dirName);
        FilenameFilter only=new OnlyExt("zip");
        String[] s=f1.list(only);

        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
