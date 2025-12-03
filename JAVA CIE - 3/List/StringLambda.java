interface StringFunc {
    int getLength(String s);
}

public class StringLambda {
    public static void main(String[] args) {
        StringFunc len = (str) -> str.length();
        System.out.println("Length: " + len.getLength("Namish"));
    }
}
