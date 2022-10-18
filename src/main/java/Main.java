import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        System.out.println("Enter a command:");
        String input = console.nextLine();

        while (!input.equals("exit")) {
            args = input.split(" ");

            if (args.length != 2 && args.length != 3) {
                exit(0);
            }

            String method = args[0];
            String operand1 = args[1];
            String operand2 = null;
            Calculator calc = new Calculator();

            if (!method.equals("fibonacci") && !method.equals("binary")) {
                operand2 = args[2];
            }

            switch (method) {
                case "binary":
                    String binaryResult = calc.intToBinaryNumber(Integer.parseInt(operand1));
                    System.out.println(binaryResult);
                    break;
                case "fibonacci":
                    int result = calc.fibonacciNumberFinder(Integer.parseInt(operand1));
                    System.out.println(result);
                    break;
                case "add":
                    result = calc.add(Integer.parseInt(operand1), Integer.parseInt(operand2));
                    System.out.println(result);
                    break;
                case "subtract":
                    result = calc.subtract(Integer.parseInt(operand1), Integer.parseInt(operand2));
                    System.out.println(result);
                    break;
                case "multiply":
                    result = calc.multiply(Integer.parseInt(operand1), Integer.parseInt(operand2));
                    System.out.println(result);
                    break;
                case "divide":
                    result = calc.divide(Integer.parseInt(operand1), Integer.parseInt(operand2));
                    System.out.println(result);
                    break;
            }

            input = console.nextLine();


        }

    }
}
