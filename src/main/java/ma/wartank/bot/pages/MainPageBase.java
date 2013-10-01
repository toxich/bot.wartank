package ma.wartank.bot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class MainPageBase<T extends PageBase<T>> extends PageBase<T> {

    @FindBy(css = "td.lh1:nth-child(1)")
    private WebElement oilCounter;
    @FindBy(css = "td.small:nth-child(2)")
    private WebElement goldCounter;
    @FindBy(css = "td.small:nth-child(3)")
    private WebElement silverCounter;
    @FindBy(linkText = "¿Õ√¿–")
    private WebElement angarBtn;
    @FindBy(linkText = "¬ ¡Œ…!")
    private WebElement fightBtn;
    //@FindBy(xpath = "//span[.='¡‡Á‡']")
    @FindBy(linkText = "¡¿«¿")
    private WebElement baseBtn;

    public int getGoldCount() {
        return textAsInt(goldCounter);
    }

    public int getOilCount() {
        return textAsInt(oilCounter);
    }

    public int getSilverCount() {
        return textAsInt(silverCounter);
    }

    protected int textAsInt(WebElement counter) {
        return Integer.parseInt(counter.getText());
    }

    public AngarPage openAngar() {
        angarBtn.click();
        return alreadyOpened(new AngarPage());
    }

    public BattlePage openFight() {
        fightBtn.click();
        return alreadyOpened(new BattlePage());
    }

    public BuildingsPage openBuildings() {
        baseBtn.click();
        return alreadyOpened(new BuildingsPage());
    }
}
