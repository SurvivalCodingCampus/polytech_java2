package com.survivalcoding.day260629;


public class StrongBox<T> {

    private T item;
    private KeyType keyType;
    private int count;

    public StrongBox(KeyType keyType) {
        if (keyType == null) {
            throw new NullPointerException("유효하지 않은 KeyType입니다.");
        }
        this.keyType = keyType;
        this.count = 0;
    }

    public void put(T item) {
        this.item = item;
    }

    public T get() {

        this.count++;

        if(this.count < this.keyType.getLimit()) {
            return null;
        }

        return this.item;
    }
}

