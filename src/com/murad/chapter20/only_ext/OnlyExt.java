package com.murad.chapter20.only_ext;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Murad Salmanov (legenda)
 * @created 24/04/2021 - 22:55
 * @project JavaCore
 */
public class OnlyExt implements FilenameFilter {
    private String ext;

    public OnlyExt(String ext) {
        this.ext="."+ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
