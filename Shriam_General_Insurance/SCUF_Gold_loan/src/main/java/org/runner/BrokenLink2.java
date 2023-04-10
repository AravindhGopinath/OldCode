package org.runner;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BrokenLink2 extends BaseClass {

//    public static boolean isUrlValid(String url) {
//        try {
//            URL obj = new URL(url);
//            obj.toURI();
//            return true;
//        } catch (MalformedURLException e) {
//            return false;
//        } catch (URISyntaxException e) {
//            return false;
//        }
//    }

    public static void main(String[] args) throws IOException {

        String URL = "https://www.stfc.in/";

        String url = "";
        HttpURLConnection urlconnection = null;
        int responseCode = 200;



        launchBrowser("chrome");
        driver.navigate().to(URL);
//        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        Iterator<WebElement> link = links.iterator();



        while (link.hasNext())
        {
            url = link.next().getAttribute("href");
            System.out.println(url);

            if ((url == null) || (url.isEmpty()))
            {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }



            try {
                urlconnection = (HttpURLConnection) (new URL(url).openConnection());
                urlconnection.setRequestMethod("HEAD");
                urlconnection.connect();
                responseCode = urlconnection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println(url + " is a broken link");
                }
                else {
                        System.out.println(url + " is a valid link");
                    }


            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

//        if(isUrlValid(URL)) {
//            URL obj = new URL(URL);
//            //Opening a connection
//            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
//            //Sending the request
//            conn.setRequestMethod("GET");
//            int response = conn.getResponseCode();
//            if (response == 200) {
//                //Reading the response to a StringBuffer
//                Scanner responseReader = new Scanner(conn.getInputStream());
//                StringBuffer buffer = new StringBuffer();
//                while (responseReader.hasNextLine()) {
//                    buffer.append(responseReader.nextLine()+"\n");
//                }
//                responseReader.close();
//                //Printing the Response
//                System.out.println(buffer.toString());
//            }
//        }else {
//            System.out.println("Enter valid URL");
//        }
//        System.out.println("Detection of broken links completed with " + broken_links + " broken links and " + valid_links + " valid links\n");

        driver.quit();

    }
}

