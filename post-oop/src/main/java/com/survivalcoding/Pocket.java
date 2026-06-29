package com.survivalcoding;

public class Pocket<E> {
    private E data;

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        return this.data;
    }
}
