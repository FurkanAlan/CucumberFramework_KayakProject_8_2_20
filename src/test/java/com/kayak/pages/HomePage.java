package com.kayak.pages;

import com.kayak.utilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonMethods {
    @FindBy(xpath = "(//a[@aria-label='Flights'])")
    public WebElement flightElement;

}
