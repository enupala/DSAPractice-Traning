package org.example.practice2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class President {
    public static void main(String[] args) {
       List<Integer>list=new ArrayList<>(List.of(1,2,3,4));
        int k=2;
        int elected=findPresident(list,k);
        System.out.println(elected);
    }

    private static int findPresident(List<Integer> list, int k) {
        int rem=1;
        while(list.size()>1)
        {
            Iterator<Integer>itr= list.iterator();
            while(itr.hasNext())
            {
                itr.next();
                if(rem==k)
                {
                    itr.remove();
                    rem=1;
                }
                else{
                    rem++;
                }
            }
        }
        return list.get(0);
    }


}
