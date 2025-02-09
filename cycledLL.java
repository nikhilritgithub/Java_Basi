public class cycledLL {
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

    //function to chcek cycle in LL
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //function to remove cycle in LL
    public static void removeCycle(){

        //step.1 To detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
            if(cycle == false){
                return;
            }

        //step.2 to find meeting point
        slow = head;
        Node prev = null;
        while( slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //step.3 remove cycle
        prev.next = null;
    }

    public static void main(String args[]){
         head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
         tail = new Node(4);

        head.next = second;
        second.next = third;
        third.next = tail;
        tail.next = third;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
