package com.survivalcoding;

public class Word {
    private String letters;

    public Word(String letters){
        this.letters=letters;
    }


    public boolean isVowel(int i){ //i 번째 글자만 추출하겠다는 의미
        String c= letters.substring(i, i+1).toLowerCase(); //toLowerCase는 대소문자 상관없이 비교하기전에 소문자로 통일 후 저장|출력..
        return "aeiou".contains(c); //후보 중에 c가 포함되었는지 여부 판단?
    }
    public boolean isConsonant(int i){
        String c= letters.substring(i, i+1).toLowerCase(); //i는 어디서 부터 i+1어디까지라는 의미 📌
        return "bcdefghjklmnpqrstvwxyz".contains(c);
    }
}

