package org.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GraphAndDJKAlgo {
    public static class Pair{
        int vtx;
        int wt;
        Pair(int vtx,int wt)
        {
            this.vtx=vtx;
            this.wt=wt;
        }
    }
    public static void main(String[] args) {
        //given inpt
        int [][]edges={{0,1,10},
                {0,3,30},
                {1,2,10},
                {2,3,5},
                {3,4,4},
                {4,5,7},
                {4,6,12},
                {5,6,3}};
        int vtx=7;
        int src=6;
        //constructing graph
        ArrayList<ArrayList<Pair>> graph=new ArrayList<>();
        for(int v=0;v<vtx;v++)
        {
            graph.add(new ArrayList<Pair>());
        }
        for(int edg[]:edges){
            int v=edg[0];
            int u=edg[1];
            int w=edg[2];
            graph.get(v).add(new Pair(u,w));
            graph.get(u).add(new Pair(v,w));

        }
       // dispaly(graph);
        int res[]=djiktra(graph,src);
        for(int i=0;i<res.length;i++)
        {
            System.out.println("from "+src+" to "+i+" is "+res[i]);
        }

    }
    public static class Dhelper{
        int vtx;
        int wsf;
        Dhelper(int vtx,int wsf)
        {
            this.vtx=vtx;
            this.wsf=wsf;
        }
    }

    private static int[] djiktra(ArrayList<ArrayList<Pair>> graph,int src) {
        int vtx=graph.size();
        int ans[]=new int[vtx];
        Arrays.fill(ans,Integer.MAX_VALUE);
        PriorityQueue<Dhelper> pq=new PriorityQueue<>(new Comparator<Dhelper>() {
            @Override
            public int compare(Dhelper p1, Dhelper p2) {
                return p1.wsf-p2.wsf;
            }
        });
        pq.add(new Dhelper(src,0));
        while(pq.size()>0)
        {
            //remove
            Dhelper rem=pq.remove();
            //work
            if(ans[rem.vtx]!=Integer.MAX_VALUE)
                continue;
            ans[rem.vtx]=rem.wsf;
            //add neighbours
            for(Pair nbr : graph.get(rem.vtx))
            {
                if(ans[nbr.vtx]==Integer.MAX_VALUE)
                {
                    pq.add(new Dhelper(nbr.vtx,rem.wsf+nbr.wt));
                }
            }
        }
        return ans;
    }

    private static void dispaly(ArrayList<ArrayList<Pair>> graph) {
        for(int i=0;i<graph.size();i++)
        {
            System.out.print(i +" -> ");
            for(Pair p:graph.get(i))
            {
                System.out.print("("+p.vtx+" "+p.wt+"), ");
            }
            System.out.println();
        }
    }
}
