class ComplexNumber {
    int real, imag;
  
    ComplexNumber(int r, int i) {
        real = r;
        imag = i;
    }

    void add(ComplexNumber c) {
        this.real += c.real;
        this.imag += c.imag;
    }

    void subtract(ComplexNumber c) {
        this.real -= c.real;
        this.imag -= c.imag;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 2);
        ComplexNumber c2 = new ComplexNumber(1, 7);

        System.out.print("First: ");
        c1.display();

        System.out.print("Second: ");
        c2.display();

        c1.add(c2);  
        System.out.print("Sum: ");
        c1.display();

   
    ComplexNumber c3 = new ComplexNumber(3, 2);
    c3.subtract(c2); 
    System.out.print("Difference: ");
    c3.display();
    }
}
