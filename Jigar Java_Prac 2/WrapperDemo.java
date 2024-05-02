public class WrapperDemo {
    public static void main(String[] args) {
        // Creating a variable of type int
        int num = 21;

        // Wrapping the int variable with Integer class
        Integer wrappedNum = Integer.valueOf(num);

        // Printing out the wrapped value
        System.out.println("Wrapped value: " + wrappedNum);

        // Parsing the String "20" into an int
        String str = "20";
        int parsedValue = Integer.parseInt(str);

        // Printing out the parsed value
        System.out.println("Parsed value: " + parsedValue);
    }
}
