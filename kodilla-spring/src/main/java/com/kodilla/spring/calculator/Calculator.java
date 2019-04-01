package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {
    @Autowired
    private Display display;

    public double add(double a, double b) {
        double out = a + b;
        display.displayValue(out);
        return out;
    }

    public double sub(double a, double b) {
        double out = a - b;
        display.displayValue(out);
        return out;
    }

    public double mul(double a, double b) {
        double out = a * b;
        display.displayValue(out);
        return out;
    }

    public double div(double a, double b) {
        double out = a / b;
        display.displayValue(out);
        return out;
    }
}
