package simpletests

class BookService {

    List list(int max) {
        (1..max).collect({ "Book-$it" })
    }
}
