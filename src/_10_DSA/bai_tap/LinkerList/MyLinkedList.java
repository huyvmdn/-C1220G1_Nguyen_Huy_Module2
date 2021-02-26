package _10_DSA.bai_tap.LinkerList;

public class MyLinkedList<E> {
    private Node head;
    private Node last;
    private int numNodes;

    public MyLinkedList(E data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, E data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public E addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
        return head.data;
    }
    public E addLast (E data) {
        Node temp = head;
        do {
            temp=temp.next;
            if (temp==null) {
                temp=new Node(data);
                last = temp;
                numNodes++;
                return last.data;
            }
        }while (true);
    }




    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public E remove(int index) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node element=temp.next;
        holder = temp.next.next;
        temp.next = holder;
        numNodes--;
        return  element.data;
    }
    public int size() {
        return numNodes;
    }

    public E getHead() {
        return head.data;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        return temp.data;
    }
    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public void clear(){
        head=null;
        numNodes=0;
    }


}
