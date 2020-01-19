import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BINGOSheet {
    public static void main(String[] args){
        int[][] sheet = new int[5][5];
        Random rand = new Random();

        //1~75の数字を入れたリストを用意
        //その中から要素番号をランダムに指定して、sheetに入れていく。

        int i=1;
        ArrayList<Integer> box = new ArrayList<Integer>();
        for(int a=0; a<75; a++){
            box.add(i);
            i++;
        }
        // 配列の場合はArrays.toString(box)じゃないとだめ
        // リストなので、ただのboxだけでprintできる。


        int a=0;
        int indexLength=75; // ユニットテストしたいかも
        for(int height=0; height<sheet.length; height++){
            //+1をすることで、1~75までの数字がランダムに出てくる。(0は出てこない)
            int num = rand.nextInt(indexLength); //インデックスは0~74
            sheet[height][a] = box.get(num);
            box.remove(num);
            indexLength--;


            for(int width=0; width<5; width++) {
                num = rand.nextInt(indexLength);
                sheet[a][width] = box.get(num);
                box.remove(num);
                indexLength--;
            }
            a++;
        }

        System.out.println(Arrays.deepToString(sheet));

        /*
        // 1~75までの数字を配列に入れて、
        →配列じゃなくて、リストに入れればいいのかも
        int i=1;
        int[] box = new int[75];
        for(int a=0; a<75; a++){
            box[a] = i;
            i++;
        }
        System.out.println(Arrays.toString(box));

        int a=0;
        for(int height=0; height<sheet.length; height++){
            //+1をすることで、1~75までの数字がランダムに出てくる。(0は出てこない)
            int num = rand.nextInt(74); //インデックスは0~74
            sheet[height][a] = box[num];
            List<Integer> list = new ArrayList<Integer>();


            for(int width=0; width<5; width++) {
                num = rand.nextInt(74);
                sheet[a][width] = box[num];
            }
            a++;
        }

        System.out.println(Arrays.deepToString(sheet));

         */



        /*
        //数字をランダムに決めて、リストに入れていく方法
        int a=0;
        for(int height=0; height<sheet.length; height++){
            //+1をすることで、1~75までの数字がランダムに出てくる。(0は出てこない)
            int num = rand.nextInt(75) + 1;
            if(Arrays.asList(sheet[]))
            sheet[height][a] = num;

            for(int width=0; width<5; width++) {
                num = rand.nextInt(75) + 1;
                sheet[a][width] = num;
            }
            a++;
        }

        System.out.println(Arrays.deepToString(sheet));

         */


        //ビンゴカードを表示する。
        for(int b=0; b<5; b++){
            System.out.println(" ");
            for (int j=0; j<5; j++){
                System.out.print(sheet[b][j] + " ");
            }
        }



    }

}
