package com.survivalcoding;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket();
        String name = "";

        pocket.put(1);
        pocket.put("33");
        pocket.put(true);

        Pocket<String> pocket1 = new Pocket<>();
        pocket1.put("333");
        String value = pocket1.get();
        //   int number = (int) pocket.get();
    }
}