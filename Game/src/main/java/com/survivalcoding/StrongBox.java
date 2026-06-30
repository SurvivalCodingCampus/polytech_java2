package com.survivalcoding;

public class StrongBox<T> {

    public enum KeyType {
        PADLOCK, // 자물쇠 (1024회)
        BUTTON, // 버튼 (10000회)
        DIAL, // 다이얼 (30000회)
        FINGER // 지문 (1000000회)
    }

    private T item;
    private KeyType keyType;
    private long count;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
        this.count = 0;
    }

    public T get() {
        this.count++;
        long recount = 0;

        switch (this.keyType) {
            case PADLOCK:
                recount = 1024;
                break;
            case BUTTON:
                recount = 10000;
                break;
            case DIAL:
                recount = 30000;
                break;
            case FINGER:
                recount = 1000000;
                break;
        }
        if (this.count < recount) {
            return null;
        }
        return this.item;
    }

    public void put(T item) {
        this.item = item;
    }
}
