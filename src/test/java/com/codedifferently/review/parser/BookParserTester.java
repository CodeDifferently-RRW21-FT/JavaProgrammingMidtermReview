package com.codedifferently.review.parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookParserTester {

    @Test
    public void parseStringToBookTest01() throws BookParserException{
        String input = "title:Moby Dick;yearPublished:1851;author:Herman Melville";
        Book expected = new Book("Moby Dick", 1851, "Herman Melville");
        Book actual = BookParser.parseStringToBook(input);
        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void parseStringToBookTest02() throws BookParserException{
        String input = "yearPublished:1851;author:Herman Melville;title:Moby Dick";
        Book expected = new Book("Moby Dick", 1851, "Herman Melville");
        Book actual = BookParser.parseStringToBook(input);
        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void parseStringToBookTest03() {
        Assertions.assertThrows(BookParserException.class, () ->{
                String input = "yearPublished:1851;author:Herman Melville;tile:Moby Dick";
                BookParser.parseStringToBook(input);
        });

    }

}
