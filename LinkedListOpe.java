
import java.util.LinkedList;

import javax.lang.model.util.SimpleElementVisitor14;

import javax.management.relation.RelationSupport;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class LinkedListOpe {
    Node head;
    LinkedListOpe(){
        head = null;
    }
    void addEnd(int data){
        Node nn = new Node(data);
        Node temp = head;
        if(head == null){
            head = nn;
        }
        else if(head.next == null){
            head.next = nn;
        }
        else{
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = nn;
        }
    }
    void addFirst(int data){
        Node nn = new Node(data);
        Node temp = head;
        if(head == null){
            head = nn;
        }
        else if(temp.next == null){
            nn.next = temp;
        }
        else {
            nn.next = temp;
            head = nn;
        }
    }
    void addAtPosition(int data, int position){
        Node nn = new Node(data);
        Node temp = head;
        if(head == null){
            head = nn;
            return;
        }
        else if(temp.next == null){
            nn.next = temp;
        }
        else{
        while(position > 1){
            position --;
            temp = temp.next;
        }
            nn.next = temp.next;
            temp.next = nn;
        }
    }
    void delAtEnd()

    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("is empty");
        }
        else if(head.next==null)
        {
            System.out.println("deleted node is " +head.data); 
            head=null;
        }
        else{
            while(temp.next.next != null) 
            {
                temp=temp.next;
            }
            System.out.println("deleted the node" + temp.next.data);
            temp.next=null;
        }
    }
    void delAtPos()

    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("is empty");
        }
        else if(head.next==null)
        {
            System.out.println("deleted node is " +head.data); 
            head=null;
        }

        else{
            while(temp.next.data != 10 && temp.next!=null)
            {
                temp=temp.next;
            }
            System.out.println("deleted the node" + temp.next.data);
            temp.next=null;
        }
    }
    void search(int data)
     {
        Node temp=head;
        while(temp.data!=data &&  temp.next!=null)
        temp=temp.next;
        if(temp.data==data)
        System.out.println(data + "isfound");
        else
        System.out.println(data + "isnotfound");
     }

    int  displayList(Node head){
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty..!");
            return 0;
        }
//        else{
//            while (temp.next != null){
//                System.out.println(temp.data);
//                temp = temp.next;
//            }
//            System.out.println(temp.data);
//        }
        System.out.println(temp.data);
        return displayList(temp.next);
    }


    public static void main(String[] args) {
        LinkedListOpe l1 = new LinkedListOpe();
        l1.addFirst(90);
        l1.addEnd(10);
        l1.addEnd(13);
        l1.addEnd(23);
        l1.addEnd(324);
        l1.addEnd(133);
        l1.addFirst(909);
        l1.addAtPosition(77,3);
        l1.displayList(l1.head);
        l1.delAtEnd();
        l1.delAtPos();
        l1.search(89);
        l1.displayList(l1.head);
        
        
    
    
    }
}


 
    

