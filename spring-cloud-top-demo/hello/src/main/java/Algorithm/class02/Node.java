package Algorithm.class02;

/**
 * @Author: lanyong_csd
 * @Create: 2020/9/15 10:20
 * @Company: Si-tech
 * @Description:
 **/
public class Node {
    public int value;
    public Node next;
    public Node(int data){
        this.value=data;
    }
    public static Node revertLinkedList(Node head){
        Node pre=null;
        Node next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
