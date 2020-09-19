package mephi.Lab5.dop.tryresoursesstacktrace;

import mephi.Lab5.ex04.ReadValuesErrorCodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleErrorCodevsException {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt";
        ArrayList<Double> arrayList = null;
        sumValues(filename,arrayList);
    }


    private static void readValues(String fileName, ArrayList<Double> arrayList) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext())
                arrayList.add(scanner.nextDouble());
        } catch (FileNotFoundException | InputMismatchException e) {
           throw e;
        }
    }

    public static void sumValues(String fileName, ArrayList<Double> arrayList) throws FileNotFoundException {

        readValues(fileName, arrayList);

        double sum=0;

        for (Double d : arrayList)
            sum+=d;

        System.out.printf("Sum is: %f\n", sum);

    }
}
