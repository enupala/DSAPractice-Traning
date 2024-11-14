package org.example.practice2;

public class BishopMove {
    public static void main(String[] args) {


            System.out.println(canReachBishop(1, 1, 4, 4)); // "YES, 1" (same diagonal)
            System.out.println(canReachBishop(1, 1, 2, 3)); // "NO" (different color)
            System.out.println(canReachBishop(1, 1, 2, 4)); // "YES, 2" (same diagonal)
            System.out.println(canReachBishop(1, 1, 5, 5)); // "YES, 1" (same diagonal)
        }

    private static String canReachBishop(int Br, int Bc, int Tr, int Tc) {
        if(Math.abs(Br-Bc)==Math.abs(Tr-Tc))
        {
            return "yes,1";
        }

        else if((Br+Bc)%2==(Tr+Tc)%2)
        {
            return "yes,2";
        }
        else{
           return "No" ;
        }
    }
}

