package Java_Core.Task_15;

import java.util.Map;
import java.util.TreeMap;

public class WordsCounter {
    private Map<String, Integer> wordsMap = new TreeMap<>();
    private final String SPLITSYMBOLS = "[\\d{1} \t\n,.;:!?<>*\\[\\]'&@#$%\"()-]";

    // method to count words in given string line
    public void count(String string) {
        String[] words = string.toLowerCase().split(SPLITSYMBOLS);     // break the line to words[] array using split

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                if (wordsMap.containsKey(words[i])) {
                    wordsMap.put(words[i], wordsMap.get(words[i]) + 1);
                } else {
                    wordsMap.put(words[i], 1);
                }
            }
        }
    }

    public void printCountedWords() {
        for (Map.Entry entry : wordsMap.entrySet()) {
            System.out.printf("%s - %d \n",entry.getKey(), entry.getValue());
        }
    }
}
