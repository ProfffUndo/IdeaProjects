package mephi.Lab1.ex01;
import java.util.Scanner;
import java.lang.Integer;

public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Строим объект Scanner, присоединяемый к System.in (У System.in чтение только отдельных байтов)
        System.out.println("Please, enter the decimal number");
        int number10 = in.nextInt();   // Можно было считать строку через nextLine, затем с parseInt переводить в разные системы и затем обратно в строку
        String str2 = Integer.toString(number10,2);
        String str8 = Integer.toString(number10,8);
        String str16 = Integer.toString(number10,16);
        double reverse =  (1.0/number10);
        String strReverse = Double.toHexString(reverse);
        System.out.println("This is a binary system");
        System.out.println(str2);
        System.out.println("This is an octal system");
        System.out.println(str8);
        System.out.println("This is a hex system");
        System.out.println(str16);
        System.out.println("This is a reverse value");
        System.out.println(strReverse);
        // String s = "Hello World!";
       // System.out.println(s);
    }
}
//add 1000 str po 4 char 1symbol - stolko byte; collector skolko v resultate pamyati v tom i inom slucae budet izrashodovanno