package com.survivalcoding;

import org.w3c.dom.ls.LSOutput;

//제너릭 클래스 선언
public class StrongBox<K> {
    /*
        private final int PADLOCK = 1024;
        private final int BUTTON = 10000;
        private final int DIAL = 30000;
        private final int FINGER = 1000000;
    */
    private K data;
    private int cnt = 0; //0을 안해도 프리미엄 타입은 자동으로 0으로 설정되어있음
    // private  int maxCnt=0;
    private KeyType keyType;


    public void put(K date) {
        this.data = date;
        //count ++;
    }

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }


    public K get() {
        cnt++;
        //KeyType keyType = KeyType.PADLOCK; //private로 존재하고 생성자로도 저장해놓았으므로 필요 없다.
       /*문법은 맞으나 문제의 요구 사항에 충족되지 않아 안되
        if (cnt == PADLOCK)
        {
            return this.data;
        }
        else if(cnt == BUTTON)
        {
            return this.data;
        }
        else if(cnt == DIAL)
        {
            return this.data;
        }
        else if(cnt == FINGER)

        */
        if (keyType == KeyType.PADLOCK) {
            if (cnt >= 1024) {
                return data;
            }
        } else if (keyType == KeyType.BUTTON) {
            if (cnt >= 10000) {
                return data;
            }
        } else if (keyType == KeyType.DIAL) {
            if (cnt >= 30000) {
                return data;
            }
        } else if (keyType == KeyType.FINGER) {
            if (cnt >= 1000000) {
                return data;
            }
        }

        return null; //이 부분이 else가 되므로 else를 안 쓴다
    }
}