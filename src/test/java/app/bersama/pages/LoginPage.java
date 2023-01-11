package app.bersama.pages;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author regiewby on 16/12/22
 * @project java-cucumber-mobile
 */
public class LoginPage {

    private AppiumDriver driver;

    public LoginPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Mulai Sekarang\"]")
    private WebElement button_Start;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView[2]")
    private WebElement tap_phoneNo;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[1]")
    private WebElement enter_phoneNo;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[2]")
    private WebElement input_Password;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Log in\"]")
    private WebElement button_Login;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Coba cara lain\"]")
    private WebElement button_CobaCaraLain;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")
    private WebElement entry_NIK;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Apa nama salah satu Kantong kamu?\"]")
    private WebElement button_pocketName;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.EditText")
    private WebElement entryAnswerPocketName;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Kirim\"]")
    private WebElement button_send;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"8\"]")
    private WebElement button_8;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"9\"]")
    private WebElement button_9;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home\n" + "Tab 1 of 5\"]")
    private WebElement home_button;

    public void entryCredential(String PhoneNo, String Password){
        button_Start.click();
        tap_phoneNo.click();
        enter_phoneNo.sendKeys(PhoneNo);
        input_Password.click();
        input_Password.sendKeys(Password);
        button_send.click();
    }

    public void loginStep(String NIK, String PocketName){
        button_Login.click();
        button_CobaCaraLain.click();
        Keyword.enterText(entry_NIK, NIK);
        Keyword.enterText(button_pocketName, PocketName);
    }
}
