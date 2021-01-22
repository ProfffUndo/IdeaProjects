package mephi.Lab3.ex4;

public interface IntSequence {
    default boolean hasNext(){
        return true;
    }
    int next();

    static IntSequence of(int... values) {
        return new IntSequence() {
        private int counter =0;

            @Override
            public boolean hasNext() {
                return counter<values.length;
            }

            @Override
            public int next() {
                if (hasNext()) {
                    return values[counter++];
                }
                else return 0;
            }
        };
    }
//использовать лямбда в четвертом
    static IntSequence constant(int c){
        return ()->c;
    }
}
