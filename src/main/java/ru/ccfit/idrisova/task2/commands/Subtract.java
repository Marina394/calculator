package ru.ccfit.idrisova.task2.commands;

import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Command;
import ru.ccfit.idrisova.task2.Context;

import java.util.List;
import java.util.Stack;

public class Subtract implements Command {
    public void calculate(Context context, List<String> parameters) throws CalcException{
        if(context.getSizeStack() < 2)
            throw new CalcException("Stack is empty");
        context.push(context.pop() - context.pop());
    }
}
