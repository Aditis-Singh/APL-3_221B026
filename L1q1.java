/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Mother {
    int x;

    void show() {
        System.out.println("Mother's show method");
    }
}

class Child extends Mother {
}

class Main {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); // show of Mother is called
        
        Child ch = new Child();
        ch.show(); // show() inherited in Child from Mother is called
    }
}
