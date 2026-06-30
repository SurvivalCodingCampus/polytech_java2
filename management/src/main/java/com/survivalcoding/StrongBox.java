package com.survivalcoding;

public class StrongBox<E extends TangibleAsset> {
    private E Valuables;

    public void put(E Valuables) {
        this.Valuables = Valuables;
    }

    public E get() {
        return this.Valuables;

    }
}
