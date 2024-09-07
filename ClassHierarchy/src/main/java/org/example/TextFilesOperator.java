package org.example;

import java.io.File;
import java.util.Set;
import java.util.HashSet;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import java.nio.charset.StandardCharsets;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextFilesOperator {
    private static final Logger logger = LogManager.getLogger(TextFilesOperator.class);

    public static void calculateNumberOfUniqueWords(String path) {
        // Read text from the file and calculate the numbers of the unique words. Write the result to the file.
        // The main requirement is: using StringUtils and FileUtils to implement it with minimum lines of code.

        File textFile = new File(path);

        try {
            String content = FileUtils.readFileToString(textFile, "UTF-8").replaceAll("\\r\\n|\\r|\\n", " ");

            Set<String> uniqueWords = new HashSet<>();
            Set<String> repeatedWords = new HashSet<>();
            String[] wordsSeparated = StringUtils.split(content, " ");

            for (String word : wordsSeparated) {
                if (!uniqueWords.add(word)) { // add(word) returns false when the element is repeated
                    repeatedWords.add(word);
                }
            }
            uniqueWords.removeAll(repeatedWords);
            logger.info("Repeated words: " + convertSetToOneString(repeatedWords));

            FileUtils.writeStringToFile(textFile, "\nUnique words count: " + uniqueWords.size(), StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String convertSetToOneString(Set<String> setString) {
        StringBuilder oneString = new StringBuilder();

        for (String word : setString) {
            oneString.append(word).append(" ");
        }

        return oneString.toString();
    }

}
