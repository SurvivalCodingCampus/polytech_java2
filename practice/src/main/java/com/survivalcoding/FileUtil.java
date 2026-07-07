package com.survivalcoding;

public class FileUtil {
    public String getPath(String path, String fileName) {
        if (!path.endsWith("\\")) {
            path = path + "\\";
        }
        return path + fileName;
    }
}
