package view;

import java.math.BigInteger;

public class ConsoleView {

    public void displayResult(BigInteger num1, BigInteger num2, String operation, BigInteger result) {
        System.out.println("------------------------------------------");
        System.out.printf("Equation: %s %s %s\n", num1.toString(), operation, num2.toString());
        System.out.println("Result: " + result.toString());
        System.out.println("------------------------------------------");
    }

    public void displayErrorMessage(String message) {
        System.err.println("!!! error: " + message);
    }
    
    public void displayWelcome() {
        System.out.println("--- BIGNUM ---");
    }
}
