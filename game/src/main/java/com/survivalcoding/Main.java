package com.survivalcoding;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성


        Person_collection person1 = new Person_collection("홍길동");
        Person_collection person2 = new Person_collection("한석봉");

        ArrayList<String> personcList = new ArrayList<String>();
        personcList.add(peron1);
        personcList.add(peron2);


        for (int i=0;i < personcList.size(); i++) {
            System.out.println(personcList.get(i));
        }

        Map<String, Integer> identitis = new HashMap<>();
        identitis.put("홍길동", 20);
        identitis.put("한석봉", 25);
        System.out.println(person1 + "의 나이는 " + identitis.get("홍길동") + "살");
        System.out.println(person2 + "의 나이는 " + identitis.get("한석봉") + "살");





    }
}