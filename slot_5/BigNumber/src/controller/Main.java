package controller;

import model.LargeNumberModel;
import validator.Validator;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo các thành phần MVC và Validator
        LargeNumberModel model = new LargeNumberModel();
        ConsoleView view = new ConsoleView();
        Validator validator = new Validator();

        // Nối các thành phần lại trong Controller
        LargeNumberController controller = new LargeNumberController(model, view, validator);

        // Chạy ứng dụng
        controller.execute();
    }
}
