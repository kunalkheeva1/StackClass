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

        //creating a push method to delete the elements.
        public static void push(int data){
            Node newNode = new Node(data);  //idk why did not we make node like this in previous method but it is what it is

        if(isEmpty()){                     //if no element then make my input as head
            head = newNode;
            return;
        }
        newNode.next = head;                //next of the newNode is pointing towards the current head
        head =newNode;                      //and newNode becomes new head
        }


        //creating a pull method to delete and get the top element
        public static int pop(){            //idk why isn't there any data in parameter
            if(isEmpty()){
                return -1;                   //-1 will depict the absence of any element in the list
            }
        int top = head.data;
        head = head.next;
        return top;
        }

        //working on peek method to have a look now
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
           return head.data;                //if it has elements then return the data of the head
        }
    }


    public static void main(String[] args) {

    }
}
