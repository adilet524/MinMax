package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 32, 34, 56, 675, 56, 65, 76, 89, 990};
        minimum(array);
        maximum(array);
    }

    public static void minimum(int[] san) {
        int min = san[0] ;
        for(int i = 0; i < san.length; i++) {
            min = Math.min(min, san[i]);
        }
        System.out.println(min + " - Min");
    }

    public static void maximum(int[] san) {
        int max = san[0];
        for(int i = 0; i < san.length; i++) {
            max = Math.max(max, san[i]);
        }
        System.out.println(max + " - Max");
    }
}



