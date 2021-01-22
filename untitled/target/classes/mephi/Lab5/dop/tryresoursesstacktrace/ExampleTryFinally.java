package mephi.Lab5.dop.tryresoursesstacktrace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExampleTryFinally {
    public static void main(String[] args) throws Throwable {
        Scanner scanner = null;
        PrintWriter writer = null;
        Throwable throwable = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt"));
            writer = new PrintWriter(new File("C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles2.txt"));
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        } catch (Exception ex) {
            throwable = ex;
        } finally { //Переписать потому что непонятно
            //throwable = tryToClose(scanner,throwable); как вариант
            Throwable closeScanner = tryToClose(scanner);
            Throwable closeWriter = tryToClose(writer);
            if (throwable == null && (closeScanner != null || closeWriter != null)) {
                if (closeScanner != null) {
                    throwable = closeScanner;
                    if (closeWriter != null) {
                        throwable.addSuppressed(closeWriter);
                    }
                }
            }

            if (closeScanner != null) {
                throwable.addSuppressed(closeScanner);
            }
            if (closeWriter != null) {
                if (throwable != null) {
                    throwable.addSuppressed(closeWriter);
                }
            }
        }
        if (throwable != null){
            throw throwable;
        }

    }

    public static Throwable tryToClose(AutoCloseable ac){
        if (ac!=null){
            try{
                ac.close();
            }
            catch (Throwable throwable){
                return throwable;
            }
        }
        return null;
    }
}
