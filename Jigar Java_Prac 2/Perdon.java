public class Perdon {
    // Attributes
    private String name;
    private int age;
    private String address;

    // Constructor
    public Perdon(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to introduce the Perdon
    public void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Create an object of Perdon class
        Perdon Perdon = new Perdon("Rohit ", 26, "Balagam");

        // Call the introduce() method to print out the Perdon's introduction
        Perdon.introduce();
    }
}
