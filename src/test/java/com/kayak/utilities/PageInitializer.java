package com.kayak.utilities;


import com.kayak.pages.HomePage;

public class PageInitializer extends MyDriver {
    public static HomePage homePage;

    public static void initializeAllPages() {
        homePage = new HomePage();

    }
}
