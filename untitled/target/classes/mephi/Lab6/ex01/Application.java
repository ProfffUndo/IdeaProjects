package mephi.Lab6.ex01;

public class Application {
    public static void main(String[] args) {
        Stack <String> stringStack = new Stack<>();
        String string1 = "string1";
        String string2 = "string2";
        String string3 = "string3";

        stringStack.push(string1);
        stringStack.push(string2);
        stringStack.push(string3);
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();

    }


}
