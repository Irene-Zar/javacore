package com.irenezar.app.classwork.lesson17;

/**
 * Created by new_user on 3/13/2017.
 */
public class BoxPrinter {
        private Object val;

        public BoxPrinter(Object arg) {
            val = arg;
        }

        public String toString() {
            return "{" + val + "}";
        }

        public Object getValue() {return val;}

}
