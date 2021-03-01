package _10_DSA.bai_tap.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedListl = new MyLinkedList(10);
        linkedListl.addFirst(11);
        linkedListl.addFirst(12);
        linkedListl.addFirst(13);

        linkedListl.add(4, 9);
        linkedListl.add(4, 9);
        linkedListl.printList();
        System.out.println("----------------");
        linkedListl.remove(2);
        linkedListl.printList();
        System.out.println("----------------");

        linkedListl.printList();
        System.out.println("----------------");

        linkedListl.addLast(54);
        System.out.println("----------------");
        linkedListl.printList();


        linkedListl.clear();
        System.out.println("----------------");
        linkedListl.printList();
    }
}
