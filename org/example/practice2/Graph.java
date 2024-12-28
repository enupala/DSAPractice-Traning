package org.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Graph {
    public static void main(String[] args) {
        //Given input
        int [][]edges={{0,1,10},
                       {0,3,30},
                       {1,2,10},
                       {2,3,5},
                       {3,4,4},
                       {4,5,7},
                       {4,6,12},
                       {5,6,3}};
        int vtx=7;
        //create graph
        ArrayList<ArrayList<Pair>>graph=new ArrayList<>();
        for(int v=0;v<vtx;v++)
        {
            graph.add(new ArrayList<Pair>());
        }
        for(int edg[]:edges)
        {
            int v=edg[0];
            int u=edg[1];
            int wt=edg[2];
            graph.get(v).add(new Pair(u,wt));
            graph.get(u).add(new Pair(v,wt));
        }
        display(graph);
       int res[]= dijkstra(graph);
       for(int v=0;v<res.length;v++)
           System.out.println("from 0 to "+v +" is : "+res[v]);

    }

    private static int[] dijkstra(ArrayList<ArrayList<Pair>> graph) {
        int src=0;
        int vtx=graph.size();
        int ans[]=new int[vtx];
        Arrays.fill(ans,Integer.MAX_VALUE);

        PriorityQueue<Dhelper>pq=new PriorityQueue<>(new Comparator<Dhelper>() {
            @Override
            public int compare(Dhelper p1, Dhelper p2) {
                return p1.wtf-p2.wtf;
            }
        });
        pq.add(new Dhelper(0,0));
        while(pq.size()>0)
        {
            //remove
            Dhelper rem=pq.remove();
            //work
            if(ans[rem.vtx]!=Integer.MAX_VALUE)
                continue;
            ans[rem.vtx]=rem.wtf;
            //add nigh
            for(Pair nbr:graph.get(rem.vtx))
            {
                if(ans[nbr.vtx]==Integer.MAX_VALUE)
                pq.add(new Dhelper(nbr.vtx,rem.wtf+nbr.wt));
            }
        }
    return ans;
    }
    public static class Dhelper{
        int vtx;
        int wtf;
        public Dhelper(int vtx,int wtf)
        {
            this.vtx=vtx;
            this.wtf=wtf;
        }
    }

    private static void display(ArrayList<ArrayList<Pair>> graph) {
        for(int v=0;v<graph.size();v++)
        {
            System.out.print(v+" ->");
            for(Pair p:graph.get(v))
            {
                System.out.print("("+p.vtx+" @ "+p.wt+"), ");
            }
            System.out.println();
        }
    }

    public static class Pair{
        int vtx;
        int wt;
        public Pair(int vtx,int wt)
        {
            this.wt=wt;
            this.vtx=vtx;
        }
    }
}
