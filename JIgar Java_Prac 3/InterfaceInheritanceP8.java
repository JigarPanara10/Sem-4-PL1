interface P1 {
    int CONSTANT_P1 = 18;
    void methodP1();
}

interface P2 {
    int CONSTANT_P2 = 25;
    void methodP2();
}

// Interface P12 inherits from P1 and P2
interface P12 extends P1, P2 {
    void methodP12();
}

// Class Q implements interface P12
class Q implements P12 {
    //Override
    public void methodP1() {
        System.out.println("Method from P1");
    }

    //Override
    public void methodP2() {
        System.out.println("Method from P2");
    }

    //Override
    public void methodP12() {
        System.out.println("Method from P12");
    }
}

public class InterfaceInheritanceP8 {
    public static void main(String[] args) {
        Q q = new Q();
        q.methodP1(); 
        q.methodP2();  
        q.methodP12(); 

        System.out.println("Constant from P1: " + P1.CONSTANT_P1); // Output: Constant from P1: 10
        System.out.println("Constant from P2: " + P2.CONSTANT_P2); // Output: Constant from P2: 20
    }
}