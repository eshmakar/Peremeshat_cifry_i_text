package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Peremeshat {
    public static void main(String[] args) {
        Integer[] in = {1,2,3,4,5,6,7,8,9,10};
        String s [] = "hello this is new text".split(" ");
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(s));
        System.out.println("_______________________");
        Collections.shuffle(Arrays.asList(in), new Random());
        Collections.shuffle(Arrays.asList(s), new Random());
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(s));
    }
}
/*
OUTPUT:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[hello, this, is, new, text]
_______________________
[8, 2, 9, 3, 10, 6, 5, 1, 7, 4]
[text, hello, is, this, new]
*/
