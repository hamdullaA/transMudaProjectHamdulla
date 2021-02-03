package com.transmuda.tests;

import com.transmuda.pages.LoginPage;
import org.testng.annotations.Test;

public class test {

    @Test
    public void test1(){

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();
        System.out.println("test successfully");
    }
}
