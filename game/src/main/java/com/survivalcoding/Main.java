package com.survivalcoding;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        StringBuilder num = new StringBuilder();

        for (int i = 1; i < 101; i++) {
            num.append(i);
            if (i < 100) {
                num.append(",");
            }
        }

        java.lang.String[] a = num.toString().split(",");
        for (java.lang.String word : a) {
            System.out.println(word + "->");
        }

        System.out.println(getPath("C:\\User", "file.txt"));

        String string1 = "^A\\d[\\d^a-z]";
        String string2 = "^U[a-z^0-9{3}]";

        System.out.println("^A\\d[\\d^a-z]");
        System.out.println("^U[a-z^0-9{3}]");


    }

    static java.lang.String getPath(java.lang.String path, java.lang.String fileName) {
        StringBuilder thePath = new StringBuilder();

        thePath.append(path);

        if (!path.endsWith("\\")) {
            thePath.append("\\");
        }

        thePath.append(fileName);
        return thePath.toString();
    }


}