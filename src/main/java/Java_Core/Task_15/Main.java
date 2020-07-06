package Java_Core.Task_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)
    {

        String line;
        Path path = Paths.get("C:\\Disc D\\test.txt");
        WordsCounter wordsCounter = new WordsCounter();

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while ((line = reader.readLine()) != null) {
                wordsCounter.count(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        wordsCounter.printCountedWords();
    }
}
