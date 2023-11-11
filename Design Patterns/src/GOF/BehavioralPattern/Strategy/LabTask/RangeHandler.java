/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Strategy.LabTask;

/**
 *
 * @author shafq
 */
public abstract class RangeHandler {
    private RangeHandler nextHandler;

    public void setNextHandler(RangeHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract int handleRequest(int num1, int num2);

    protected int next(int num1, int num2) {
        if (nextHandler != null) {
            return nextHandler.handleRequest(num1, num2);
        } else {
            // Default behavior if there is no next handler
            return 0;
        }
    }
}

public class AddHandler extends RangeHandler {
    @Override
    public int handleRequest(int num1, int num2) {
        // Check if within the range for addition
        if (num1 + num2 <= 100) {
            // Perform addition
            return num1 + num2;
        } else {
            // Pass the request to the next handler
            return next(num1, num2);
        }
    }
}

public class SubtractHandler extends RangeHandler {
    @Override
    public int handleRequest(int num1, int num2) {
        // Check if within the range for subtraction
        if (num1 - num2 <= 1000) {
            // Perform subtraction
            return num1 - num2;
        } else {
            // Pass the request to the next handler
            return next(num1, num2);
        }
    }
}

// Similarly, create handlers for other ranges (Multiply, Division, Power)

