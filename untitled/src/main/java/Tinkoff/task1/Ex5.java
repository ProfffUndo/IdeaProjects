package Tinkoff.task1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line = in.nextLine();
        int palindromeLength = 0;
        if (line.length()>0){
            palindromeLength++;
        }
        int checkLength = 2;
        for (int i=2; i<=line.length(); i++){
            if(check(checkLength,line)) {
                palindromeLength=checkLength;
                checkLength++;
            }
            else{
                checkLength++;
            }
        }
        System.out.println(palindromeLength);
        System.out.println(getPalindrome(palindromeLength,line));
    }
    public static String getPalindrome(int checkLength, String line){
        for(int i =0; i<=line.length()-checkLength;i++){
            String subline = line.substring(i, i+checkLength);
            if (isPalindrome(subline)){
                return subline;
            }
        }
        return "ERROR";
    }

    public static boolean check(int checkLength, String line){
        boolean res = false;
        for(int i =0; i<=line.length()-checkLength;i++){
        String subline = line.substring(i, i+checkLength);
        if (isPalindrome(subline)){
            res=true;
            break;
            }
        }
        return res;
    }

    public static boolean isPalindrome(String subline){
        boolean res = true;
        int first = 0;
        int last = subline.length()-1;
        while ((last > first)){
            if (subline.charAt(first++)!=subline.charAt(last--)){
                res=false;
                break;
            }
        }
        return res;
    }
}
