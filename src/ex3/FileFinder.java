package ex3;

import java.io.File;

public class FileFinder {

    public static void find(File root, String filename) {

        // Check current file
        if (root.getName().equals(filename)) {
            System.out.println("File Found: " + root.getAbsolutePath());
        }

        if (root.isDirectory()) {// if directory
            File[] children  = root.listFiles();

            if (children != null) {
                for (File child : children) {
                    find(child, filename);
                }
            }
        }

    }

    public static void main(String[] args) {
        find(new File("C:\\Users\\amina"), "test1.txt");  // change to your path & file
    }
}

