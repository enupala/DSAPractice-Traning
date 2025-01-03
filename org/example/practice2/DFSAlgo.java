package org.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class DFSAlgo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        int vertx=7;
        int src=3;
        int [][]edges={
                {0,3},{0,1},{2,3},{3,4},{1,2},{4,5},{4,6},{5,6}
        };
        for(int i=0;i<vertx;i++)
        {
            graph.add(new ArrayList());

        }
        for(int edg[]:edges)
        {
            int v=edg[0];
            int u=edg[1];
            graph.get(v).add(u);
            graph.get(u).add(v);
        }
        display(graph);
        boolean visited[]=new boolean[vertx];
        Arrays.fill(visited,false);

        dfsAlgo(graph,visited,src);

    }

    private static void dfsAlgo(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int src) {
        //visit source node
        visited[src]=true;
        System.out.print(src+" ");
        //get all its nhbrs
        for(int nbr:graph.get(src))
        {
            if(visited[nbr]==false) {

                dfsAlgo(graph, visited, nbr);
            }
        }
    }

    private static void display(ArrayList<ArrayList<Integer>> graph) {
        int vtx=graph.size();
        for(int i=0;i<vtx;i++)
        {
            System.out.print(i+" : " );
            for(int nbr : graph.get(i))
            {
                System.out.print(nbr+", ");
            }
            System.out.println();
        }
    }
}
