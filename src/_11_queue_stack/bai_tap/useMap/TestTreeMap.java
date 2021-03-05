package _11_queue_stack.bai_tap.useMap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class TestTreeMap {

    public static void main(String[] args) {
        TreeMap<String, Integer> words = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string: ");
        String string = scanner.nextLine();
        string.trim();
        String[] textArray = string.split(" ");
        for (String e : textArray) {
            System.out.println(e);
        }
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, textArray);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("")) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            words.putIfAbsent(list.get(i), 0);
            words.put(list.get(i), words.get(list.get(i)) + 1);
        }

        System.out.println(words);
    }
}
