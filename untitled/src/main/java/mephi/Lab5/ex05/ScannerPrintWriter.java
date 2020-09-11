package mephi.Lab5.ex05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerPrintWriter {
    public static void main(String[] args) {

    }
    public static void withoutResourses (String scannerFileName, String printWriterFileName){
        Scanner scanner = null;
        PrintWriter printWriter = null;

        try {
            scanner = new Scanner (Paths.get(scannerFileName));
            printWriter= new PrintWriter(printWriterFileName);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        catch (InvalidPathException e){
            e.printStackTrace();
        }
        catch (IllegalStateException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (scanner !=null)
                scanner.close();
            if (printWriter != null)
                printWriter.close();
        }

    }
}
