import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ComparePlansTest {

  @Test
  void loadingEnterprisePage(){

    open("https://github.com/");

    $(".header-menu-wrapper").$(byText("Solutions")).hover();
    $(byText("Enterprise")).click();

    $(".font-mktg").shouldHave(text("Build like the best"));
  }
}
