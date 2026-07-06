package com.survivalcoding;

public class StrongBox<T> {
    //다음 조건을 만족하는 금고인 StrongBox 클래스를 정의하시오.
    //금고 클래스에 담을 인스턴스의 타입은 미정 (인스턴스 생성시 결정 함)
    //금고에는 1개의 인스턴스만 담을 수 있음
    //put() 메서드로 인스턴스를 저장하고 get() 메서드로 인스턴스를 얻을 있음
    //get() 으로 얻을 때는 별도의 타입 캐스팅을 사용하지 않아도 되도록 해야 함

    //연습문제 4-1에서 작성한 StrongBox 클래스에 열쇠의 종류를 나타내는 열거형 KeyType을 정의하고,
    //다음 내용을 반영하여 StrongBox 클래스를 수정하시오.
    //
    //열쇠의 종류를 생성자로 받아 저장하는 필드 추가
    //
    //단, 열쇠의 종류는 다음 4종류로 한정한다. 각 열쇠는 사용횟수의 한도가 정해져 있다.
    //
    //
    //PADLOCK    (1,024회)
    //BUTTON      (10,000회)
    //DIAL             (30,000회)
    //FINGER       (1,000,000회)
    //
    //금고에서 get() 메서드를 호출할 때 마다 사용횟수를 카운트하고 각 열쇠의 사용횟수에 도달하기 전에는 null을 리턴한다.
    //즉, 사용횟수에 도달하면 금고 안의 제품을 꺼낼 수 있다
    //즉, 사용횟수에 도달하면 금고 안의 제품을 꺼낼 수 있다

    private T data;
    private KeyType keyType = KeyType.PADLOCK;
    private int getMaxCount;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
        getMaxCount = keyType.getLimit();
    }

    public void put(T data) {
        this.data = data;

    }

    public int MaxCount() {
        return getMaxCount;
    }

    public T get() {

        return data;

    }


}
