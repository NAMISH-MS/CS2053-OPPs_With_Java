import java.util.*;


public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add(0, "Apple");
        list.add(1, "Banana");
        list.add(2, "Cherry");
        System.out.println(list);
        System.out.println(list.reversed());
    }
}

