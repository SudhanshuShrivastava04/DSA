import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {
    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.val + "(y/n)");
        char checkLeft = scanner.next().charAt(0);
        boolean left;
        left = checkLeft == 'y';

        if(left){
            System.out.println("Enter the value of left node");
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }

        System.out.println("Do yo want to enter right of " + node.val + "(y/n)");
        char checkRight = scanner.next().charAt(0);
        boolean right;
        right = checkRight == 'y';

        if(right){
            System.out.println("Enter the value of right node");
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent){
        if(node == null) return;
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right , indent + "\t");
    }

    private void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null) return;

        prettyDisplay(node.right, level + 1);
        if(level != 0){
            for (int i = 0; i < level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|---->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.prettyDisplay();
    }

}
