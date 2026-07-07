package com.survivalcoding.day260706;

import java.util.Arrays;

public class Regular_Expression {
    private String[] strArr;

    public void setRegular_Expression() {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 100; i++) {
            sb.append(i).append(",");
        }

        String str = sb.toString();

        this.strArr = str.split(",");
    }

    public void getRegular_Expression() {
        System.out.println(Arrays.toString(strArr));
    }

    public String[] getStrArr() {
        return this.strArr;
    }
}
