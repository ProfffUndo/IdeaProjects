package mephi.Lab6.ex03;

public class Application {
    public static void main(String[] args) {
        Table<Integer, String> table = new Table<>();

        table.setValue(11,"F");
        table.setValue(22,"K");
        table.getValue(11);
        table.getValue(22);
        table.removeValue(11);
        table.getValue(11);

    }
}
