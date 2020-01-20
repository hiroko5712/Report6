package jp.ac.uryukyu.ie.e195712;

public class Main {
    public static void main(String[] args){
        BINGOSheet card = new BINGOSheet();
        BINGOMachine number = new BINGOMachine();

        card.Sheet();
        System.out.println(" ");
        System.out.println(number.PickedNumber());
    }
}
