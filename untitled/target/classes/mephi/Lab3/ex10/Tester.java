package mephi.Lab3.ex10;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        ArrayList<File> ar = new ArrayList<File>();
        ar =  subdir("/home");
        for(int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

    }
    static ArrayList<File> subdir(String pathname) {
        ArrayList result = new ArrayList<File>();
        File path = new File(pathname);
        File[] subdirs = path.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        result.addAll(Arrays.asList(subdirs));
        return result;
    }

    static ArrayList<File> subdirLambda(String pathname) {
        ArrayList  result = new ArrayList<File>();
        File path = new File(pathname);
        File[] subdirs = path.listFiles(pathname1 -> pathname1.isDirectory());
        result.addAll(Arrays.asList(subdirs));
        return result;
    }

    static ArrayList<File> subdirReference(String pathname) {
        ArrayList result = new ArrayList<File>();
        File path = new File(pathname);
        File[] subdirs = path.listFiles(File::isDirectory);
        result.addAll(Arrays.asList(subdirs));
        return result;
    }

}
