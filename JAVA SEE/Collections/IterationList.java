import java.util.*;

public class IterationList {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("Iterating from index 2:");
        ListIterator<String> it1 = list.listIterator(2);
        while (it1.hasNext())
            System.out.println(it1.next());
        
    }
}
