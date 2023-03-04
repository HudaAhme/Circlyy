/**
 * Created by DELL on 26/01/2023.
 */
public class CirclyLinkedList<E> {

    private Node<E>tail=null;
    private int size=0;

    public CirclyLinkedList(){};

    public boolean isEmpty(){return size==0;}
    public int size(){return size; };

    public E First(){
        if (isEmpty())return null;
        return tail.next.element;}

    public E Las(){
        if (isEmpty())return null;
        return tail.element;}

    public void  addfirst(E element){
      if        (isEmpty())
      {
          tail=new Node<E>(element,null);
          tail.next=tail;
      }else
      {
          Node<E>newest =new Node<E>(element,tail.next);
          tail.next=newest;
      }
    }
    public void addlast(E element) {

        addfirst(element);
        tail = tail.next;
    }

    public E removefirt(){

        if (isEmpty())return null;
        Node<E>x=tail.next;

        if (x==tail)
            tail=null;
        else
            tail.next=x.next;
        size--;
        return x.element;

    }

    public void rotate(){
        if (tail!=null)
            tail=tail.next;
    }























    private static class Node<E>{
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}


