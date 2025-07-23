package DSA.LinkedList;

public class SLinkedList {
    
  class Node {
    
    int data;
    Node next;

    Node (int data){

        this.data = data;

    }

  
  }

    public Node head = null;
    public Node tail = null;

    public void add(int data){

        Node newNode = new Node(data);

        if (head == null){

            head = newNode;

        }else {

            tail.next = newNode;

        }

        tail = newNode;
    }

    public void display(){

        if (head == null){

            System.out.println("Empty List");
        }

        Node  temp = head;

        while (temp != null) {
            
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
    }
}
