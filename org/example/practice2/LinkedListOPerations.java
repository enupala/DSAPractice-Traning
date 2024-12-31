package org.example.practice2;

public class LinkedListOPerations {
    static class Node{
        int val;
        Node next;

        public Node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        Node head=null;
        int arr[]={10,20,30,40,50};
        for(int ele : arr)
        head=addFirst(ele,head);
        printLL(head);
      head=  addAt(head,2,25);
        printLL(head);
        head=  addAt(head,6,100);
        printLL(head);
        head=  addAt(head,0,6);
        printLL(head);
        head=deleteNode(head,1);
        printLL(head);
        head=deleteNode(head,0);
        printLL(head);
       /* head=deleteNode(head,5);
        printLL(head);*/
        head=reverseLL(head);
        printLL(head);
        midOfLL(head);



    }

     static Node addFirst(int ele, Node head) {
        Node nn=new Node(ele);
        nn.next=head;
        head=nn;
        return head;
    }
    static void printLL(Node head)
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println(".");

    }
    static Node addAt(Node head, int indx,int val)
    {
        Node nn=new Node(val);
        if(indx==0)
        {
            nn.next=head;
            head=nn;
        }
        else {
            Node temp=head;
            for(int k=1;k<=indx-1;k++)
            {
                temp=temp.next;

            }
            nn.next=temp.next;
            temp.next=nn;
        }
        return head;
    }
    static Node deleteNode(Node head,int indx)
    {
        if(indx==0)
        {
            head =head.next;
        }
        else{
            Node temp=head;
            for(int k=1;k<=indx-1;k++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        return head;
    }
    static Node reverseLL(Node head)
    {
        Node prev=null,curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        return  prev;
    }
    static void midOfLL(Node head)
    {
        Node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.val);
    }

}
