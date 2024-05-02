public class TemperatureConverter {
    // Method to convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        // Test the methods
        double fahrenheit = 98.6;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        celsius = 37;
        fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
    }
}
