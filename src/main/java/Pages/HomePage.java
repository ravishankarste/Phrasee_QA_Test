package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass {
    WebDriver driver;
    @FindBy(how = How.NAME, using = "email")
    public WebElement usernameTextBox;
    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@title='Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//button[@title='Login' or @type='submit']")
    public WebElement logoutButton;
    @FindBy(xpath = "//li[contains(@class, 'campaign')]")
    public WebElement createCampaignLink;
    @FindBy(xpath = "//div[@data-cy='email']")
    public WebElement emailTab;
    @FindBy(xpath = "//button[contains(@data-cy='submit')]")
    public WebElement nextBtn;
    @FindBy(xpath = "//input[@id='campaign_setup_own_subject_line']")
    public WebElement subjectLine;
    @FindBy(how = How.NAME, using = "PRODUCTS")
    public WebElement productName;
    @FindBy(how = How.NAME, using = "DISCOUNT_PERCENT")
    public WebElement discount;
    @FindBy(xpath = "//button[contains(@data-cy, 'magic-button')]")
    public WebElement magicBtn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String username) {
        usernameTextBox.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordTextBox.sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void clickOnCampaignLink() {
        createCampaignLink.click();
    }

    public void clickOnEmailTab() {
        implicitWait();
        emailTab.click();
        implicitWait();
    }

    public void clickOptionFromDropdown(String option) {
        driver.findElement(By.xpath("//div[contains(text(), 'Select')]")).click();
        implicitWait();
        WebElement ele = driver.findElement(By.xpath("//li[contains(text(),'" + option + "')]"));
        ele.click();
        implicitWait();
    }

    public void enterTextToSubjectLineField() {
        WebElement ele1 = driver.findElement(By.xpath("//textarea[@id='campaign_setup_own_subject_line']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele1).click().sendKeys("Human line").build().perform();
        implicitWait();
    }

    public void enterTextToCampaignNameField() {
        WebElement camName = driver.findElement(By.xpath("//input[@id='campaign_setup_campaign_name']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(camName).click().sendKeys("Test").build().perform();
    }

    public void enterTextToAudienceSizeField() {
        WebElement camName = driver.findElement(By.xpath("//input[@id='campaign_setup_list_size']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(camName).click().sendKeys("500000").build().perform();
    }

    public void enterTextToAvgOpenRateField() {
        WebElement camName = driver.findElement(By.xpath("//input[@id='campaign_setup_baseline_open_rate']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(camName).click().sendKeys("25.00").build().perform();
        clickOnCampaignLink();
    }

    public void clickOnNextBtn() {
        WebElement btnNext = driver.findElement(By.xpath("//button[@data-cy='campaign-setup-submit-button']"));
        Actions actions = new Actions(driver);
        try {
            actions.moveToElement(btnNext).click().build().perform();
            btnNext.click();
        } catch (Exception ex) {
            System.out.println("If there is an exception" + ex.getMessage());
        }
        implicitWait();
    }

    public void clickOnmagicBtn() {
        magicBtn.click();
    }

    public void selectEmailDate() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement ele1 = driver.findElement(By.xpath("//i[contains(@class, 'calendar-picker-icon')] | //span[@class='ant-calendar-picker ant-calendar-picker-small'] | //input[@data-cy='date']"));
        wait.until(ExpectedConditions.elementToBeClickable(ele1)).click();
        WebElement ele = driver.findElement(By.xpath("//a[contains(@class, 'today-btn')]"));
        wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
    }
}