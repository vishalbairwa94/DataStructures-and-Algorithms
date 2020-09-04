class LinkedList{
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }


    }
    public void printList(){
        Node n = head;
        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
    //insert at beginning
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    //insert in middle of linked list
    public void insertAfter(Node prevNode, int new_data){
        if(prevNode == null){
            System.out.println("Node cannot be empty");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prevNode.next;
        prevNode.next = new_node;

    }
    //insert at the end of linked list
    public void append(int new_data){
        Node new_node = new Node(new_data);

        if(head == null){
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    //delete any particular key from the linked list
    public void deleteNode(int key){
        Node temp = head, prev = null;

        if (temp != null && temp.data == key){
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) return;

        prev.next = temp.next;

    }

    //delete node at particular position
    public void deleteNodePosition(int position){
        if(head == null){
            return;
        }
        Node temp = head;

        if(position == 0){
            head = temp.next;
            return;
        }

        for(int i=0; temp != null && i < position - 1; i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }

    //to delete the whole linkedlist
    public void deleteList(){
        head = null;
    }

    //get the count of the linkedList

    public int getCount(){
        Node temp = head;
        int count = 0;

        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    //search an element in linkedlist
    public boolean search(int x){
        Node current = head;

        while (current != null){
            if(current.data == x){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //to get the element at particular index
    public int index(int key){
        Node current = head;
        int count = 0;

        while (current != null){
            if(count == key){
                return current.data;
            }
            count++;
            current = current.next;

        }
        assert(false);
        return 0;
    }

    //get the nth element from the last

    public int nthFromLast(int n){
        int len = 0;
        Node temp = head;

        while (temp != null){
            temp = temp.next;
            len++;
        }
        if(len<n){
            return 0;
        }

        temp = head;

        for(int i =1; i < len -n +1; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    //get the middle value from the list

    public void middle(){
        Node slow_ptr = head;
        Node fast_ptr = head;

        if(head != null){
            while (fast_ptr != null && fast_ptr.next != null){
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element of list is: " + slow_ptr.data);
        }
    }

    //count the occurance of element in linked list

    public int times(int n){
        Node current = head;
        int count = 0;

        while (current != null){
            if (n == current.data){
                count++;
            }
            current = current.next;
        }
        return count;
    }

    //remove duplicates from linked list

    public void removeDuplicate(){
        Node curr = head;

        while (curr != null){
            Node temp = curr;
            while (temp != null && temp.data == curr.data){
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }

    }

    public static void main(String[] args){
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        llist.push(5);
        llist.push(5);
        llist.push(5);
        llist.insertAfter(second, 6);
        llist.append(7);
        llist.deleteNode(7);
        llist.deleteNodePosition(4);

        System.out.println("The length of list is: " + llist.getCount());
        System.out.println("If element is present: " + llist.search(2));
        System.out.println("Element at index is : " + llist.index(3));
        System.out.println("Element from last is: " + llist.nthFromLast(2));
        System.out.println("Number of times element appeared is: " + llist.times(5));
        llist.removeDuplicate();

        llist.printList();

        llist.middle();
    }
}