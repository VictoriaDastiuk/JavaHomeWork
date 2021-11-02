package com.pb.datsiuk.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "ПБ", "05.09.1996", "+380958723452");
        Reader[] readers = {reader1};

        Book book1 = new Book("Приключения", "Иванов И. И.", "2000 р");
        Book book2 = new Book("Словарь", "Сидоров А.В.", "1980 р");
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", "2010 р");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader1.takeBook(books);

        reader1.returnBook(3);
        reader1.returnBook(books);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книжок:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читачів:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
