package mephi.Lab5.dop.tryresoursesstacktrace;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NewExampleSupressed {
    public static void main(String[] args) throws Throwable {
        String path = "C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt";
        String printWriterPath = "C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles2.txt";
        Scanner scanner = null;
        PrintWriter printWriter = null;
        Throwable throwable = null;
        try {
            scanner = new Scanner(path);
            printWriter = new PrintWriter(printWriterPath);
            while (scanner.hasNext()) {
                printWriter.print(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throwable = e;
        } finally {
            try {
                if (scanner != null) {
                    scanner.close();
                }
                if (printWriter != null) {
                    printWriter.close();
                }
            } catch (Exception ex) {
                if (throwable != null) {
                    throwable.addSuppressed(ex);
                    ex.printStackTrace();
                }else {
                    throwable = ex;
                }
            }
        }
        if (throwable != null){
            throw throwable;
        }
    }
}
