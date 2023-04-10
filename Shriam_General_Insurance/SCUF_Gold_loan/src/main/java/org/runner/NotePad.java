package org.runner;

import org.baseclass.BaseClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class NotePad extends BaseClass {


    public static void main(String[] args) throws IOException {


        FileReader FR = new FileReader("slave.txt");
        BufferedReader br = new BufferedReader(FR);


        String str;

        while ((str = br.readLine()) != null) {

            System.out.println(str);

            launchBrowser("chrome");

            if (str.contains("http://")){
                loadUrl(str);
            }else {
                loadUrl("http://" + str);
            }

            driver.quit();


        }


    }
}
