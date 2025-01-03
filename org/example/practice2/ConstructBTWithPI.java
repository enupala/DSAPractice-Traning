package org.example.practice2;

public class ConstructBTWithPI {
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
        Node node=makeBt(pre,0,pre.length-1,in,0,in.length-1);
        display(node);
    }

    private static void display(Node node) {
        if(node==null)
            return;
        String str="";
        if(node.left!=null)
        {
            str+=node.left.val;
        }
        str+=" <- "+node.val+"- >";
        if(node.right!=null)
        {
            str+=node.right.val;
        }

        System.out.println(str);

        display(node.left);
        display(node.right);

    }

    private static Node makeBt(int[] pre,int pStart,int preEnd,int[] in,int inStart, int inEnd) {
       // int pStart=pre[0],inStart=in[0],preEnd=pre.length-1,inEnd=in.length-1;
        if(pStart>preEnd || inStart > inEnd)
            return null;
        Node node=new Node(pre[pStart]);
        int indx=0;
        for(int i=0;i<in.length;i++)
        {
            if(node.val==in[i]) {
                indx = i;
                break;
            }

        }
        int nEle=indx-inStart;
        node.left=makeBt(pre,pStart+1,pStart+nEle,in,inStart,indx-1);
        node.right=makeBt(pre,pStart+nEle+1,preEnd,in,indx+1,inEnd);
        return node;
    }
}
