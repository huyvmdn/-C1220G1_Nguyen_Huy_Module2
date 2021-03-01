package _11_queue_stack.bai_tap.queue_rin_link;

public class MyLinkedListQueue {
    private Node front;
    private Node rear;
    private int size;

    public MyLinkedListQueue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
            size++;
            return;
        }
        this.rear.next = temp;
         this.rear=temp;
        this.rear.next=this.front;
        size++;
    }
    public Node dequeue() {
        if (this.front == null)
            return null;
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        size--;
        return temp;
    }


    public void display() {
        Node temp = this.rear.next;
       for (int i=0;i<size;i++) {
           System.out.println(temp.data);

       }
    }
}