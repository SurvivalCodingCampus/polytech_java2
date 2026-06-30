package com.survivalcoding;

public class StrongBox<E> {
    private E data;
    private final KeyType keyType;
    private int count = 0;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        count++;
        if (count >= keyType.getLimit()) {
            return this.data;
        }
        return null;
    }

}
