package com.irenezar.app.utils.runners;

import com.irenezar.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by new_user on 1/23/2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor1 = new PrimitiveConvertor();
        convertor1.intToChar();
        PrimitiveConvertor convertor2 = new PrimitiveConvertor();
        convertor2.floatToChar();
        PrimitiveConvertor convertor3 = new PrimitiveConvertor();
        convertor3.charToInt();
    }
}