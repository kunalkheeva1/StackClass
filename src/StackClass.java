public class StackClass {
   //creating a node class for the linked list stacks
    public static class Node{
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

        //method just in case if list is empty
        public static boolean isEmpty(){
            return head==null;
        }

        //creating a push method
        public static void push(int data){
            Node newNode = new Node(data);  //idk why did not we make node like this in previous method but it is what it is

        if(isEmpty()){                     //if no element then make my input as head
            head = newNode;
            return;
        }
        newNode.next = head;                //next of the newNode is pointing towards the current head
        head =newNode;                      //and newNode becomes new head
        }


        //
    }


    public static void main(String[] args) {

    }
}
