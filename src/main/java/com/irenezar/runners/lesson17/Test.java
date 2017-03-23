package com.irenezar.runners.lesson17;
import com.irenezar.app.classwork.lesson17.*;
/**
 * Created by new_user on 3/13/2017.
 */
class Test {
        public static void main(String[] args) {
            BoxPrinter value1 = new BoxPrinter(new Integer(10));
            System.out.println(value1);
            Integer intValue1 = (Integer) value1.getValue();
            BoxPrinter value2 = new BoxPrinter("Hello world");
            System.out.println(value2);
// Here is runtime error of class casting assignment
            Integer intValue2 = (Integer) value2.getValue();
        }
}
