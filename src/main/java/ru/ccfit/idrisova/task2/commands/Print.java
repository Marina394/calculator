package ru.ccfit.idrisova.task2.commands;

import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Command;
import ru.ccfit.idrisova.task2.Context;

import java.util.List;

public class Print implements Command {
    public void calculate(Context context, List<String> parameters) throws CalcException{
        if(context.getSizeStack() < 1)
            throw new CalcException("Stack is empty");
        double num = context.pop();
        System.out.println(num);
        context.push(num);
    }
}