import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;

public class HerokuappDragAndDropTests {

  @BeforeEach
  void beforeEach() {
    open("https://the-internet.herokuapp.com/drag_and_drop");
  }


  @Test
  void dragAndDropTest() {
    $("#column-a").dragAndDrop(to("#column-b"));

    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));
  }

  @Test
  void actionsTest() {
    actions().clickAndHold($("#column-a"))
            .moveToElement($("#column-b"))
            .release()
            .perform();

    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));
  }
}