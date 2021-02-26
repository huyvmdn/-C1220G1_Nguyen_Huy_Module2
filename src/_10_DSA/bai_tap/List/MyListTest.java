package _10_DSA.bai_tap.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(4);
        System.out.println(list.toString());
    list.remove(2);
        System.out.println("---------------------------------");
        System.out.println(list.toString());
        MyList<Integer> abc = list.clone();
        System.out.println(abc.toString());
    }
}
