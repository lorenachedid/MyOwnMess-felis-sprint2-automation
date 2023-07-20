package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//*[@id='login']")
    public WebElement inputEmail;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void login(String username,String password){
        inputEmail.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }



}
