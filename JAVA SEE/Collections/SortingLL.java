import java.util.*;

public class SortingLL {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }    
}
