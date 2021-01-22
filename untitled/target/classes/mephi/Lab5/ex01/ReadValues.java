package mephi.Lab5.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadValues {
    public static void main(String[] args) throws FileNotFoundException {
       ArrayList<Double> doubleArray = readValues("C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt");
        for (int i=0; i<doubleArray.size(); i++)
            System.out.println(doubleArray.get(i));
    }

    public static ArrayList<Double> readValues(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);
        ArrayList<Double> doubleList = new ArrayList();

        try {
            while(fileScanner.hasNext())
                doubleList.add(fileScanner.nextDouble());

        }//Keep throwing the exception because of question requirements
        catch(InputMismatchException ex) {
            throw ex;
           }
        finally {
            fileScanner.close();
        }

        return doubleList;
    }
}
