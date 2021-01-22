package mephi.Lab7.Ex15;

public class Test {
    public static void main(String[] args) {

        ImmutableListIntFunction immutableList = new ImmutableListIntFunction(7, (i)->i*2);

        System.out.println(immutableList.get(5));

        for (Integer integer : immutableList) {
            System.out.println(integer);
        }

        System.out.println(immutableList.contains(5));
        System.out.println(immutableList.contains(4));
    }

}
