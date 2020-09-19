package mephi.Lab5.dop.tryresoursesstacktrace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(new File(""));
                PrintWriter writer = new PrintWriter(new File("C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles2.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

}
