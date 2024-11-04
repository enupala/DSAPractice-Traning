package org.example.practice2;

public class SortCharArray {
    public static void main(String[] args) {
        String s = "bdbdebaacc";
        char[] arr = s.toCharArray();
        sortCharArray(arr);
    }

    private static void sortCharArray(char[] arr) {
        int n=arr.length;
        //creating fmap is of 26 size
        int []fmap=new int[26];
        //fmap
        for(int i=0;i<n;i++)
        {
            char ch=arr[i];
            int indx=ch-'a';
            fmap[indx]++;
        }
        int k=0;//tracking for array elements
        for(int i=0;i<26;i++)
        {
            int freq=fmap[i];
            char ch=(char)('a'+i);
            while(freq>0){
                arr[k]=ch;
                k++;
                freq--;
            }


        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }

}
