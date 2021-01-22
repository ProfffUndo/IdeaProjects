package mephi.Lab2.MyArrayList;

public class MyArrayList<String> {
    private final int coeff = 4;
    private Object[] array = new Object[10];
    private int counter = 0;



    public void add(String item) {   //Добавление в конец
        if(counter == array.length-1)
            resize(array.length*3/2+1); // увеличу в  раза, если достигли границ
        array[counter++] = item;
    }


    public String get(int index) { // Возвращение по индексу
        return (String) array[index];
    }

    public void set(String item, int index){ //Установление значения
        if (index >= size()) {
            System.out.println("Incorrect index");;
        }
        else {
            array[index] = item;
        }
    }

    public void remove(int index) {  //Удаление элемента
        for (int i = index; i<counter; i++)
            array[i] = array[i+1];
        array[counter] = null;
        counter--;
        if (array.length > 10 && counter < array.length / coeff)
            resize(array.length/2); // если элементов в coeff раз меньше чем уменьшаем в два раза
    }

    public int size() {
        return counter;
    }

    private void resize(int newLength) { //Изменение размера
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, counter);
        array = newArray;
    }
}