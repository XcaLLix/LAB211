package validator;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

    private final Scanner scanner = new Scanner(System.in);

    public String getLargeNumberInput(String prompt) throws InputMismatchException {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            throw new InputMismatchException("Error: Dau vao khong duoc trong.");
        }

        if (!input.matches("^-?\\d+$")) {
            throw new InputMismatchException("Error: So khong hop le");
        }

        try {
            new BigInteger(input);
        } catch (NumberFormatException e) {
             throw new InputMismatchException("Error: Loi " + e.getMessage());
        }

        return input;
    }
}