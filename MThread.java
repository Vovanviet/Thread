package com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MThread  extends Thread{
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
//
            ThreadNumber[] list=new ThreadNumber[3];
            list[0]=new ThreadNumber("First",5);
            list[1]=new ThreadNumber("Second",5);
            list[2]=new ThreadNumber("Third",5);
            for (ThreadNumber lists:list) {
                System.out.println(lists);
            }
            for (int i = 0; i<3; i++){
                list[i].start();
                list[i].isAlive();
            }


//             while (true) {
//                 Arrays.stream(list).count().
//             }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
