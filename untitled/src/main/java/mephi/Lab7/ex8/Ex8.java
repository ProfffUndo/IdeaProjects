package mephi.Lab7.ex8;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Ex8 {
    public static void main(String... args) throws IOException {
        Map<String,Set<Integer>> words = new HashMap<>();
        Scanner scanner = new Scanner(new File("C:\\GitHub\\IdeaProjects\\untitled\\src\\main\\java\\mephi\\Lab7\\wordsEx7.txt"));
        int lineno = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (String word: line.split("\\W+")) {
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
        //print out words and lines
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

//TODO:: Брать файл из classpath, проверить работу
