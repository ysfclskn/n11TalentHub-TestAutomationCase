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

      // Get categories section Moda,Elektronik etc.
      public static List<WebElement> getCategories(){
          List<WebElement> categories = Driver.get().findElements(By.xpath("//section[contains(@class,\"group category-\")]"));
          return categories;
        }

      // Get campaign links by category
      public static List<WebElement> getCampaignLinks(String category){
          List<WebElement> campaignLinks = Driver.get().findElements(By.xpath("//section[contains(@class,\'"+category+"\')]/ul/li/a"));
          return campaignLinks;
      }

      public static void writeCategoryNameAndLinks() throws IOException {
        List<String> campaingCategoriesAndLinks = new ArrayList<>();

        for(WebElement category : getCategories().subList(1,getCategories().size())){

                for (WebElement campaign : getCampaignLinks(category.getAttribute("class"))) {
                    Helper.clickWithSpanText(category.getText()); //Click category with spanText

                    campaingCategoriesAndLinks.add(category.getText() +" "+campaign.getAttribute("href"));
                    // Add category names and category links to campaignCategoriesAndLinks list.
                }
        }

        //WriteToExcel
        for(int i=0; i<campaingCategoriesAndLinks.size();i++){
            ExcelUtils.writeToExcel("Campaigns",campaingCategoriesAndLinks,i,0);
        }



      }

}






