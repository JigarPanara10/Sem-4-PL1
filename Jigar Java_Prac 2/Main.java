public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Testing the calculator methods
        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);
        int product = calculator.multiply(10, 5);
        int quotient = calculator.divide(10, 5);

        // Printing out the results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);

        // Creating an instance of the Perdon class
        Perdon perdon = new Perdon("Raj", 22, "Rajkot");

        // Testing the person methods
        perdon.introduce();
        perdon.setName("Yuujiro Hanma");
        perdon.setAge(80);
        perdon.setAddress("Tokyo");
        perdon.introduce();

    }
}
/*
Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
Hi, my name is John Doe. I am 30 years old and I live at 123 Main St.  
Hi, my name is Jane Smith. I am 25 years old and I live at 456 Elm Ave.
98.60 Fahrenheit is equal to 37.00 Celsius.
37.00 Celsius is equal to 98.60 Fahrenheit.
*/
