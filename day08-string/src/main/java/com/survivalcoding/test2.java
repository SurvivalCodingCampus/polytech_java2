package com.survivalcoding;

public class test2 {
    String getPath(String path, String fileName) {
        path = path.replaceAll("\\\\$", "");
        return String.format("%s\\%s", path, fileName);
    }

    public static void main(String[] args) {
        test2 t = new test2();
        System.out.println(t.getPath("C:\\dev", "abc.txt"));
        System.out.println(t.getPath("C:\\dev\\", "abc.txt"));
    }
}