package mephi.Lab5.ex07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerResourses {
    public static void main(){
        try(Scanner in = new Scanner(Paths.get("C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt")); PrintWriter out = new PrintWriter("C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles2.txt"))
            {
                while(in.hasNext())
                    out.println(in.next().toLowerCase());

            } catch (IOException e) {
            e.getMessage();
            }
        }


}
