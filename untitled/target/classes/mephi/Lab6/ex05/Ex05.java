package mephi.Lab6.ex05;

public class Ex05 {
    public static <T> T[] swap(int i, int j, T... values) {

        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;

        return values;
    }

    public static void main(String args[]) {

        //Double[] result = swap(0,1, 1.5, 2, 3);
        //cannot convert from Number&Comparable<?>&Constable&ConstantDesc[] to Double[]

        //Double[] result = Ex05.<Double>swap(0, 1, 1.5, 2, 3);
        //The parameterized method <Double>swap(int, int, Double...) is not
        //applicable for the arguments (int, int, Double, Integer, Integer)

        /*
         T...значит array of T, такой же как T[].
          В нем не может быть двух типов.
         */
       // Double[] result = swap(0,1,1.5,2d,3d);
    }
}
