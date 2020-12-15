package mephi.Lab7.ex18;

import java.util.Collections;
import java.util.List;

public class Ex18 {

    public static void main(String[] args) {
    List e = Collections.EMPTY_LIST; //сырой тип
        @SuppressWarnings({ "unchecked" })
        List<String> s = (List<String>) e;

        List<String> g = Collections.emptyList();
    }


}
