package mephi.Lab7.ex7;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex7 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        String f = "C:\\GitHub\\IdeaProjects\\untitled\\src\\main\\java\\mephi\\Lab7\\wordsEx7.txt";
        try(Scanner s = new Scanner(Paths.get(f));OutputStream out = Files.newOutputStream(Paths.get("Info.out"));) {
            while (s.hasNextLine()) {
                for (String e : s.nextLine().toLowerCase().split("[\\P{L}]+")) {
                    if (e.matches("\\s*")) continue;
                    tm.merge(e, 1, Integer::sum);
                }
            }
            String x;
            for (String k : tm.keySet()) {
                x = String.format("%1$-16s : %2$d\n", k, tm.get(k));
                out.write(x.getBytes(StandardCharsets.UTF_8));
            }
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
    }

