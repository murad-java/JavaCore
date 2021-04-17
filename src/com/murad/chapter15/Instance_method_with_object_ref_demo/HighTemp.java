package com.murad.chapter15.Instance_method_with_object_ref_demo;

/**
 * @author Murad Salmanov (legenda)
 * @created 17/04/2021 - 7:08
 * @project JavaCore
 */
public class HighTemp {
    private int hTemp;
    HighTemp(int ht){hTemp=ht;}
    boolean sameTemp(HighTemp ht2){
        return hTemp==ht2.hTemp;
    }
    boolean lassThanTemp(HighTemp ht2){
        return hTemp<ht2.hTemp;
    }

}
