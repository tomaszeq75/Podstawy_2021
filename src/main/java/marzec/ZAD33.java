package marzec;

import java.io.File;

public class ZAD33 {
    public static void main(String[] args) {
        String path = "c:\\Users\\twoly\\Documents\\SDA_Projects\\Podstawy_2021\\";

        searchFiles(path);
    }

    private static void searchFiles(String path) {
        File file = new File(path);

//        for (File f : file.listFiles()) {
//            System.out.println(f.getName());
//        }

        File[] java = file.listFiles(f -> f.getName().endsWith(".java"));

        System.out.println(file.getParent());

        for (File file1 : java) {
            System.out.println(file1.getName());
        }

        // rekurencja
        File[] dirs = file.listFiles(f -> f.isDirectory());
        for (File dir : dirs) {
            searchFiles(path + "\\" + dir.getName());
        }
    }


}
