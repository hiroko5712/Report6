package jp.ac.uryukyu.ie.e195712;

import java.util.ArrayList;
import java.util.Random;

/**
 * 数字を抽選するクラス。
 * (1度選んだ数字は選ばないようにする。)
 */
class BINGOMachine {
    private ArrayList<Integer> numberList2 = new ArrayList<Integer>();
    private int number = 1;  // NumberListに入れる数字。int型の1から始まる。]
    private int indexLength = 75;

    /**
     * 数字が入ったリストを作成するメソッド。
     * @return numberList2を返す。
     */

    public ArrayList<Integer> makeList() {
        for (int a = 0; a < 75; a++) {
            numberList2.add(number);
            number++;
        }
        return numberList2;
    }

    private int getNum;
    /**
     * 1~75の数字の中から、ランダムに数字を決定するメソッド。
     * 1. 予め1~75の数字が順番に入ったリストを用意。(numberList2とは別。)
     * 2. ランダムに決定した数字を変数numと置き、num番目の要素にある数字をreturnする。
     *
     * @param numberList int型のArrayList。
     * @return int型。NumberListのnum番目にある数字。
     */

    public int pickedNumber(ArrayList<Integer> numberList) {
        Random rand = new Random();
        int num = rand.nextInt(indexLength);
        getNum = numberList.get(num);
        numberList.remove(num);  // 同じ数字を選んではいけないので、使った数字はリストから削除する。
        indexLength--;

        return getNum;
    }

    /**
     * getNumを所得する。
     * @return int型の変数を返す。
     */
    public int getNumber(){ return getNum; }


    /**
     * pickedNumberメソッドと似ているが、voidにしたもの。
     * @param numberList int型のArrayList。
     */
    public void pickedNumberSys(ArrayList<Integer> numberList) {
        Random rand = new Random();
        int num = rand.nextInt(indexLength);
        getNum = numberList.get(num);
        numberList.remove(num);  // 同じ数字を選んではいけないので、使った数字はリストから削除する。
        indexLength--;
    }
}