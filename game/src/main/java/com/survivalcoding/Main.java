package com.survivalcoding;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        Cleric cleric1 = new Cleric("아서스", 40, 5);
        Cleric cleric2 = new Cleric("아서스", 35);
        Cleric cleric3 = new Cleric("아서스");
        //Cleric cleric4 = new Cleric();

        System.out.println(cleric1.name + cleric1.hp + cleric1.mp);
        System.out.println(cleric2.name + cleric2.hp + cleric2.mp);
        System.out.println(cleric3.name + cleric3.hp + cleric3.mp);
        //System.out.println(cleric4);



    }
}