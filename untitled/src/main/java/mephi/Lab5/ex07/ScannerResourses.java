package mephi.Lab5.ex07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerResourses {
    public static void firstExample() throws IOException {
        try(Scanner in = new Scanner(Paths.get("some/path/...")); PrintWriter out = new PrintWriter("some fileName"))
            {
                while(in.hasNext())
                    out.println(in.next().toLowerCase());

            } catch (IOException e) {
            e.getMessage();
            }
        }


}
