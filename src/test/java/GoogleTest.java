import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;


/**
 * Created by we on 2017. 3. 14..
 */
public class GoogleTest {
    @Test
    public void google() throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/we/git/SeleniumTest/Driver/chromedriver");
        System.setProperty("selenide.browser", "Chrome");

        open("http://www.wemakeprice.com/");
        $(By.linkText("다시 보지 않기")).click();

        $(By.id("loginBtn")).click();

        $(By.id("login_uid")).setValue("dkswnsanjun").pressEnter();
        $(By.id("login_upw")).setValue("abcde").pressEnter();
    }
}
