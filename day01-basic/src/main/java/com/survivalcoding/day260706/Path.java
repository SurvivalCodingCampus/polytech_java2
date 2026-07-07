package com.survivalcoding.day260706;

public class Path {
    private String path;
    private String fileName;


    public String getPath(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;

        StringBuilder sb = new StringBuilder();

        sb.append(path);

        if (!path.matches(".*\\\\$")) {
            sb.append("\\");
        }
        return sb.append(fileName).toString();
    }

    /**
     *  1) 모든 문자열 : ".*"
     *  2) 최초 첫번째 문자는 A, 두번쨰 문자는 숫자, 세번째 문자는 숫자이거나 아무것도 없거나 : "^A[0-9][0-9]?$"
     *  3) 최초 첫번째 문자는 U, 2~4번째 문자는 영어 대문자 : "^U[A-Z]{3}$"
     */
}
