package controller;

import model.LargeNumberModel;
import validator.Validator;
import view.ConsoleView;

import java.util.InputMismatchException;

public class LargeNumberController {
    
    private final LargeNumberModel model;
    private final ConsoleView view;
    private final Validator validator;

    public LargeNumberController(LargeNumberModel model, ConsoleView view, Validator validator) {
        this.model = model;
        this.view = view;
        this.validator = validator;
    }

    public void execute() {
        view.displayWelcome();
        
        String num1Str = null;
        String num2Str = null;
        
        // Vòng lặp để đảm bảo nhập số thứ nhất hợp lệ
        while (num1Str == null) {
            try {
                num1Str = validator.getLargeNumberInput("Enter 1st number: ");
            } catch (InputMismatchException e) {
                view.displayErrorMessage(e.getMessage());
            }
        }
        
        // Vòng lặp để đảm bảo nhập số thứ hai hợp lệ
        while (num2Str == null) {
            try {
                num2Str = validator.getLargeNumberInput("Enter 2nd number: ");
            } catch (InputMismatchException e) {
                view.displayErrorMessage(e.getMessage());
            }
        }
        
        // Đặt dữ liệu vào Model
        model.setNumbers(num1Str, num2Str);
        
        // 1. Thực hiện phép Cộng
        model.add();
        view.displayResult(model.getNumber1(), model.getNumber2(), "+", model.getResult());
        
        // 2. Thực hiện phép Nhân
        model.multiply();
        view.displayResult(model.getNumber1(), model.getNumber2(), "*", model.getResult());
    }
}