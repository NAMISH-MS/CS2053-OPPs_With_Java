public class Pair<T, V> {
    T first;
    V second;
    
    Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    void display(){
        System.out.println(first + ", " + second);
    }

    public static void main(String[] args){
        Pair<String, Integer> p = new Pair<>("Age", 25);
        p.display();
    }
}
