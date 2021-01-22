package mephi.Lab3.dop0;



public class Main {
    public static void main(String[] args) {
        String1time time1 = new String1time();
        String2time time2 = new String2time();
        String3time time3 = new String3time();
        letsShow("Hello!", time1 );
    }

    public static void letsShow(String str,MyString myStr){
        myStr.show(str);
    }
}

//Переделать на более