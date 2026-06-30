package com.survivalcoding;

import org.w3c.dom.ls.LSOutput;

//제너릭 클래스 선언
public class StrongBox<K extends KeyType >
{
    private K data;

    public void put(K date){
        this. data = date;
        //count ++;
    }
    public K get(){
        return this.data;
    }
}


