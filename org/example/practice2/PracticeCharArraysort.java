package org.example.practice2;

public class PracticeCharArraysort {
    public static void main(String[] args) {
        String s = "saaatbbb";
        char[] arr = s.toCharArray();
        sortCharArray(arr);
    }

    private static void sortCharArray(char[] arr) {
        int n=arr.length;
        int fmap[]=new int[26];
        for(int i=0;i<n;i++)
        {
            char ch=arr[i];
            int indx=ch-'a';
            fmap[indx]++;
        }
        int k=0;

        for(int i=0;i<26;i++)
        {
            int freq=fmap[i];
            char val=(char)('a'+i);
            while(freq!=0) {
                arr[k]=val;
                k++;
                freq--;
            }


        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
