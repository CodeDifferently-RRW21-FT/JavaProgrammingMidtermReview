package com.codedifferently.review.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverserTest {

    @Test
    @DisplayName("First Test for Reversing a String")
    public void reverseThisStringTest01(){
        // Given
        String input = "abcd";

        // When
        String expected = "dcba";
        String actual = Reverser.reverseThisString(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Second Test for Reversing a String")
    public void reverseThisStringTest02(){
        // Given
        String input = "XYZ";

        // When
        String expected = "ZYX";
        String actual = Reverser.reverseThisString(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
