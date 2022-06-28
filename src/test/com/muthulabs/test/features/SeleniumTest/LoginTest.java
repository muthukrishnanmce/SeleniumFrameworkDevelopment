package com.muthulabs.test.features.SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Before
    public void initialize(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


    }

    @Test
    public void login() {
        System.out.println("hello");
    }
}
