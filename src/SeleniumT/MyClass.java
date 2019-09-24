package SeleniumT;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MyClass {


    public static void main(String[] args) {
    	// create a Firefox Web Driver
    	System.setProperty("webdriver.gecko.driver", "D:/Drivers/Selenium/geckodriver.exe");
    			WebDriver driver = new FirefoxDriver();
    			// open the browser and go to JavaTutorial Network Website
    			/*driver.get("https://javatutorial.net");
    			// find the search button on the page
    			WebElement searchButton = driver.findElement(By
    					.className("search-submit"));
    			// create an action handler
    			Actions actions = new Actions(driver);
    			// use the action handler to move the cursor to given element
    			actions.moveToElement(searchButton).perform();
    			// wait until the search field is presented on the webpage and create an
    			// element
    			WebElement searchField = (new WebDriverWait(driver, 10))
    					.until(ExpectedConditions.presenceOfElementLocated(By.name("s")));
    			// puts the text "java" into the search field
    			searchField.sendKeys("java");
    			// submit the search (submit the form)
    			searchField.submit();
    			// wait 5 seconds and close the browser
    			//Thread.sleep(5000);
    			//driver.quit();*/
    			
    			
    			String baseUrl = "http://demo.guru99.com/test/newtours/";
    	        String expectedTitle = "Welcome: Mercury Tours";
    	        String actualTitle = "";

    	        // launch Fire fox and direct it to the Base URL
    	        driver.get(baseUrl);

    	        // get the actual value of the title
    	        actualTitle = driver.getTitle();

    	        /*
    	         * compare the actual title of the page with the expected one and print
    	         * the result as "Passed" or "Failed"
    	         */
    	        if (actualTitle.contentEquals(expectedTitle)){
    	            System.out.println("Test Passed!");
    	        } else {
    	            System.out.println("Test Failed");
    	        }
    	       
    	        //close Fire fox
    	        driver.close();
       
    }

}