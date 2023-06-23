package test_;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.FileInputStream;
import java.io.IOException;




public class test {
	
	 private static WebDriver webDriver = null;
	 public static <Dim> void main(String[] args) throws  InterruptedException{



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\irem\\Seleniu\\ChromeDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        
        
        webDriver.manage().window().maximize();
        Thread.sleep(2000);
        webDriver.get("https:\\www.gratis.com");
        Thread.sleep(2000);
        
		
        
       Actions actions = new Actions(webDriver);
       

        WebElement ciltMenu = webDriver.findElement(By.xpath("//*[@class='category-502 mega-menu-drop ng-star-inserted']"));
        actions.moveToElement(ciltMenu);
        actions.click().build().perform();
        Thread.sleep(2000);
        WebElement elementName = webDriver.findElement(By.linkText("Cilt Temizleme Ürünleri"));
        elementName.click();
        Thread.sleep(2000);
        WebElement ciltMenu2 = webDriver.findElement(By.xpath("//*[@class='header-content']"));
        actions.moveToElement(ciltMenu2);
        actions.click().build().perform();
        Thread.sleep(2000);
        
        
       // WebElement slider = webDriver.findElement(By.xpath("//*[@id='slider']/span"));
      //  Actions action = new Actions (webDriver);
       // actions.moveToElement(slider).dragAndDropBy(slider, 150, 0).build().perform();
       // System.out.println("Slide Action performed.");
        
        Actions action = new Actions (webDriver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(3000);
        
        WebElement neu = webDriver.findElement(By.xpath("//*[@class='value facet-value-link facet-value-link-for-multi-select ng-star-inserted']"));
        neu.click();
        Thread.sleep(5000);
        
        Actions action2 = new Actions (webDriver);
        action2.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(5000);
        
        WebElement beu = webDriver.findElement(By.xpath("//*[@class='value facet-value-link facet-value-link-for-multi-select ng-star-inserted'][2]"));
        beu.click();
        Thread.sleep(3000);
        
        WebElement elementName2 = webDriver.findElement(By.linkText("Filtreleri Temizle"));
        elementName2.click();
        Thread.sleep(3000);
        
        WebElement asa = webDriver.findElement(By.xpath("/html/body/app-root/app-custom-storefront/div/main/cx-page-layout/cx-page-slot/app-product-grid/div/div/div/div[3]/cx-page-slot/app-custom-product-list/div/div[2]/div/app-custom-product-grid-item[1]/div/div[1]/a/app-custom-media"));
        asa.click();
        Thread.sleep(3000);
        Actions action3= new Actions (webDriver);
        action3.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(5000);
        
     
        WebElement elementName4= webDriver.findElement(By.xpath("//*[@class='add-to-basket round-btns fat']"));
        elementName4.click();
        Thread.sleep(3000);
	 
       
       webDriver.close();
    
	 

        
	 }
    }