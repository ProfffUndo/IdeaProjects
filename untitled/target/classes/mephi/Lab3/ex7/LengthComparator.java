package mephi.Lab3.ex7;

import java.util.Comparator;

class LengthComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
