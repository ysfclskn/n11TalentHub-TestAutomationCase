package pages;

import utils.Driver;
import utils.ExcelUtils;
import utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CampaignsPage {


    public static void getTabs() {
        //Get campaign tabs and add tabList
        List<WebElement> tabList = Driver.get().findElements(By.className("campPromTab"));
        List<String> tabNames = new ArrayList<>();
        List<String> categryLinks = new ArrayList<>();
        for (WebElement tab : tabList){
            tabNames = Arrays.asList(tab.getText().split("\n"));
            for (int i=0;i< getCategories().size();i++){

                for(int j=0; j< getCampaignList().size();j++){

                    for(int k=0;k< getCampaignLinks().size();k++){

                       categryLinks = Arrays.asList(getCampaignLinks().get(k).getAttribute("href"));
                    }
                }

            }

        }
                                 }
      public static List<WebElement> getCategories(){
          List<WebElement> categories = Driver.get().findElements(By.xpath("//section[contains(@class,\"group category-\")]"));
          return categories;
        }

      public static List<WebElement> getCampaignList(){
          List<WebElement> campaignList = Driver.get().findElements(By.xpath("//section[contains(@class,\"group category-\")]/ul"));
          return campaignList;
      }

      public static List<WebElement> getCampaignLinks(){
          List<WebElement> campaignLinks = Driver.get().findElements(By.xpath("//section[contains(@class,\"group category-\")]/ul/li/a"));
          return campaignLinks;
      }

      public static List<WebElement> getLinksByCampaign(){

      }

      public static void writeCategoryNameAndLinks() throws IOException {

      }

}

    //FIXIT - Kategorileri tek tek yazdırdık. Ancak isteneni yapabilmek için her linkin kategorisini bilerek eşleştirip excele yazdırılmalı.





