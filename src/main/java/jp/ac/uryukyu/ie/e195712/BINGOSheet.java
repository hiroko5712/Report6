package jp.ac.uryukyu.ie.e195712;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 今回作成するビンゴシートのルール
 * 1. 5×5で計25個の枠を用意する。
 * 2. 1~75の数字の中からランダムに枠に入れていく。ただし、同じ数字は2回使用してはいけない。
 * 3. B列には1~15の数字、I列には16~30のような本来のルールは無視する。どこにどの数字が入ってもいいものとする。
 */

public class BINGOSheet {
    private int number = 1;  // NumberListに入れる数字。int型の1から始まる。
    // ユニットテストしたい
    private int indexLength = 75; // リストの要素数を記録する変数。最初に選べるインデックスは0~74。
    private int count = 0;

    /**
     * ビンゴシートを作成するメソッド。
     * 1. 予め、1~75の数字を1個ずつ入れたNumberListを用意する。
     * 2. ランダムに数字を決めて、int型の変数numとおく。numはNumberListのインデックスを指定するための変数。
     * 3. NumberListの中から、numで指定されたインデックスの要素を、sheet(5×5の2次元配列)に入れていく。
     * 4. sheetをビンゴカードっぽくなるように表示する。
     */
    public void Sheet(){
        ArrayList<Integer> NumberList = new ArrayList<Integer>();
        for (int a = 0; a < 75; a++) {
            NumberList.add(number);
            number++;
        }

        int[][] sheet = new int[5][5];
        Random rand = new Random();


        for (int height = 0; height < sheet.length; height++) {
            int num = rand.nextInt(indexLength); // 最初に選べるインデックスは0~74。indexLengthは減少していく。
            sheet[height][count] = NumberList.get(num);
            NumberList.remove(num);  // 同じ数字を選んではいけないので、使った数字はリストから削除する。
            indexLength--;  // リストから要素が１つ削除されたので、１減らす。

            for (int width = 0; width < sheet.length; width++) {
                num = rand.nextInt(indexLength);
                sheet[count][width] = NumberList.get(num);
                NumberList.remove(num);
                indexLength--;
            }
            count++;
        }
        // System.out.println(Arrays.deepToString(sheet));

        //ビンゴカードを表示する。
        for (int b = 0; b < sheet.length; b++) {
            System.out.println(" ");  // 改行してほしいのでprintlnを使用。(横に5つ数字を並べた後改行したい。)
            for (int c = 0; c < sheet.length; c++) {
                System.out.print(sheet[b][c] + " ");  // printlnでは改行してしまうため、printを使う。(横に5つ数字を並べたい。)
            }
        }

    }

}
