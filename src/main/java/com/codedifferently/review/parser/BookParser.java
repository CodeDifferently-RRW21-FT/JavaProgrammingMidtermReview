package com.codedifferently.review.parser;

public class BookParser {

    public static Book parseStringToBook(String input) throws BookParserException {
        String[] elements = input.split(";");
        Book book = new Book();
        for(String element:elements){
            if(element.contains("title:")){
                setValueOfTitle(book, element);
            }else if(element.contains("yearPublished:")){
                setValueYear(book,element);
            }else if(element.contains("author:")){
                setValueAuthor(book, element);
            }else{
                throw new BookParserException("Missing Key");
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
