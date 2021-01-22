package mephi.Lab6.dop.presentation.task4;

import mephi.Lab6.dop.Person;

import java.util.ArrayList;
import java.util.List;

public class HeapPollution {
    public static void main(String[] args) {

        List<String> strings = (List) new ArrayList<Integer>();

        List<String> list = getList();
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.get(0));





        List <String> [] strings2 = new List[42]; //Generic array Exception
        Object[] stringsAsObjects = strings2;
        stringsAsObjects[0]=new ArrayList<Number>();

        List<?>[] objects  = new List<?>[42];


    }
    @SuppressWarnings("unchecked")
    public static List<String> getList(){
        List list = new ArrayList<Person>();
        list.add(new Person("David"));
        list.add("You know man...I am string!");
        List<String> listStr =list;
        return list;
    }




}
