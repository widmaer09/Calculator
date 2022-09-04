package com.example.demo;

public class Calculation {
    public CalculationBehavior getCal() {
        return cal;
    }

    public void setCal(CalculationBehavior cal) {
        this.cal = cal;
    }

    private CalculationBehavior cal;
    private double sum;
    private boolean value2Switch;
    private String operator;

    private StringBuilder value1 = new StringBuilder();

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public boolean isValue2Switch() {
        return value2Switch;
    }

    public void setValue2Switch(boolean value2Switch) {
        this.value2Switch = value2Switch;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public StringBuilder getValue1() {
        return value1;
    }

    public void setValue1(StringBuilder value1) {
        this.value1 = value1;
    }

    public StringBuilder getValue2() {
        return value2;
    }

    public void setValue2(StringBuilder value2) {
        this.value2 = value2;
    }

    private StringBuilder value2 = new StringBuilder();

    public String valueToString(StringBuilder value) {
        return value.toString();
    }


    public Calculation(CalculationBehavior cal) {
        this.cal = cal;
    }


    public double Calculations() {
        Double dValue1 = Double.parseDouble(valueToString(value1));
        Double dValue2 = Double.parseDouble(valueToString(value2));
        this.setSum(cal.Calculate(dValue1, dValue2));
        return getSum();
    }

    public void setCalculationOperation(CalculationBehavior operation) {
        this.cal = operation;
    }


}
