# 2026-06-08 Instance, class, 과제

## 오늘 배운 내용

- Java 에서 JDK version은 21버전을 사용하며, 현장에서 제일 많이 사용한다.
- Java에서는 클래스 안에 함수를 작성하며, 그 함수를 메서드라고 정의한다.
- Java에서 stiring 은 첫 글자를 대문자로 한다. 'String'
- main 은 class 안에 존재하며, main 이라고 타이핑 하면 자동 완성이 된다.
- 객체는 모든 사물을 객체라 하고, class 는 오브젝트를 구체화 한 것이며, instance는 클래스를 활용 해 메모리 상에 만드는 것이다.
- 함수란 input 이 같으면 output 도 같고 단독으로 동작하는 것이 함수이다.
- 메서드는 클래스 안에 만드는 함수를 메서드라 하며 클래스의 기능이라고 볼 수 있다.
- 클래스 명은 단어의 맨 처음은 대문자로 시작한다.
- 필드 명은 최초 이외의 단어의 맨 처음은 대문자이다.
- 메소드 며은 최초 이외의 단어의 맨 처음은 대문자이다.
- 정의한 클래스로 인스턴스를 생성할 수 있고, 이 클래스로 생성한 인스턴스를 넣을 수 있는 새로운 변수의 타입이 이용 가능해진다.
- Intellij 프로그램 사용방법에 대해 배움

## 기억할 것

- 다른 언어 문자열과는 다르게 String 은 대문자로 시작한다.
- 메서드와 클래스의 구분
- main은 class 안에 존재해야 한다.
- 정의한 클래스로 인스턴스를 생성할 수 있다.

## 실습 코드

```java
class MainTest {

    @Test
    @DisplayName("정상적으로 회복되었습니다.")
    void main() {
        // given(준비)
        int MP, MaxHP, MaxMP;

        // when(실행)
        Cleric cleric = new Cleric();

        // then(검증)
        cleric.name = "Cleric";
        cleric.hp = 50;
        cleric.mp = 10;
        MaxHP = cleric.maxHp;
        MaxMP = cleric.maxMp;
        System.out.println(cleric.name + " Create");
        assertEquals("Cleric", cleric.name, "Cleric 캐릭터를 생성하지 못했습니다.");

        cleric.selfAid();
        System.out.println(cleric.name + " MP -5");
        assertEquals(5, cleric.mp, "Cleric MP 5가 소모되어야 합니다.");
        System.out.println("Now MP " + cleric.mp);
        assertEquals(5, cleric.mp, "현재 MP 5가 되지 않았습니다..");

        int result = cleric.pray(1);
        System.out.println(result);
        assertTrue(result >= 0 || result < 5, "MP 회복량이 정상적으로 회복되지 않았습니다.");
        System.out.println("Now MP " + cleric.mp);
    }
}
```

## 어려웠던 점

- 클래스와 메서드 그리고 객체의 차이점을 명확하게 알지 못했다.
- 테스트를 할 때 assert 를 쓰는 법을 파악하기 힘들었다.

## 해결 방법

- assert 에 있는게 많아서 AI 도움을 받아 활용 방법에 대해서 알게되었다.
- 맞지 않은 경우에만 나온다? 라는데 정확하게 맞는지 모르겠다.

## 내일 더 공부할 것

- 연습 및 실습한 코드를 좀 더 살펴보며 하나씩 뜯어보기
- 클래스를 선언하고 인스턴스로 불러오는 연습
- Intellij 프로그램 다루는 연습(Java)
