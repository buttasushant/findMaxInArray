package org.buttas;

public class Main {
    public static void main(String[] args) {
        //find max in an array
        int [] arr = {11,212,34,4,5};
        int max = Integer.MIN_VALUE ;
        for (int n : arr){
            if(n > max){
                max = n;
            }
        }
        System.out.println(max);
    }
}