package org.runner;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BrokenLinks1 extends BaseClass {

    public static void main(String[] args) {

        String URL = "https://www.stfc.in/";
        String status = "passed";
        String username = "user-name";
        String access_key = "access-key";

        String url = "";
        HttpURLConnection urlconnection = null;
        int responseCode = 200;



            launchBrowser("chrome");
            driver.navigate().to(URL);
//        driver.manage().window().maximize();
            List<WebElement> links = driver.findElements(By.tagName("a"));
            Iterator<WebElement> link = links.iterator();

            /* For skipping email address */
            String mail_to = "mailto";
            String tel ="tel";
            String LinkedInPage = "https://www.linkedin.com";
            int valid_links = 0;
            int broken_links = 0;
            Boolean bLinkedIn = false;
            int LinkedInStatus = 999;

            Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
            Matcher mat;

            while (link.hasNext())
            {
                url = link.next().getAttribute("href");
                System.out.println(url);
                bLinkedIn = false;

                if ((url == null) || (url.isEmpty()))
                {
                    System.out.println("URL is either not configured for anchor tag or it is empty");
                    continue;
                }

                /* String str="mailto:support@LambdaTest.com"; */
                if ((url.startsWith(mail_to)) || (url.startsWith(tel)))
                {
                    System.out.println("Email address or Telephone detected");
                    continue;
                }

                if(url.startsWith(LinkedInPage))
                {
                    System.out.println("URL starts with LinkedIn, expected status code is 999");
                    bLinkedIn = true;
                }

                try {
                    urlconnection = (HttpURLConnection) (new URL(url).openConnection());
                    urlconnection.setRequestMethod("HEAD");
                    urlconnection.connect();
                    responseCode = urlconnection.getResponseCode();
                    if (responseCode >= 400)
                    {
                        /* https://stackoverflow.com/questions/27231113/999-error-code-on-head-request-to-linkedin */
                        if ((bLinkedIn == true) && (responseCode == LinkedInStatus))
                        {
                            System.out.println(url + " is a LinkedIn Page and is not a broken link");
                            valid_links++;
                        }
                        else
                        {
                            System.out.println(url + " is a broken link");
                            broken_links++;
                        }
                    }
                    else
                    {
                        System.out.println(url + " is a valid link");
                        valid_links++;
                    }
                } catch (MalformedURLException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
            System.out.println("Detection of broken links completed with " + broken_links + " broken links and " + valid_links + " valid links\n");

         driver.quit();

    }
}

