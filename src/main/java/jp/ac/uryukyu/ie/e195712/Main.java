package jp.ac.uryukyu.ie.e195712;

/**
 * ビンゴゲーム(途中まで)
 * ルール：最初にビンゴカードを作成し、表示させる。
 *        抽選されて決定した数字がビンゴシートにあった場合は、その場所の数字を0に置き換える。
 * 　　　　0が横１列、縦１列、斜めに揃えばビンゴになる。
 *　　　　　　→→今回ビンゴかどうかの判定を作るまでが出来なかったので、抽選を10回繰り返すものにしました。
 */
public class Main {
    public static void main(String[] args){
        BINGOSystem card = new BINGOSystem();
        BINGOMachine ball = new BINGOMachine();
        NumberList list = new NumberList();

        int picked = ball.pickedNumber(list.makeList());

        int count=0;
        System.out.println("---BINGOゲーム開始！---");
        card.ShowSheet();
        System.out.println(" ");
        System.out.println("----------------");
        System.out.println("抽選結果は..." + picked);
        if(card.Compare(ball.getNumber())){
            System.out.println("ありました！");
            card.replace(ball.getNumber());
        }else{
            System.out.println("見つかりませんでした。次の抽選を行います。");
        }

        while(count<=10){
            System.out.println(" ");
            System.out.println("----------------");
            ball.pickedNumberSys(list.makeList());
            System.out.println("抽選結果は..." + ball.getNumber());
            if(card.Compare(ball.getNumber())){
                System.out.println("ありました！");
                card.replace(ball.getNumber());
            }else{
                System.out.println("見つかりませんでした。次の抽選を行います。");
            }

            count++;
        }

    }
}
