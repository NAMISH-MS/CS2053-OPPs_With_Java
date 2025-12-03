// Example 5: Constructor Overloading — Complex Number
// Problem:

// Create a class Complex with overloaded constructors:

// Default (0 + 0i)

// One value (real only)

// Two values (real + imaginary)


class Complex {
    int real, imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(int r) {
        real = r;
        imag = 0;
    }

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(5);
        Complex c3 = new Complex(3, 4);

        c1.display();
        c2.display();
        c3.display();
    }
}
