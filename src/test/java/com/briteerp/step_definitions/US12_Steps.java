package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.pages.POSManagerHomePage_Lorena;
import com.briteerp.pages.RepairsPage_Lorena;
import com.briteerp.pages.SalesMangerHomePage_Lorena;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US12_Steps {

    LoginPage loginPage = new LoginPage();
    RepairsPage_Lorena repairsPage = new RepairsPage_Lorena();
    POSManagerHomePage_Lorena posManagerHomePage = new POSManagerHomePage_Lorena();
    SalesMangerHomePage_Lorena salesMangerHomePage = new SalesMangerHomePage_Lorena();

    @Given("POS Manager is able login")
    public void pos_manager_is_able_login() {
        loginPage.login(ConfigurationReader.getProperty("posManager_username"), ConfigurationReader.getProperty("posManger_password"));



    }
    @Then("POS Manager clicks on repairs link on homepage")
    public void pos_manager_clicks_on_repairs_link_on_homepage() {
        posManagerHomePage.repairsLink.click();

    }
    @Then("user can select all the repair orders by clicking top checkbox")
    public void user_can_select_all_the_repair_orders_by_clicking_top_checkbox() {
        repairsPage.selectAllCheckbox.click();


        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//tr//input[@type='checkbox']"));

        for (WebElement each : checkboxes) {
            Assert.assertTrue(each.isSelected());
        }

    }



    @Given("Sales Manger is able to login")
    public void sales_manger_is_able_to_login() {
        loginPage.login(ConfigurationReader.getProperty("salesManger_Username"),ConfigurationReader.getProperty("salesManger_Password"));
    }


    @Then("Sales Manger clicks on repairs link on homepage")
    public void sales_manger_clicks_on_repairs_link_on_homepage() {

    salesMangerHomePage.repairsLink.click();

    }

}
