public class StackClass {
   //creating a node class for the linked list stacks
    public class Node{
        int data;
        Node next;
       public Node(int data){
            this.data= data;
            next = null;
       }
    }
    //creating a stack class to store the methods of push, pop and peek in it,
    public class Stack{
        public static Node head;     //head node, static so that i dont need to make one over and over
        public static boolean isEmpty(){
            return head==null;
        }
    }


    public static void main(String[] args) {

    }
}
