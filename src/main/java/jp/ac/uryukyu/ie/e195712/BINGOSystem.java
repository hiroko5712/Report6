package jp.ac.uryukyu.ie.e195712;

import java.util.ArrayList;

class BINGOSystem {

    private BINGOSheet Sheet = new BINGOSheet();
    private int[][] getSheet = Sheet.IncompleteSheet();

    /**
     * ビンゴカードを表示するメソッド。
     * @getSheet BINGOSheetで作成した25個の数字が入った２次元配列。
     */
    void ShowSheet() {
        for (int b = 0; b < getSheet.length; b++) {
            System.out.println(" ");  // 改行してほしいのでprintlnを使用。(横に5つ数字を並べた後改行したい。)
            for (int c = 0; c < getSheet.length; c++) {
                System.out.print(getSheet[b][c] + " ");  // printlnでは改行してしまうため、printを使う。(横に5つ数字を並べたい。)
            }
        }
    }

    /**
     * searchNumberがビンゴシートの中にあるかを調べる。
     * @param searchNumber BINGOMachineクラスのpickedNumberメソッドによってランダムに選ばれた数字。
     * @return boolean型のfound。searchNumberと一致する数字が、ビンゴシート内にあった時にtrueを返す。
     */
    boolean Compare(int searchNumber) {
        boolean found = false;
        for (int b = 0; b < getSheet.length; b++) {
            for (int c = 0; c < getSheet.length; c++) {
                if(getSheet[b][c] == searchNumber){
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    private int height,width;

    /**
     * searchNumberがあった場所をint型の0に置き換えるメソッド。
     */
    void replace(int searchNumber) {
        for (int b = 0; b < getSheet.length; b++) {
            for (int c = 0; c < getSheet.length; c++) {
                if(getSheet[b][c] == searchNumber){
                    height=b;
                    width=c;
                    getSheet[height][width] = 0;
                }
            }
        }
        ShowSheet();
    }

    private ArrayList<String> list0 = new ArrayList<String>();
    ArrayList<String> place0() {
        for (int b = 0; b < getSheet.length; b++) {
            for (int c = 0; c < getSheet.length; c++) {
                if (getSheet[b][c] == 0) {
                    height = b;
                    width = c;
                    list0.add("[" + height + ", " + width + "]");
                }
            }
        }
        return list0;
    }



}

