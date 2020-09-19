package mephi.Lab5.dop.tryresoursesstacktrace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExampleTryFinally {
    public static void main(String[] args) {
        Scanner scanner = null;
        PrintWriter writer = null;
        try{
            scanner = new Scanner(new File("C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt"));
            writer = new PrintWriter(new File("C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles2.txt"));
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }

            if (writer != null) {
                writer.close();
            }

        }
    }

}
