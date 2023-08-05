package main.com.wordreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map;




public class Reader {

    public static List reader(String[] list) {

        //organize the characters read on a HashMap
        Map<String, Integer> mapCounter = new HashMap<>();
        for (String i : list) {
            Integer j = mapCounter.get(i);
            mapCounter.put(i, (j == null) ? 1 : j + 1);
        }

        //Sort the items in the HashMap ascending
        List<Map.Entry<String, Integer>> sortedMap = new ArrayList<>(mapCounter.entrySet());
        Collections.sort(sortedMap, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //organize the information on sortedMap
        for (Map.Entry<String, Integer> val : sortedMap) {
            System.out.println(val.getKey() + ": " + val.getValue());
        }
        return sortedMap;
    }


    public static void main(String[] args) throws IOException {

        //Read the input file
        String file_path = "C:\\Users\\vaand\\Documents\\Code projects\\reader\\src\\main\\resources\\INPUT.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file_path));
        String text;

        List<String> wordCount = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        //The information read is now mapped on the wordcount variable and the total characters on Stringbuilder
        while ((text = reader.readLine()) != null) {
            stringBuilder.append(text).append("\n");
            wordCount.add(stringBuilder.toString().trim());
        }


        String readerToString = stringBuilder.toString();
        String[] wordsRead = readerToString.split("\\s+");

        //Print results
        System.out.println("\n" + stringBuilder.toString().length() + " Characters \n");
        System.out.println(wordsRead.length + " words\n");

        reader(wordsRead);
        reader.close();

        //This code has a complexity of 0(n)

    }
}
