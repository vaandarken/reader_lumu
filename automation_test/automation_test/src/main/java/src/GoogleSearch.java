package src;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;



        /*Create automated tests for the following actions:

        a. Valid Search: Design and implement an automated test to simulate a valid search
        on Google. Provide a search query and verify that search results are displayed on
        the search results page. You can use assertions to validate the presence of search
        results or specific elements on the page.

        b. Search Result Navigation: Design and implement an automated test to simulate
        clicking on one of the search results. After performing a search, select any search
        result and verify that you are redirected to the correct URL. You can use
        assertions to validate the current URL or specific elements on the destination
        page*/

public class GoogleSearch {

    //stablish webdriver
    @Test
    public void component(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        String gTitle = driver.getTitle();
        Assertions.assertEquals("google", gTitle.toLowerCase());

        //find searchbar and send text
        WebElement searchBar = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        searchBar.sendKeys("Inter Miami CF");
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));


        //Click on IMCF website
        WebElement imcfWebsite = driver.findElement(By.xpath("//a[@href='https://es.intermiamicf.com/']"));
        imcfWebsite.click();
        String imcfTitle = driver.getTitle();
        System.out.println(imcfTitle);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Assertions.assertEquals("inter miami cf", imcfTitle.toLowerCase());


    }
    public class LongestSubstringWithoutRepeatingCharacters {

        public static int longestSubstringWithoutRepeatingCharacters(String str1) {
            int longestSubstringLength = 0;
            String currentSubstring = "";
            Set<Character> characterSet = new HashSet<>();

            for (char character : str1.toCharArray()) {
                if (!characterSet.contains(character)) {
                    currentSubstring += character;
                    characterSet.add(character);
                } else {
                    if (currentSubstring.length() > longestSubstringLength) {
                        longestSubstringLength = currentSubstring.length();
                    }
                    currentSubstring = character + "";
                }
            }

            if (currentSubstring.length() > longestSubstringLength) {
                longestSubstringLength = currentSubstring.length();
            }

            return longestSubstringLength;
        }

        public static void main(String[] args) {
            String str1 = "abcabcbb";
            int longestSubstringLength = longestSubstringWithoutRepeatingCharacters(str1);
            System.out.println("The length of the longest substring without repeating characters is " + longestSubstringLength);
        }
    }
    public class longestSubstringWithoutRepeatingCharacters {

        public static int longestSubstringWithoutRepeatingCharacters(String str1) {
            int longestSubstringLength = 0;
            String currentSubstring = "";
            Set<Character> characterSet = new HashSet<>();

            for (char character : str1.toCharArray()) {
                if (!characterSet.contains(character)) {
                    currentSubstring += character;
                    characterSet.add(character);
                } else {
                    if (currentSubstring.length() > longestSubstringLength) {
                        longestSubstringLength = currentSubstring.length();
                    }
                    currentSubstring = character + "";
                }
            }

            if (currentSubstring.length() > longestSubstringLength) {
                longestSubstringLength = currentSubstring.length();
            }

            return longestSubstringLength;
        }

        public static void main(String[] args) {
            String str1 = "abcabcbb";
            int longestSubstringLength = longestSubstringWithoutRepeatingCharacters(str1);
            System.out.println("The length of the longest substring without repeating characters is " + longestSubstringLength);
        }
    }



    }
