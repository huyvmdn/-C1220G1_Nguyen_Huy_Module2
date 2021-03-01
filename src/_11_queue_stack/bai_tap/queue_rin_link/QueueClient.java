package _11_queue_stack.bai_tap.queue_rin_link;



public class QueueClient {
    public static void main(String[] args) {
      MyLinkedListQueue queue = new MyLinkedListQueue();
      queue.enqueue(6);
      queue.enqueue(2);
      queue.enqueue(3);
      queue.enqueue(4);
      queue.enqueue(5);
      queue.dequeue();
      queue.display();
    }
}
