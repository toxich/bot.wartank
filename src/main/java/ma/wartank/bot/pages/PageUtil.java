package ma.wartank.bot.pages;

public class PageUtil {


    public static<T extends PageBase<T>> T alreadyOpened(T page) {
        return page.opened();
    }
}
