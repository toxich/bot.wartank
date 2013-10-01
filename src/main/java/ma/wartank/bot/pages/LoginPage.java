package ma.wartank.bot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends PageBase<LoginPage>{

    @FindBy(how = How.NAME, using = "login")
    private WebElement loginField;
    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordField;
    @FindBy(how = How.CLASS_NAME, using = "w100")
    private WebElement enterBtn;

    public LoginPage enterLogin(String name) {
        loginField.clear();
        loginField.sendKeys(name);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage pressEnterBtn() {
        enterBtn.click();
        return this;
    }

    public LoginPage login(String name, String password) {
        enterLogin(name);
        enterPassword(password);
        pressEnterBtn();
        return this;
    }

    public String getBaseUrl() {
        return "http://wartank.ru";
    }


}
