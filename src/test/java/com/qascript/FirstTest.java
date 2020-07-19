package com.qascript;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FirstTest extends BaseTest {

    @Test
    public void LoginTest() throws MalformedURLException{

        getDriver().navigate().to("http://dbankdemo.com/login");
        Assert.assertTrue(getDriver().getTitle().equals("Digital Bank"));

    }
}
