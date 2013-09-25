package ma.wartank.bot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {

    private WebDriver driver;

    public Main(String[] args) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        driver = new FirefoxDriver(desiredCapabilities);
    }

    public static void main(String[] args) {
        Main main = new Main(args);
        main.run();

    }

    private void run() {
        driver.get("http://wartank.ru");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
