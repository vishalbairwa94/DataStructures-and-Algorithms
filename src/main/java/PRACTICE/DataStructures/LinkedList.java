package PRACTICE.DataStructures;

public class LinkedList {
    Node head;

    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    //adding new node at front

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
//add in between
    public void insertAfter(Node prevNode, int data){
        if(prevNode == null){
            System.out.println("cannot be null");
        }

        Node new_node = new Node(data);
        new_node.next = prevNode.next;
        prevNode.next = new_node;
    }
//append at the end
    public void append(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new Node(data);
        }

        new_node.next = null;
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = new_node;
    }
    //deleting node

    public void deleteNode(int key){
        Node temp = head, prev = null;

        if(temp!=null && temp.data == key){
            head = temp.next;
        }

        while(temp!=null && temp.data!=key){
            prev = temp;
            temp = temp.next;
        }

        if(temp==null){
            return;
        }

        prev.next = temp.next;
    }

    public void deleteNodeAtPos(int position){
        if (head ==null){
            return;
        }
        Node temp = head;

        if(position==0){
            head = temp.next;
        }
        for(int i =0; i< position-1; i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            return;
        }

        Node next = temp.next.next;
        temp.next = next;
    }

    public void deleteFullLinkedList(){
        head = null;
    }

    public int getCount(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean search(Node head, int x){
        Node temp = head;
        while(temp!=null){
            if(temp.data == x){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int getNth(int index){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            if(count == index){
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        return 0;
    }

    public void printNthFromLast(int n){
        int len = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        if(len<n){
            return;
        }
        temp = head;

        for(int i =0; i < len - n+1; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void traverseCircularLinkedList(Node head){
        Node temp = head;

        if(head != null){
            do{
                System.out.println(temp.data+ " ");
                temp = temp.next;
            }
            while (temp!=head);
        }
    }


    public void main(String args[]){
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        llist.head.next = second;
        second.next = third;
    }
}
