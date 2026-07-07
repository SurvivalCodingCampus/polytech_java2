package com.survivalcoding;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        // 1. 객체 생성
        Word word1 = new Word("Apple");
        Word word2 = new Word("Hello!");

        // 2. toString() 출력 확인
        System.out.println("단어 1: " + word1);
        System.out.println("단어 2: " + word2);
        System.out.println("-------------------------");

        // 3. 모음/자음 판별 테스트 (Apple)
        System.out.println("[Apple]");
        System.out.println("Index 0 ('A') is Vowel?" + word1.isVowel(0)); // true (대소문자 처리 확인)
        System.out.println("Index 1 ('p') is Consonant?" + word1.isConsonant(1)); // true
        System.out.println("Index 4 ('e') is Consonant?" + word1.isConsonant(4)); // false
        System.out.println("-------------------------");

        // 4. 특수문자 예외 처리 테스트 (Hello!)
        System.out.println("[Hello!]");
        System.out.println("Index 5 ('!') is Vowel?" + word2.isVowel(5)); // false
        System.out.println("Index 5 ('!') is Consonant?" + word2.isConsonant(5)); // false (isLetter 덕분에 false)
    }
}