//import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTests {

    @Test
    void selenideSearchTest()  {
        //открыть Google
        open("https://www.google.com/");

        //Ввести Selenide в поиск
        $x("//input[@name='q']").setValue("Selenide").pressEnter();

        //Проверить, что Selenide появился в результатах поиска
        $x("//div[@id='search']").shouldHave(text("selenide.org"));
    }
}
