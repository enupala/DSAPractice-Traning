package org.example.practice2;

public class ReorderingOFLL {
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

    int arr[]={10,12,30,33,50};
        for(int ele : arr)
    head=addLast(ele,head);
    printLL(head);

        Node newhead=reOrder(head);
    printLL(newhead);
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
    static Node midEle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    static Node reverseLL(Node head)
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }
    static Node reOrder(Node head)
    {
       Node midNode= midEle(head);

       Node head2=midNode.next;
        midNode.next=null;
        head2= reverseLL(head2);
        Node dummy=new Node(-1);
        Node temp=dummy;
        Node t1=head;
        Node t2=head2;
        while(t1!=null && t2!=null)
        {
            temp.next=t1;
            temp=temp.next;
            t1=t1.next;
            temp.next=t2;
            temp=temp.next;
            t2=t2.next;
        }
        if(t1==null)
            temp.next=t2;
        if(t2==null)
            temp.next=t1;
        return dummy.next;

    }
}

