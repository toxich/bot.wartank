package ma.wartank.bot;

import java.io.IOException;

import ma.wartank.bot.pages.LoginPage;
import ma.wartank.bot.pages.PageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {

    private WebDriver driver;

    public Main(String[] args) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        driver = new FirefoxDriver(desiredCapabilities);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main(args);
        main.run();
    }

    private void run() throws IOException {
        PageBase.setDriver(driver);
        new LoginPage()
            .open()
            .login("tcc", "tccwartank");

        System.out.println("AAA");
        System.in.read();
        driver.quit();
    }

}
