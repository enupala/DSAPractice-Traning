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
        Node head1=null;
        int arr[]={10,12,30,33,50};
        for(int ele : arr)
        head=addLast(ele,head);
        printLL(head);
        System.out.println("LL");
        Node revHead=reverseLL(head);
        printLL(revHead);

        int arr1[]={5,15,25,31,50};
        for(int ele : arr1)
            head1=addLast(ele,head1);
        printLL(head1);
      Node newMergedHead= mergeTwoLL(head,head1);
        printLL(newMergedHead);
      /*head=  addAt(head,2,25);
        printLL(head);
        head=  addAt(head,6,100);
        printLL(head);
        head=  addAt(head,0,6);
        printLL(head);
        head=deleteNode(head,1);
        printLL(head);
        head=deleteNode(head,0);
        printLL(head);
       *//* head=deleteNode(head,5);
        printLL(head);*//*
        head=reverseLL(head);
        printLL(head);
        midOfLL(head);*/



    }

     static Node addFirst(int ele, Node head) {
        Node nn=new Node(ele);
        nn.next=head;
        head=nn;
        return head;
    }
    static Node addLast(int ele, Node head)
    {
        Node nn=new Node(ele);
        if(head==null)
            return nn;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=nn;
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
    static Node mergeTwoLL(Node head1,Node head2)
    {
        Node dummy=new Node(-1);
        Node temp=dummy;
        Node t1=head1;
        Node t2=head2;
        while(t1!=null && t2!=null)
        {
            if(t1.val< t2.val)
            {
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;

            }
        }
        if(t1!=null)
        {
            temp.next=t1;
        }
        if(t2!=null)
            temp.next=t2;

        return  dummy.next;
    }

}
