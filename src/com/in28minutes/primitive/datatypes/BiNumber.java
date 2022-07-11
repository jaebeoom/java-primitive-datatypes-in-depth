package com.in28minutes.primitive.datatypes;

public class BiNumber {

    private int num1;
    private int num2;

    BiNumber (int num1, int num2) {
        if (num1 > 0)
            this.num1 = num1;
        if (num2 > 0)
            this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public void doubleValue() {
        this.num1 *= 2;
        this.num2 *= 2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
