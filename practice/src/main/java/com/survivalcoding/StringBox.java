package com.survivalcoding;

//열쇠의 종류는 다음 4종류, 사용횟수의 한도가 정해짐
enum KeyType {
    PADLOCK(1024),
    BUTTON(10000),
    DIAL(30000),
    FINGER(1000000);

    private final int limit;
    private int count = 0;

    KeyType(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return this.limit;
    }
}


public class StringBox<E> {
    private E item;
    private KeyType keyType;
    private int count = 0;

    public StringBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public void put(E item) {
        this.item = item;
    }

    public E get() {
        //호출할 때마다 해당 금고의 카운트 증가
        this.count++;

        //한계에 도달했는지 확인
        if (this.count >= keyType.getLimit()) {
            return this.item;
        } else {
            return null;
        }
    }

}