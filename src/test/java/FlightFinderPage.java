import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightFinderPage {
    WebDriver driver;

    public FlightFinderPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.CSS, using = "#modalPopup > div > div > div.modal-header > button > span")
    @CacheLookup
    WebElement iksic;
    @FindBy(how = How.CSS, using = "#u_0_0 > div > div > div > div > div > div > div._9095 > div._9dzn > div.oajrlxb2.i85zmo3j.g4a3q09b.mtkw9kbi.tlpljxtp.qensuy8j.ppp5ayq2.goun2846.ccm00jje.s44p3ltw.mk2mc5f4.rt8b4zig.n8ej3o3l.agehan2d.sk4xxmp2.rq0escxv.nhd2j8a9.alzwoclg.mg4g778l.btwxx1t3.pfnyh3mw.p7hjln8o.m8h3af8h.l7ghb35v.kjdc1dyq.j0k7ypqs.tgvbjcpo.hpfvmrgz.jb3vyjys.rz4wbd8a.qt6c0cv9.a8nywdso.l9j0dhe7.i1ao9s8h.esuyzwwr.f1sip0of.du4w35lb.icdlwmnq.abiwlrkh.p8dawk7l.r0esl6yt.cpoadq8x.gb2oqlaf.qmqpeqxj.e7u6y3za.qwcclf47.nmlomj2f.jcxyg2ei > i")
    WebElement chat;

    @FindBy(how = How.NAME, using = "fromCity")
    @CacheLookup
    WebElement fromCity;
    @FindBy(how = How.CSS, using = "#ui-id-13")
    @CacheLookup
    WebElement fromCityclick;
    @FindBy(how = How.NAME, using = "toCity")
    @CacheLookup
    WebElement toCity;
    @FindBy(how = How.XPATH, using = "/html/body/ul[8]/li/a")
    @CacheLookup
    WebElement toCityclick;

    @FindBy(how = How.NAME, using = "departDate")
    @CacheLookup
    WebElement fromDate;
    @FindBy(how = How.CSS, using = "body > div:nth-child(54) > div.datepicker-days > table > thead > tr:nth-child(1) > th.next")
    @CacheLookup
    WebElement fromDateNext;

    @FindBy(how = How.NAME, using = "returnDate")
    @CacheLookup
    WebElement toDate;
    @FindBy(how = How.CSS, using = "body > div.cc-window.cc-banner.cc-type-info.cc-theme-classic.cc-bottom.cc-color-override-1827372716 > div > a")
    @CacheLookup
    WebElement GotItButton;
    @FindBy(how = How.CSS, using = "body > div:nth-child(55) > div.datepicker-days > table > thead > tr:nth-child(1) > th.next")
    @CacheLookup
    WebElement toDateNext;
    @FindBy(how = How.CSS, using = "body > div:nth-child(55) > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(3)")
    @CacheLookup
    WebElement toDateDate;

    @FindBy(how = How.NAME, using = "adults")
    @CacheLookup
    WebElement airline;
    @FindBy(how = How.NAME, using = "cabinClass")
    @CacheLookup
    WebElement cabinClass;
    @FindBy(how = How.XPATH, using = "//html/body/div[8]/div[2]/div/div/div[2]/div/div[1]/form/div/div/div/div[2]/div[4]/div/div/button")
    @CacheLookup
    WebElement findFlights;

    @FindBy(how = How.XPATH, using = ".//*[@value='Business']")
    @CacheLookup
    WebElement serviceClass;

    public void continueWordPress(String fCity, String tCity, String fDate, String tDate, String cClass, String aline1) {
        try {
            Thread.sleep(2000);
            iksic.click();
         /*  Thread.sleep(2000);
            chat.click();*/

            Thread.sleep(2000);
            fromCity.sendKeys(fCity);
            Thread.sleep(2000);
            fromCityclick.click();
            Thread.sleep(2000);
            toCity.sendKeys(tCity);
            Thread.sleep(2000);
            toCityclick.click();

            Thread.sleep(2000);
            fromDate.click();
            Thread.sleep(2000);
            fromDateNext.click();

            Thread.sleep(2000);
            toDate.click();
            Thread.sleep(2000);
            GotItButton.click();
            Thread.sleep(2000);
            toDate.click();
            Thread.sleep(2000);
            toDateNext.click();
            Thread.sleep(2000);
            toDateDate.click();

            Thread.sleep(2000);
            airline.sendKeys(aline1);
            Thread.sleep(2000);
            cabinClass.sendKeys(cClass);
            Thread.sleep(2000);
            findFlights.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
