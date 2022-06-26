package ru.ccfit.idrisova.task2.commands;

import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Command;
import ru.ccfit.idrisova.task2.Context;

import java.util.List;

public class Push implements Command {
    private String parameter;

    public void calculate(Context context, List<String> parameters) throws CalcException {
        if(parameters.size() < 2)
            throw new CalcException("Not enough parameters in PUSH");
        parameter = parameters.get(1);
        if(context.isInListDefinition(parameter))
            context.push(context.getValue(parameter));
        else{
            char array[] = parameter.toCharArray();
            double num = Double.parseDouble((parameter));
            context.push(num);
        }
    }
}
