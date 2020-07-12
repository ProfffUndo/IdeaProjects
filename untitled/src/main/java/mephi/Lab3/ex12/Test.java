package mephi.Lab3.ex12;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        File dir = new File(".");
        File [] paths = dir.listFiles();
        Arrays.sort(paths, Comparator.comparing(File::isFile).thenComparing(File::getName));
        for (File path: paths){
            System.out.println(path);
        }

    }
}