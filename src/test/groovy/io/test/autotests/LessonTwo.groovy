package io.test.autotests

import org.junit.Test
import static com.codeborne.selenide.Selenide.*
import static com.codeborne.selenide.Condition.*

class LessonTwo {
    @Test
    public void debugTst() {
        def searchRequest = "Cat"

        open("https://google.com/")
        def searchInput = $(By.name("q"))
        searchInput.value = searchRequest
        searchInput.pressEnter()

        def found = $$("#ires .g")
        assert found.size() > 0
        assert found.first().text.contains(searchRequest)
    }
}
