package com.transmuda.tests;

import com.transmuda.TestBase;
import com.transmuda.pages.LoginPage;
import org.testng.annotations.Test;

public class test extends TestBase {

    @Test
    public void test1() {
        extentLogger = report.createTest("first test");

        extentLogger.info("Login as a driver");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();
        System.out.println("test successfully");
    }
}
