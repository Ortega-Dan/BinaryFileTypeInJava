package org.mimetest;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {

        File file = new File("./testingFiles/hh");
        Tika tika = new Tika();
        String mimeType = tika.detect(file);

        System.out.println(mimeType);

    }
}
