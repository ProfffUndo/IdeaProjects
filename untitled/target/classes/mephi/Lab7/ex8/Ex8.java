package mephi.Lab7.ex8;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Ex8 {
    public static void main(String... args) throws IOException {
        Map<String,Set<Integer>> words = new HashMap<>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        InputStream in = Ex8.class.getResourceAsStream("wordsEx7.txt");
        InputStream in2 = Ex8.class.getResourceAsStream("/mephi/Lab7/ex8/wordsEx7.txt");
        try(Scanner scanner = new Scanner(new InputStreamReader(in))) {
            int lineno = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (String word : line.split("\\W+")) {
                    word = word.toUpperCase();
                    if (!words.containsKey(word)) {
                        Set<Integer> lines = new HashSet<>();
                        lines.add(lineno);
                        words.put(word, lines);
                    } else {
                        words.get(word).add(lineno);
                    }
                }
                lineno++;
            }
        }
        words.forEach((k,v) -> {
            System.out.println("word: " + k);
            String sep = "";
            for (int line: v) {
                System.out.printf("%s%d",sep,line);
                sep = ", ";
            }
            System.out.println();
        });
    }

}

