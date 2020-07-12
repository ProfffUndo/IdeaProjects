package mephi.Lab2.MyArrayList;

public class Tester {
    public static void main(String[] args) {
        MyArrayList example = new MyArrayList();
        String str1 = "You";
        String str2 = "know";
        String str3 = "nothing";
        String str4 = ",";
        String str5 = "John";
        String str6 = "Snow";
        example.add(str1);
        example.set(str2, 3);
        example.size();
        example.get(1);
        example.get(2);
        example.get(3);
        example.remove(3);
    }
}
