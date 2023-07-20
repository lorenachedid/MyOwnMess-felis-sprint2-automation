package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesMangerHomePage_Lorena {

    public SalesMangerHomePage_Lorena(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@href='/web#menu_id=535&action=723']")
    public WebElement repairsLink;




}
