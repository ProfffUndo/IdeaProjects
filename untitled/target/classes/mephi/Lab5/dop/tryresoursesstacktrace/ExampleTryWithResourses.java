package mephi.Lab5.dop.tryresoursesstacktrace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExampleTryWithResourses {
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
        } catch (FileNotFoundException ex) {
            throwable = ex;
        } finally { //Переписать потому что непонятно
            throwable = tryToClose(scanner,throwable);
            throwable = tryToClose(writer,throwable);
        }
        if (throwable != null){
            throw throwable;
        }
    }

    public static Throwable tryToClose(AutoCloseable ac, Throwable throwable){
        if (ac!=null){
            try{
                ac.close();
            }
            catch (Throwable thr){
                if (throwable!= null) throwable.addSuppressed(thr);
                else {
                    throwable=thr;
                }
                return throwable;

            }
        }
        return throwable;
    }

}
