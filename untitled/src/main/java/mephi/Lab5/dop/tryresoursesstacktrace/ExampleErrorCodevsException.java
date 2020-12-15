package mephi.Lab5.dop.tryresoursesstacktrace;

import mephi.Lab5.ex04.ReadValuesErrorCodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//Почему не все unchacked, какие преимущества у chacked

public class ExampleErrorCodevsException {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt";
        String filename2 = "C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles2.txt";
        ArrayList<Double> arrayList = null;
        sumValues(filename, filename2);
    }
    public enum Status {SUCCESS, FILE_NOT_FOUND, VALUE_NOT_DOUBLE}
    private static Status readValues(String fileName, ArrayList<Double> arrayList) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext())
                arrayList.add(scanner.nextDouble());
        } catch (FileNotFoundException e) {
            return Status.FILE_NOT_FOUND;
        } catch (InputMismatchException e) {
            return Status.VALUE_NOT_DOUBLE;
        }
        return Status.SUCCESS;
    }

    private static ArrayList<Double> readValues(String fileName) throws FileNotFoundException, InputMismatchException {
        ArrayList arrayList = new ArrayList<Double>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext())
                arrayList.add(scanner.nextDouble());
        } catch (FileNotFoundException | InputMismatchException e) {
            throw e;
        }
        return arrayList;
    }

    //Убрать sout, написать по очереди
    public static Status sumValues(String fileName, String filename2, ArrayList<Double> arrayList) {
        Status result = readValues(fileName, arrayList);
        if (result == Status.SUCCESS) {
            double sum = 0;
            for (Double d : arrayList)
                sum += d;
            System.out.printf("Sum is: %f\n", sum);
        }
        else return result;

        Status result2 = readValues(filename2,arrayList);
        if (result2 == Status.SUCCESS) {
            double sum = 0;
            for (Double d : arrayList)
                sum += d;
            System.out.printf("Sum is: %f\n", sum);
        }
        else return result;
        return result;
    }

    public static void sumValues(String fileName, String fileName2) throws FileNotFoundException, InputMismatchException {
        double sum=0;
        for (Double d1 : readValues(fileName))
            sum+=d1;
        for (Double d2: readValues(fileName2))
            sum+=d2;
        System.out.printf("Sum is: %f\n", sum);
    }
}
