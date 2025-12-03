class GenericExample1<T>{
    T value;

    GenericExample1(T value){
        this.value = value;
    }

    void show(){
        System.out.println(value);
    }

    public static void main(String[] args){
        GenericExample1<Integer> b = new GenericExample1<>(10);
        b.show();
    }
}