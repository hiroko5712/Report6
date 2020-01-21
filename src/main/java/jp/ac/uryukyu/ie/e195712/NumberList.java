package jp.ac.uryukyu.ie.e195712;

import java.util.ArrayList;

public class NumberList {
    private ArrayList<Integer> numberList = new ArrayList<Integer>();
    private int number = 1;  // numberListに入れる数字。int型の1から始まる。

    /**
     * 1~75までの数字が入ったリストを作成するメソッド。
     * @return ArrayList型のnumberListを返す。
     */
    ArrayList<Integer> makeList() {
        for (int a = 0; a < 75; a++) {
            numberList.add(number);
            number++;
        }
        return numberList;
    }
}
