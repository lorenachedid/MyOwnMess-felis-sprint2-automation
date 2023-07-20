package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairsPage_Lorena {

    public RepairsPage_Lorena(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//th[@class='o_list_record_selector']/div/input")
    public WebElement selectAllCheckbox;





}
