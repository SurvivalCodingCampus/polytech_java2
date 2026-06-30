package com.survivalcoding;

import static com.survivalcoding.KeyType.*;

public class StrongBox<UNKNOWN> {
    private UNKNOWN data;
    private int count;
    private final KeyType keyType;


    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
        this.count = 0;
    }

    public void put(UNKNOWN data) {
        this.data = data;
    }

    public UNKNOWN get() {
        count++;

        if (keyType == PADLOCK && count <= 1024) {
            return null;
        }
        if (keyType == BUTTON && count <= 10000) {
            return null;
        }
        if (keyType == DIAL && count <= 30000) {
            return null;
        }
        if (keyType == FINGER && count <= 1000000) {
            return null;
        }
        return this.data;
    }
}


