public class ThisPerson {
    private String name;
    private int age;

    public ThisPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() 
{
	System.out.println("Koradiya Khush");
	System.out.println("ER. NO. 220130318018");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        ThisPerson Thisperson = new ThisPerson("Rohit", 23);
        Thisperson.display();
    }
}
