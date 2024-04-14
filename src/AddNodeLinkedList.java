public class AddNodeLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5};
        Node head = convertArrayToLinkedList(arr);
        print(head);
        System.out.println();
        head = insertK(head,3,5);
        print(head);
    }

    public static Node insertK(Node head, int data, int k){
        if(head == null){
            if(k == 1) return  new Node(data);
            else return null;
        }
        Node temp = head;
        int count = 0;
        Node prev = null;

        if(k == 1){
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }
        while(temp != null){
            count++;
            if(count == k){
                Node newNode = new Node(data);
                prev.next = newNode;
                newNode.next = temp;
                break;
            }
            if(count == k-1){
                Node newNode = new Node(data);
                temp.next = newNode;
                newNode.next = null;
                break;
            }
            prev = temp;
            temp = temp.next;

        }

        return head;
    }

    public static Node convertArrayToLinkedList(int[] arr){
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i<arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    public static void print(Node head){
       Node current = head;

        while(current != null){
            System.out.print(current.data + "->");
            current= current.next;
        }
    }


}
