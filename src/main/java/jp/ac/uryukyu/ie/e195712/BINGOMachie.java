package jp.ac.uryukyu.ie.e195712;

import java.util.ArrayList;
import java.util.Random;

/**
 * 1ターンごとに当たりになる数字を決めていくクラス。
 * 1度選んだ数字は選ばないようにする。
 */
class BINGOMachine {
    ArrayList<Integer> NumberList = new ArrayList<Integer>();
    private int number = 1;  // NumberListに入れる数字。int型の1から始まる。]
    private int indexLength = 75;

    /**
     * 1~75の数字の中から、ランダムに数字を決定するメソッド。
     * 1. 最初から1~75の数字が順番に入ったリストを用意しておく。
     * 2. ランダムに決定した数字を変数numと置き、num番目の要素にある数字をreturnする。
     *
     * @return int型。NumberListのnum番目にある数字。
     */
    public int PickedNumber() {
        for (int a = 0; a < 75; a++) {
            NumberList.add(number);
            number++;
        }
        Random rand = new Random();
        int num = rand.nextInt(indexLength);
        NumberList.remove(num);  // 同じ数字を選んではいけないので、使った数字はリストから削除する。
        indexLength--;

        return NumberList.get(num);
    }

}
