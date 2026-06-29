package com.survivalcoding;

public enum KeyType {
    PADLOCK(1024),
    BUTTON(10000),
    DIAL(30000),
    FINGER(1000000);

    private final int maxDurability;
    private int durability;

    KeyType(int maxDurability) {
        this.maxDurability = maxDurability;
        this.durability = maxDurability;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
