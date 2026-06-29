package com.survivalcoding;

public class StrongBox<E> {
    private E data;

    public void put(E data) {
        this.data = data;
    }

    public E get(KeyType key) {
        if (key.getDurability() <= 1) {
            return this.data;
        } else {
            key.setDurability(key.getDurability() - 1);
            return null;
        }
    }

    public E get() {
        return this.data;
    }
}
