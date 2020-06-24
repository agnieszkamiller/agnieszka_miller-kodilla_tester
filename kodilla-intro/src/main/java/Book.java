public class Book {
    private String author;
    private String title;
    private static String of;
//    Komentarz jednolinijkowy - Ctrl + /
// Shift + strzałki

    public static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }

    public static void main(String[] args) {
        Book book = Book.of("Adam Wajrak", "Wilki");
//        System.out.println(book.toString());
        Book book1 = Book.of("Henryk Sienkiewicz", "W pustyni i w puszczy");
//        System.out.println(book1.toString());

        Book[] books = {book, book1, Book.of("Tony Gaddis", "Java dla początkujących"),
                Book.of("Andrzej Sapkowski", "Wiedzmin")};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
//        for (int i = books.length - 1; i >= 0; i--) {
//            System.out.println(books[i]);
//        }

    }

    @Override
    public String toString() {
        return "autor: " + author + ", tytuł: " + title;
    }
}
