package com.learningselenium.pages.pageObjectModel.VWO;

import com.learningselenium.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreeTrialPage {

    WebDriver driver;

    public FreeTrialPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page locator

    private By start_free_trial = By.xpath("//a[.//span[text()='Start a FREE TRIAL']]");
    private By email_id = By.xpath("//*[@id='page-v1-step1-email']");
    private By click_on_radio_button = By.xpath("//*[@id='page-free-trial-step1-cu-gdpr-consent-checkbox']");
    private By click_on_free_trial_button = By.xpath("(//button[@data-qa='page-su-submit'])[1]");

    private By first_name = By.xpath("//input[@id='page-v1-fname']");
    private By last_name = By.xpath("//input[@id='page-v1-lname']");


    private By ph_number = By.xpath("//input[@id='page-v1-pnumber']");

    private By click_on_button = By.xpath("(//button[@data-qa='page-su-submit'])[2]");


    public void setStart_free_trial() {
        driver.findElement(start_free_trial).click();
    }

    public void switching_a_tab() {

        // 1. Actually switch to the new tab/window
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

    }

    public String create_free_trial(String emailId) {
        driver.findElement(email_id).sendKeys(emailId);

        driver.findElement(click_on_radio_button).click();

        driver.findElement(click_on_free_trial_button).click();

        WaitHelpers.waitJVM(20000);
        return emailId;
    }



    public void provide_info(String firstName, String lastName, String phNumber){

        driver.findElement(first_name).sendKeys(firstName);
        driver.findElement(last_name).sendKeys(lastName);
        driver.findElement(ph_number).sendKeys(phNumber);

        driver.findElement(click_on_button).click();

        WaitHelpers.waitJVM(30000);


    }

}
