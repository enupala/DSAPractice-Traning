package org.example.practice2;

public class TwoFractions {
    public static void main(String[] args) {

      int NF1 = 1,DF1 = 2,NF2 = 3,DF2 = 2;
       int ans[]= simplifyAns(NF1,DF1,NF2,DF2);
        System.out.println(ans[0]+" "+ans[1]);

    }

    private static int[] simplifyAns(int nf1, int df1, int nf2, int df2) {
        int num=(nf1*df2)+(df1*nf2);
        int den=df1*df2;
        int gcd=calculateGcd(num,den);
        num/=gcd;
        den/=gcd;
        return new int[]{num,den};
    }

    private static int calculateGcd(int num, int den) {
        while(den!=0)
        {
            int temp=den;
            den=num%den;
            num=temp;
        }
        return num;
    }
}
