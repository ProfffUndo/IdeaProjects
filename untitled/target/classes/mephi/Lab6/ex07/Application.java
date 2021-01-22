package mephi.Lab6.ex07;

public class Application {
    public static void main(String[] args) {
        Pair stringPair = new Pair<String>("Alex","Danila");
        Pair integerPair = new Pair<>(300, 5213);

        System.out.println(stringPair);
        System.out.println(stringPair.getFirst());
        System.out.println(stringPair.getSecond());

        System.out.println(integerPair);
        System.out.println(integerPair.getFirst());
        System.out.println(integerPair.getSecond());
    }
}
