package mephi.Lab5.ex02;

import mephi.Lab5.ex01.ReadValues;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class SumOfReadValues {
        public static void main (String args[]) throws FileNotFoundException {

            System.out.println(sumOfValues("C:\\Users\\s_myslov\\IdeaProjects\\IdeaProjects\\untitled\\doubles.txt"));

        }


        public static double sumOfValues(String fileName) throws FileNotFoundException  {

            double sum = 0;

            try {
                for (Double d : ReadValues.readValues(fileName))
                    sum += d;

            }catch(InputMismatchException ex) {
                throw ex;
            }
            return sum;
        }
    }
