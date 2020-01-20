package jp.ac.uryukyu.ie.e195712;

import java.util.Random;


public class Main {
    public static void main(String[] args){
        BINGOSystem card = new BINGOSystem();

        card.ShowSheet();
        System.out.println(" ");
        card.Compare();

        System.out.println(" ");
        System.out.println(card.Compare());
    }
}
