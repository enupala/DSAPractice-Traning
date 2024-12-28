/*
package org.example.practice2;

import java.util.ArrayList;

public class BFSAlgo {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        int vtx=7;
        int total_edges=8;
        int [][]edges={
                {0,3},{0,1},{2,3},{3,4},{1,2},{4,5},{4,6},{5,6}
        };

        //preparing a graph lish
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int v=0;v<vtx;v++)
        {
            graph.add(new ArrayList<>());

        }
        //add edges in graph
        for(int i=0;i<total_edges;i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            //graph is unidirected ,that means edge b/w u and v
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
    }
}
*/
