package org.example.practice2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ConstructBTWithPIPractice {
    static class Node{
        int val;
        Node left,right;

        Node (int val)
        {
            this.val=val;
            this.left=right=null;
        }
    }
    public static void main(String[] args) {
        int pre[]={10,20,40,50,60,30,70,90,80};
        int in[]={40,20,60,50,10,70,90,30,80};
        Node root=constructBt(pre,in);
      display(root);
      printLeverOrderWise(root);
      leftView(root);
    }

    private static void leftView(Node root) {
        Queue<Node>q =new ArrayDeque<>();
        q.add(root);
        ArrayList<Integer>list=new ArrayList<>();
        while(q.size()>0)
        {
            list.add(q.peek().val);
            int sz=q.size();
            for(int i=0;i<sz;i++) {

                Node rem = q.remove();
                if (rem.left != null)
                {
                    q.add(rem.left);
                }
                if (rem.right != null)
                {
                    q.add(rem.right);
                }
            }
        }
        System.out.print(list+" ");
    }

    private static void printLeverOrderWise(Node root) {
        int sum=0;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        int ht=0;
        while (q.size() > 0) {
            ht++;
            int sz = q.size();
            sum=0;
            for(int i=0;i<sz;i++)
            {

                //remove
                Node rem=q.remove();
                //print
                sum+=rem.val;
               // System.out.print(rem.val+" ");

                //add children to q
                if(rem.left!=null)
                {
                    q.add(rem.left);

                }
                if(rem.right!=null)
                {
                    q.add(rem.right);
                }
            }
            //System.out.println();
            System.out.println(sum);


        }
        System.out.println(ht);
    }

    private static Node constructBt(int[] pre, int[] in) {
        Node node=  makeBt(pre,0,pre.length-1,in,0,in.length-1);
        return node;
    }

    private static void display(Node node) {
        if(node ==null)
            return;

        String str="";
        if(node.left!=null)
        {
            str+=node.left.val;
        }
        str+=" <- "+node.val+" -> ";
        if(node.right!=null)
        {
            str+=node.right.val;
        }
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    private static Node makeBt(int[] pre, int pStart, int pEnd, int[] in, int iStart, int iEnd) {
        if(pStart>pEnd || iStart>iEnd)
            return null;

        Node node=new Node(pre[pStart]);
        int indx=0;
        for(int i=0;i<in.length;i++)
        {
            if(node.val==in[i])
            {
                indx=i;
                break;
            }
        }
        int nEle=indx-iStart;
        node.left=makeBt(pre,pStart+1,pStart+nEle,in,iStart,indx-1);
        node.right=makeBt(pre,pStart+nEle+1,pEnd,in,indx+1,iEnd);
        return node;
    }

}
