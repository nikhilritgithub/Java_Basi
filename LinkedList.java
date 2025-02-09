public class LinkedList{
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

    public static int search(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String args[]){

        //create nodes..
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        tail = new Node(4);

        //link the nodes..
        head.next = second;
        second.next = third;
        third.next = tail;
        tail.next = null;

        //print the list..
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

        int key = 3;
        System.out.println("Element found at index: "+search(key));
    }
   
}