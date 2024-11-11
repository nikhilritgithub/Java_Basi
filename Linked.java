public class Linked {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addIndex(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        size--;
        return val;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static int search(int key){
        Node temp = head;
        for(int i=0; i<size-1; i++){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }



    public static void main(String args[]){
        Linked ll = new Linked();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println("Size of linkedlist is: " + size);

        ll.addIndex(2,0);
        ll.print();
        System.out.println("Size of linkedlist is: " + size);
        ll.removeFirst();
        ll.print();
        System.out.println("Size of linkedlist is: " + size);
        ll.removeLast();
        ll.print();
        System.out.println("Size of linkedlist is: " + size);                                                        


        int key = 5;
        System.out.println("key fount at: " + search(key));
    }
}
