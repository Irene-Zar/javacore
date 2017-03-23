package com.irenezar.runners.lesson14;

import com.irenezar.app.classwork.lesson14.Basketball;
import com.irenezar.app.classwork.lesson14.Football;
import com.irenezar.app.classwork.lesson14.Game;

/**
 * Created by new_user on 3/2/2017.
 */
public class GameRunner {
       public static void main(String[] args) {
            Game Football = new Football();
            Game Basketball = new Basketball();
            runAllPlayMethodsForGameInterface(Football);
            runAllPlayMethodsForGameInterface(Basketball);;
        }

        public static void runAllPlayMethodsForGameInterface(Game game){
            game.play();
        }
}
