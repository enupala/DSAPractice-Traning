package org.example.practice2;

import java.io.*;
import java.util.*;


class Solution {
    public static void main(String[] args) {
        int numRows=5;
        List<List<Integer>>pascalTriangle=generate(numRows);
        for(List<Integer> row: pascalTriangle)
        {
            System.out.println(row);
        }


    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();


        for(int i=0;i<numRows;i++)
        {
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                int val=res.get(i-1).get(j-1)+res.get(i-1).get(j);
                row.add(val);
            }
            if(i>0)
            {
                row.add(1);
            }
            res.add(row);
        }
        return res;
    }

}
