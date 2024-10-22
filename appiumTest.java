package com.example.myapplication;// This sample code supports Appium Java client >=9
// https://github.com/appium/java-client

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        UiAutomator2Options desiredCapabilities = new UiAutomator2Options();

        desiredCapabilities.setCapability("appium:deviceName", "Pixel 2 API 29");
        desiredCapabilities.setCapability("appium:avd", "Pixel_2_API_29");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "10");
        desiredCapabilities.setCapability("appium:appPackage", "com.example.myapplication");
        desiredCapabilities.setCapability("appium:appActivity", "com.example.myapplication.MainActivity");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");

        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);



        URL remoteUrl = new URL("http://127.0.0.1:4723");


        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        driver.findElement(AppiumBy.id("com.example.myapplication:id/textView3")).click();
        driver.findElement(AppiumBy.id("com.example.myapplication:id/editText1")).sendKeys("2");
        driver.findElement(AppiumBy.id("com.example.myapplication:id/editText2")).sendKeys("3");
        driver.findElement(AppiumBy.id("com.example.myapplication:id/button")).click();
        String actual = driver.findElement(AppiumBy.id("com.example.myapplication:id/textView3")).getText();
        Assert.assertEquals("8.0", actual);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

