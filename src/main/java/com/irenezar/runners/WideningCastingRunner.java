package com.irenezar.runners;

import com.irenezar.outdated.WideningCasting;

/**
 * Created by new_user on 1/23/2017.
 */

public class WideningCastingRunner {
    byte aByte = 121;
    public static void main(String[] args){
        WideningCasting casting1 = new WideningCasting();
        casting1.widening1();
    }
    public void widening(){
        System.out.println(aByte);
    }
}