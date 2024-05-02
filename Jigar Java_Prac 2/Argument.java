public class Argument{
    private String name;
    private int age;

    public Argument(String name, int age) {
        this.name = name;
        this.age = age;
	
	System.out.println("Koradiya Khush");
	System.out.println("ER. NO. 220130318018");	
        System.out.println("Creating new Person: " + name + " " + age);
    }

    public static void main(String args[]) {
        Argument Argument1 = new Argument("Pinak", 30);
        Argument Argument2 = new Argument("Khush", 17);
        System.out.println("Argument 1: " + Argument1.name + ", " + Argument1.age);
        System.out.println("Argument 2: " + Argument2.name + ", " + Argument2.age);
    }
}
