/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class One {
    int x;

    // Parameterized constructor in One class
    One(int x) {
        this.x = x;
        System.out.println("One's constructor, x = " + x);
    }
}

class Two extends One {
    // Constructor of Two class explicitly calls One's parameterized constructor
    Two(int x) {
        super(x); // Call the parameterized constructor of One
        System.out.println("Two's constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Two obj = new Two(10);  // Now works, passing 10 to the constructor
    }
}

