/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    int speed;
    String name;  // Change 'int' to 'String' for the name variable
    
    void setspeed(int speed) {
        this.speed = speed;
    }
    
    void setname(String name) {
        this.name = name;
    }
    
    int getspeed() {
        return this.speed;
    }
    
    String getname() {
        return this.name;
    }
    
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.setname("Honda");  // Corrected the method call syntax
        m1.setspeed(100);     // Corrected the method call syntax
        System.out.println(m1.getname() + " " + m1.getspeed());
    }
}
