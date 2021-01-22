package mephi.Lab3.ex11;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester{
    public static void main(String[] args) {
    ArrayList<String> ar = new ArrayList<String>();
    ar = getFilesWithExtension("/home/alexander",".txt");
    for(int i=0; i<ar.size(); i++){
        System.out.println(ar.get(i));
    }
    }
    public static ArrayList<String> getFilesWithExtension(String directory, String extension) {
        File dir = new File(directory);
        String[] files = dir.list((dir1, name) -> name.endsWith(extension));
        return new ArrayList<String>(Arrays.asList(files));
    }
}