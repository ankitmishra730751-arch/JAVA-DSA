public class Linklistiterate {
    if(head == null || head.next == null){
        return;

    }
    Node prevNode = head;
    Node CurrNode = head.next;
    while (currNode!= null){

        Node nextNode != currNode.next;
        CurrNode.next = prevNode;

        prevNode = CurrNode;
        CurrNode = nextNode;

    }
    head.next = null;
    head = prevNode;
}
public static void main (String args[]){
    LL list = new LL();
    list.reverseIterate();
    list.printList();
}
    
