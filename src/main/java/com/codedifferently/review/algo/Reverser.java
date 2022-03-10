package com.codedifferently.review.algo;

public class Reverser {

    public static String reverseThisString(String input){
        StringBuilder output = new StringBuilder();
        // Start ; End ; How much do i want to move
        for(int x = input.length()-1; x >=0; x--){
            output.append(input.charAt(x));
        }
        return output.toString();
    }

    public static String reverseThisStringV2(String input){
        String output = "";
        // Start ; End ; How much do i want to move
        for(int x = input.length()-1; x >=0; x--){
            output  += input.charAt(x);
        }
        return output;
    }
}
