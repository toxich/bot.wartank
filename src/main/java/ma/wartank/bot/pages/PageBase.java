package ma.wartank.bot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase<SELF_TYPE extends PageBase<SELF_TYPE>> {

    public abstract String getBaseUrl();

    protected static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        PageBase.driver = driver;
    }

    public SELF_TYPE open() {
        driver.get(getBaseUrl());

        return opened();
    }


    @SuppressWarnings("unchecked")
    public SELF_TYPE opened() {
        PageFactory.initElements(driver, this);
        return ((SELF_TYPE) this);
    }

    public static<T extends PageBase<T>> T alreadyOpened(T page) {
        return page.opened();
    }
}
