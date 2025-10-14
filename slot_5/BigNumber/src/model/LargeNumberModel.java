package model;

import java.math.BigInteger;

public class LargeNumberModel {

    private BigInteger number1;
    private BigInteger number2;
    private BigInteger result;

    public void setNumbers(String num1, String num2) {
        // Sử dụng BigInteger để xử lý số lớn
        this.number1 = new BigInteger(num1);
        this.number2 = new BigInteger(num2);
    }

    public void add() {
        this.result = number1.add(number2);
    }

    public void multiply() {
        this.result = number1.multiply(number2);
    }

    public BigInteger getResult() {
        return result;
    }

    public BigInteger getNumber1() {
        return number1;
    }

    public BigInteger getNumber2() {
        return number2;
    }
}