package Algorithm.class02;

/**
 * @Author: lanyong_csd
 * @Create: 2020/9/19 20:40
 * @Company: Si-tech
 * @Description:
 **/
public class Code03_DoubleEndsQueueToStackAndQueue {
    public static class Node<T>{
        public T value;
        public Node<T> last;
        public Node<T> next;
        public Node(T data){
            value=data;
        }
    }
    public static class DoubleEndsQueue<T>{
        public Node<T> head;
        public Node<T> tail;
        public void addFromHead(T value){
        Node<T> cur=new Node<>(value);
        if(head==null){
            head=cur;
            tail=cur;
        }else{
            cur.next=head;
            head.last=cur;
            head=cur;
        }

    }
    }
}
