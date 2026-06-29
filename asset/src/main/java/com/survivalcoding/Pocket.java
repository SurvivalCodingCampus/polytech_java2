package com.survivalcoding;

public class Pocket<E extends TangibleAsset> {
    private E data;

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        return this.data;
    }

    public static void main(String[] args) {
        Pocket<TangibleAsset> pocket = new Pocket<>();
    }
}
