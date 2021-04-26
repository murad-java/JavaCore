package com.murad.chapter20.sequence_input_stream_demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Murad Salmanov (legenda)
 * @created 27/04/2021 - 1:59
 * @project JavaCore
 */
public class InputStreanEnumerator implements Enumeration<FileInputStream> {
    Enumeration<String> files;

    public InputStreanEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e) {
            return null;
        }

    }
}
