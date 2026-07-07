package com.survivalcoding;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(",");
        }

        String str = sb.toString();

        String[] a = str.split(",");

        FileUtil fileUtil = new FileUtil();

        String result = fileUtil.getPath("C:\\dev", "abc.txt");

        System.out.println(result);
    }
}

