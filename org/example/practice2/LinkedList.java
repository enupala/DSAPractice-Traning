package org.example.practice2;

public class LinkedList {
    static Node head ;
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.insertAtPosition(10, 0); // Insert at position 0
        list.insertAtPosition(20, 1); // Insert at position 1
        list.insertAtPosition(30, 2);
        //display(list);
        list.insertAtPosition(15, 1);
        display(list);
    }

    private static void display(LinkedList list) {
        Node temp=head;
        while(temp!=null)
        {
            int data= temp.data;
            System.out.print("data :"+data+" ");
            temp=temp.next;
        }
    }

    private void insertAtPosition(int data, int pos) {
        Node newNode=new Node(data);

        if(pos==0)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        int count=0;
        Node temp=head;
       while(temp!=null && count<pos-1)
       {
           temp=temp.next;
           count++;
       }
       if(temp==null)
           return;
       newNode.next=temp.next;
       temp.next=newNode;

    }


}
