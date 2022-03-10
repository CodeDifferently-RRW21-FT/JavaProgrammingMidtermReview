package com.codedifferently.review.parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookParserTester {


    @Test
    public void parseStringToBookTest01(){
        String input = "title:Moby Dick;yearPublished:1851;author:Herman Melville";
        Book expected = new Book("Moby Dick", 1851, "Herman Melville");
        Book actual = BookParser.parseStringToBook(input);
        Assertions.assertEquals(expected.toString(), actual.toString());
    }
}
