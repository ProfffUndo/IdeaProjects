package mephi.Lab5.dop.tryresoursesstacktrace;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleSupressed {
    public static void main(String[] args) throws IOException {
        demoSuppressedException("");
        demoAddSuppressedException("");
    }
    public static void demoSuppressedException(String filePath) throws IOException {
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new IOException(e);
        } finally {
            fileIn.close();
        }
    }

    public static void demoAddSuppressedException(String filePath) throws IOException {
        Exception firstException = null;
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(filePath);
        } catch (IOException e) {
            firstException = e;
        } finally {
            try {
                fileIn.close();
            } catch (NullPointerException npe) {
                if (firstException != null) {
                    npe.addSuppressed(firstException);
                }
                throw npe;
            }
        }
    }
}
