package com.edgebasis;

public class Main {

    public static void main(String[] args) {

        String s="aaa";
        int counter=0;
    //    StringBuilder sub = new StringBuilder();
        counter = countPalin(s);
        System.out.println("total palindroms: " + counter);
    }

    private static int countPalin(String s){

        int count=0 ;
        for(int i=0; i<s.length();i++){
            for(int j=i; j<s.length();j++){
                if(pali(s.substring(i,j+1))) count++ ;
            }
        }


        return count;
    }

    private static boolean pali(String substring) {

        for(int i=0; i<substring.length()/2;i++){
            if(substring.charAt(i)!= substring.charAt(substring.length()-i-1)) return false;
        }


        return true;
    }
}
