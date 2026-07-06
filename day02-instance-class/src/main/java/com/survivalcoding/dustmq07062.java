package com.survivalcoding;

public class dustmq07062 {
    public static String getPath(String path, String fileName) {
        if (path.endsWith("\\")) {
            return path + fileName;
        }

        return path + "\\" + fileName;
    }

    public static void main(String[] args) {
        System.out.println(getPath("C:\\dev", "abc.txt"));
        System.out.println(getPath("C:\\dev\\", "abc.txt"));
    }
}

 /* String regex1 = ".*";
String regex2 = "A\\d\\d?";
String regex3 = "U[A-Z]{3}";

        System.out.println("ABC".matches(regex1));
        System.out.println("A12".matches(regex2));
        System.out.println("A1".matches(regex2));
        System.out.println("UABC".matches(regex3));
        }
        }


  */