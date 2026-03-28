package com.learningselenium.tests.VWO;

import com.learningselenium.pages.pageObjectModel.VWO.FreeTrialPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestVWOFreeTrial3 {

    @Owner("Ashutosh")
    @Description("Start a free trial with new account")
    @Test
    public  void testVWOFreetrial3()
    {
        // Driver Manager Code - 1 - D
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        // Page Class Code (POM Code) - 2 - L
        FreeTrialPage  freeTrialPage = new FreeTrialPage(driver);

        // calling a function for starting a free trial
        freeTrialPage.setStart_free_trial();

        // calling a function for switching a tab after clicking on free trial button
        freeTrialPage.switching_a_tab();

        // calling a function for providing info of emailid,
        freeTrialPage.create_free_trial("yby64@tempumail.cc");

        // providing firstname, lastname and phone and click on button

        freeTrialPage.provide_info("john", "wick", "7894561230");




        driver.quit();


    }




}
