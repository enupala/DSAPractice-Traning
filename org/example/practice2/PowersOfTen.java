package org.example.practice2;

public class PowersOfTen {
    public static void main(String[] args) {
        boolean isPowerTen=isPowerTen(999);
        System.out.println(isPowerTen);
    }

    private static boolean isPowerTen(int n) {
        if(n<0)
            return false;

        while(n>1)
        {
            int rem=n%10;
            if(rem!=0)
                return false;
            n=n/10;
        }

            return true;
    }
}
