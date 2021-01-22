package mephi.Lab1.ex10;

import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        Random r = new Random();
        int strLength = r.nextInt(10000);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            long num = r.nextLong(); //рандомизируем лонг
            String str1 = Long.toString(num, 36);  //переводим в строку и в нужную систему
            builder.append(str1); //добавляем к тому что уже есть
        }
        String result = builder.toString();
        System.out.println(result);
    }
}

