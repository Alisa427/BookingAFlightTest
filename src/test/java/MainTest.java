import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MainTest {
    public MainTest() {

    }

    @Test
    public void returnTicket() {
        try {
            WebDriver driver = BrowserSetup.getDriver();
            System.out.println("in returnTicket");
            driver.get("https://www.mercurytravels.co.in/flights");

            WebDriverWait myDynamicElement = new WebDriverWait(driver, 10);
            myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='modalPopup']")));
            FlightFinderPage flightFinderPage = PageFactory.initElements(driver, FlightFinderPage.class);
            flightFinderPage.continueWordPress("Sarajevo", "Zurich", "10", "3", "Business Class", "2");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
