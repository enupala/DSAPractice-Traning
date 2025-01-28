package org.example.practice2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class BFSAlgo {
    public static void main(String[] args) {
        demo();


    }

    private static void demo() {
        int vtx=7;
        int total_edges=8;
        int src=3;
        int [][]edges={
                {0,3},{0,1},{2,3},{3,4},{1,2},{4,5},{4,6},{5,6}
        };
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<vtx;i++)
        {
            graph.add(new ArrayList<>());

        }
        for(int edg[]:edges)
        {
            int v=edg[0];
            int u=edg[1];
            graph.get(v).add(u);// 0 -> 1// 0 - 1
            graph.get(u).add(v);// 0 <-1
        }
        display(graph);
        bfsAlgo(graph,src);

    }

    private static void bfsAlgo(ArrayList<ArrayList<Integer>> graph,int src) {
        int v=graph.size();

        boolean vis[]=new boolean[v];
        Arrays.fill(vis,false);
        Queue<Integer> q=new ArrayDeque<>();
        q.add(src);
        vis[src]=true;
        while(q.size()>0)
        {
            //remove
            int rem=q.remove();
            //print
            System.out.print(rem+" ");
            //add negh
            for(int negh : graph.get(rem))
            {
                if(vis[negh]==false) {
                    vis[negh] = true;
                    q.add(negh);
                }

            }

        }

    }

    private static void display(ArrayList<ArrayList<Integer>> graph) {
        int vtx=graph.size();
        for(int i=0;i<vtx;i++)
        {
            System.out.print(i+"-> ");
            for(int nbr:graph.get(i))
            {
                System.out.print(nbr+" , ");
            }
            System.out.println();
        }

    }
}
