package com.survivalcoding;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        StrongBox<Gold> goldBox = new StrongBox<Gold>();

        KeyType keyType = KeyType.PADLOCK;

        for (int i = 1; i <= keyType.ordinal(); i++) {
            if (i == keyType.ordinal()) {
                System.out.println(keyType);
                
            } else {
                return;
            }
        }
    }
}