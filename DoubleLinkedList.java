
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class DoubleLinkedList {
    Node head=null,tail=null;
     void insertEnd(int data)
     {
        Node nn =new Node(data);
        if(head==null)
        head=nn;
        else if(head.next==null)
        head=tail=nn;
        else{
            tail.next=nn;
            tail=tail.next;
        }
     }
     void search(int data)
     {
        Node temp=head;
        while(temp.data!=data &&  temp.next!=null)
        temp=temp.next;
        if(temp.data==data)
        System.out.printl(data + "isfound");
        else
        System.out.printl(data + "isfound");
     }
    
}
