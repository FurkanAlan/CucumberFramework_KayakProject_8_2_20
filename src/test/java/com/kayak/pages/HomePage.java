package com.kayak.pages;

import com.kayak.utilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonMethods {
    @FindBy(xpath = "//a[@aria-label='signin']")
    public WebElement signIn;

    @FindBy(xpath = "(//div[@class='keel-grid'])[1]")
    public WebElement dropDownAddingPeople;

    @FindBy(xpath = "(//span[@class='icon plus _iN1 _jVE _ig1 _ig2'])[4]")
    public WebElement roomNumber;

    @FindBy(xpath = "(//span[@class='icon plus _iN1 _jVE _ig1 _ig2'])[5]")
    public WebElement adultNumber;

    @FindBy(xpath = "(//span[@class='icon plus _iN1 _jVE _ig1 _ig2'])[6]")
    public WebElement childNumber;

    @FindBy(xpath = "(//input[@aria-label='Destination input'])[1]")
    public WebElement searchBoxDestination;

    @FindBy(xpath = "//div[@title='Search hotels']")
    public WebElement searchHotels;

    //sendText(); metodu ile String tarih yolla 08/20/2020
    @FindBy(xpath = "(//div[@data-placeholder='Check-in'])[1]")
    public WebElement checkIn;

    //sendText(); metodu ile String tarih yolla 09/02/2020
    @FindBy(xpath = "(//div[@data-placeholder='Check-out'])[2]")
    public WebElement checkOut;


}

