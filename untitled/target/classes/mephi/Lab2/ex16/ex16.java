package mephi.Lab2.ex16;

public class ex16 {
    public static void main(String[] args) {

        Queue myQueue = new Queue();
        String[] phrase = new String[]{"You", "know", "nothing", ",", "John", "Snow", "!"};
        for (int i = 0; i <phrase.length; i++){
            myQueue.add(myQueue,phrase[i]);
        }
        myQueue.print(myQueue);
        System.out.println();
        myQueue.remove(myQueue);
        myQueue.print(myQueue);
    }

}