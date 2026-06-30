package com.survivalcoding;

public class StrongBox<E> {

    private final KeyType keyType;
    private final int maxCount;

    private E data;
    private int count;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;

        switch (keyType) {
            case KeyType.PADLOCK:
                maxCount = 1_024;
                break;
            case KeyType.BUTTON:
                maxCount = 10_000;
                break;
            case KeyType.DIAL:
                maxCount = 30_000;
                break;
            default:
                maxCount = 1_000_000;
        }
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        count++;

        // 체크
        if (count < maxCount) {
            return null;
        }

        return this.data;
    }
}
