package jp.ac.uryukyu.ie.e195712;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BINGOMachineTest {

    /**
     * 同じ数字は２度使わないようにしたい。numberListから１度選んだ数字は削除されている事を確かめるテスト。
     * (未完成。動きませんでした。)
     */
    @Test
    void pickedNumberSys(ArrayList<Integer> numberList) {
        int getNum;
        int indexLength = 75;
        boolean found = false;

        Random rand = new Random();
        int num = rand.nextInt(indexLength);
        getNum = numberList.get(num);
        numberList.remove(num);  // 同じ数字を選んではいけないので、使った数字はリストから削除する。
        indexLength--;

        for (int b = 0; b < 75; b++) {
            if(numberList.get(b) == getNum){
                found = true;
            }
        }
        assertFalse(found);
    }
}