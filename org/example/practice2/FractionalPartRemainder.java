/*
package org.example.practice2;

import java.util.HashMap;

public class FractionalPartRemainder {
    public static void main(String[] args) {

        */
/*Numerator = 1, Denominator = 2
         Return ""0.5""

        Numerator = 1, Denominator = -2
        Return ""-0.5""

        Numerator = 50, Denominator = 22
         Return ""2.(27)""  [Fractional part (27) is repeating, hence enclosed in paranthesis]"
*//*

        int num=50,den=22;
        System.out.println(calculateRepeatedPart(num,den));
    }

    private static String calculateRepeatedPart(int num, int den) {
        StringBuilder res=new StringBuilder();
        if(num<0)
            return "0";
        if(den<0)
            return "undefined";
        if((num<0) ^ (den<0))
        {
            res.append("-");
        }
        long n=Math.abs((long)num);
        long d=Math.abs((long)den);
        res.append(n/d);
        long rem=n%d;
        if(rem==0)
            return res.toString();

        res.append(".");
        HashMap<Long,Integer>map=new HashMap<>();
        while(rem!=0)
        {
            res.insert(map.get(rem),);
        }
        map.put(rem,res.length());
        rem*=10;




    }
}
*/
