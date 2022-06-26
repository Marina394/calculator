package ru.ccfit.idrisova.task2.commands;

import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Command;
import ru.ccfit.idrisova.task2.Context;

import java.util.List;

public class Divide implements Command {
    public void calculate(Context context, List<String> parameters) throws ArithmeticException, CalcException{
        if(context.getSizeStack() < 2)
            throw new CalcException("Stack is empty");
        double num1 = context.pop();
        double num2 = context.pop();
        if(num2 == 0){
            throw new ArithmeticException();
        }
        context.push(num1 / num2);
    }
}
