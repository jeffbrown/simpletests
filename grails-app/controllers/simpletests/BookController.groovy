package simpletests

class BookController {
    BookService bookService

    def list() {
        int max = params.int("max")
        List books = bookService.list(max)
        [books:books]
    }
}
