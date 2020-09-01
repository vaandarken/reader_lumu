package com.wordreader.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;

public class Reader {
   public static void wordCounter(String[] list) {
        Map<String, Integer> mapCounter = new TreeMap<>();

       for (String i : list) {
           Integer j = mapCounter.get(i);
           mapCounter.put(i, (j == null) ? 1 : j + 1);
       }
       for (Map.Entry<String, Integer> val : mapCounter.entrySet( )) {
           System.out.println(val.getKey()+ ": " + val.getValue());
       }
   }



    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/INPUT.txt"));
        String text;

        ArrayList<String> wordCount = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while ((text = reader.readLine()) != null) {
            stringBuilder.append(text).append("\n");
            wordCount.add(stringBuilder.toString().trim());
        }

        String readerToString = stringBuilder.toString();
        String[] wordsRead = readerToString.split("\\s+");

        wordCounter(wordsRead);
        reader.close();

        //System.out.println(wordCount);
        System.out.println("\n");
        System.out.println(wordsRead.length + " words");
        System.out.println(stringBuilder.toString().length() + " Characters");
    }


}
