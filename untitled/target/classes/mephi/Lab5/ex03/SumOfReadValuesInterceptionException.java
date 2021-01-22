package mephi.Lab5.ex03;

import mephi.Lab5.ex02.SumOfReadValues;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class SumOfReadValuesInterceptionException {

    public static void main(String[] args) {

            String filename="C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt";
        sumOfValues(filename);


    }

    public static void sumOfValues(String filename){
        SumOfReadValues sumOfReadValues = new SumOfReadValues();

        try{
            double sum=sumOfReadValues.sumOfValues(filename);
            System.out.println(sum);
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        catch (InputMismatchException e){
            e.printStackTrace();
        }
    }

}
