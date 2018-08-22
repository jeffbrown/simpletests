package simpletests

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class BookControllerSpec extends Specification implements ControllerUnitTest<BookController> {

    Closure doWithSpring() {{ ->
        bookService BookService
    }}

    void "test list action"() {
        given:
        params.max = 10

        when:
        Map result = controller.list()

        then:
        result.books != null
        result.books.size() == 10
    }
}
