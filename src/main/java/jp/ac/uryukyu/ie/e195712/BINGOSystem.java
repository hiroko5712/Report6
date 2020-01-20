package jp.ac.uryukyu.ie.e195712;

import java.util.Arrays;

class BINGOSystem {
    private BINGOSheet imcompleteSheet = new BINGOSheet();
    private int[][] getSheet = imcompleteSheet.IncompleteSheet();


    void ShowSheet() {
        //ビンゴカードを表示する。
        for (int b = 0; b < getSheet.length; b++) {
            System.out.println(" ");  // 改行してほしいのでprintlnを使用。(横に5つ数字を並べた後改行したい。)
            for (int c = 0; c < getSheet.length; c++) {
                System.out.print(getSheet[b][c] + " ");  // printlnでは改行してしまうため、printを使う。(横に5つ数字を並べたい。)
            }
        }
    }

    private boolean judge = false;
    private BINGOMachine number = new BINGOMachine();
    private int searchNumber = number.getNumber();


    boolean Compare() {
        for (int b = 0; b < getSheet.length; b++) {
            for (int c = 0; c < getSheet.length; c++) {
                if(getSheet[b][c] == searchNumber){
                    judge = true;
                }
            }
        }

            //System.out.println(Arrays.binarySearch(getSheet[i], searchNumber));
            //index =  Arrays.binarySearch(getSheet[i], searchNumber);

        /*
            if(index >= 0) {
                judge = true;
                break;
            }

         */
        System.out.println(searchNumber);
        return judge;

    }


}

