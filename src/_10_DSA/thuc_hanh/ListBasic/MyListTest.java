package _10_DSA.thuc_hanh.ListBasic;

public class MyListTest {
    public static void main(String[] args) {
        MyList list = new MyList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(4);
        System.out.println("Element 1= " + list.get(1));
        System.out.println("Element 2= " + list.get(2));
        System.out.println("element -1: " + list.get(-1));
    }
}
