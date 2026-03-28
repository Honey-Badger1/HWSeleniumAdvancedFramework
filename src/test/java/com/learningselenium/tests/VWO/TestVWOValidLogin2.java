package com.learningselenium.tests.VWO;

import com.learningselenium.pages.pageObjectModel.VWO.DashboardPage;
import com.learningselenium.pages.pageObjectModel.VWO.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOValidLogin2 {

    @Owner("Ashutosh")
    @Description("Verify that with valid email, pass,logins and open Dashboard page.")
    @Test
    public void TestVWOValidLogin2(){
        // Driver Manager Code - 1 - D
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        // Page Class Code (POM Code) - 2 - L
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToVWOValidCreds("cxh04@tempumail.cc","ILoveDrive#08");
        // Assertions - 3 - V
        DashboardPage dashboardPage = new DashboardPage(driver);
        String loggedInUser = dashboardPage.loggedInUserName();
        Assert.assertEquals(loggedInUser, "Kishore J"); // Or whatever the expected name is
        driver.quit();

    }
}
