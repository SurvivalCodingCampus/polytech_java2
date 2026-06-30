package com.survivalcoding;

import java.util.Objects;

public abstract class Asset {
    private String name;
    private int price;

    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Asset asset)) return false;

        return price == asset.price && Objects.equals(name, asset.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
