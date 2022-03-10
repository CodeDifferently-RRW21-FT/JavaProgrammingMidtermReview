package com.codedifferently.review.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {

    private ArrayList<Book> books;
    private ArrayList<String> badInput;

    public Main(){
        books = new ArrayList<>();
        badInput = new ArrayList<>();
    }

    public String readDataFromFile(String location) throws IOException {
        Path fileName = Path.of(location);
        String rawData = Files.readString(fileName);
        return rawData;
    }

    public void parseAndAdd(String input){
        try {
            Book book = BookParser.parseStringToBook(input);
            books.add(book);
        } catch (BookParserException e) {
            badInput.add(input);
        }
    }

    public void start(){
        try {
            String data = readDataFromFile("./files/SampleData01.txt");
            String[] dataItems = data.split("#");
            for (String dataItem:dataItems) {
                parseAndAdd(dataItem);
            }
            for(String d:badInput){
                System.out.println(d);
            }
            System.out.println("We could not parse " + badInput.size() + " books");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
