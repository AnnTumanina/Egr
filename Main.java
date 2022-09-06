package com.company;

import java.util.ArrayList;

public class Main {
    static int sumChisla(int a){
        return a/100+a/10%10+a%10;
    }

    public static void main(String[] args) {
        ArrayList vseChisla = new ArrayList<>();
        for(int i = 100000; i<1000000; i++){
            int n = i;
            if(((i)%1000)==sumChisla(i/1000)){
                vseChisla.add(i);
            }
        }
        System.out.println(vseChisla);
    }
}