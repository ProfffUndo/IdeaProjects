package mephi.Lab5.ex04;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class ReadValuesErrorCodes {
    public static void main(String[] args) {
        String filename = "C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt";
        ArrayList<Double> arrayList = null;
        sumValues(filename,arrayList);

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


    public static Status sumValues(String fileName, ArrayList<Double> arrayList) {

        Status result = readValues(fileName, arrayList);

        if (result == Status.SUCCESS) {
            double sum = 0;

            for (Double d : arrayList)
                sum += d;

            System.out.printf("Sum is: %f\n", sum);

            return Status.SUCCESS;
        }
        else if (result == Status.FILE_NOT_FOUND){
            System.out.println("Ошибка. Не найден файл.");
        }
        else if (result ==Status.VALUE_NOT_DOUBLE) {
            System.out.println("Ошибка. Значение не double");
        }
        return result;
    }
}
