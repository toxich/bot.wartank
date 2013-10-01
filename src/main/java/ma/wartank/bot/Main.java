package ma.wartank.bot;

import java.io.IOException;

import ma.wartank.bot.pages.AngarPage;
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
        new Main(args).run();
    }

    private void run() throws IOException {
        PageBase.setDriver(driver);
        AngarPage angar =  new LoginPage()
            .open()
            .login("tcc", "tccwartank");

        System.out.println("Gold: " + angar.getGoldCount());
        angar.openBuildings();
        System.in.read();
        driver.quit();
    }

}
