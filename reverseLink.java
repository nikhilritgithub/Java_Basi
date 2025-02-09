public class reverseLink {
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

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String args[]){
        reverseLink rv = new reverseLink();
        rv. addNode(4);
        rv.addNode(3);
        rv.addNode(2);
        rv.addNode(1);
        rv.print();

        rv.reverse();
        rv.print();

    }
}
