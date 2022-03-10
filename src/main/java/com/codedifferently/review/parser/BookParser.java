package com.codedifferently.review.parser;

public class BookParser {

    public static Book parseStringToBook(String input){
        String[] elements = input.split(";");
        Book book = new Book();
        for (int x = 0; x < elements.length;x++) {
            switch (x){
                case 0:
                    setValueOfTitle(book, elements[x]);
                    break;
                case 1:
                    setValueYear(book,elements[x]);
                    break;
                case 2:
                    setValueAuthor(book, elements[x]);
                    break;
                default:
                    break;
            }
        }
        return book;
    }

    private static void setValueOfTitle(Book book, String input){
        String[] keyValue = input.split(":");
        book.setTitle(keyValue[1]);
    }

    private static void setValueYear(Book book, String input){
        String[] keyValue = input.split(":");
        book.setYearPublished(Integer.parseInt(keyValue[1]));
    }

    private static void setValueAuthor(Book book, String input){
        String[] keyValue = input.split(":");
        book.setAuthor(keyValue[1]);
    }
}
