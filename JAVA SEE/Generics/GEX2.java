// 2. Generic Class With Two Type Parameters

class Pair<K, V>{
    K key;
    V value;

    public Pair(K key, V value){
        this.key = key;
        this.value =  value;
    }

    public void display(){
        System.out.println("key: " + key + ", Value: " + value);
    }
}

public class GEX2 {
    public static void main(String[] args){
        Pair<String, Integer> pair = new Pair<>("Namish", 10);
        pair.display();

        Pair<Double, String> pair1 = new Pair<>(1010.1010, "Hello Generics");
        pair1.display();
    }
}


// Possible Lab Question

// ✔ Create a generic class Pair<K, V> with two parameters and display key-value pairs.