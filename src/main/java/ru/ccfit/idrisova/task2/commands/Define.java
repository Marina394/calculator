package ru.ccfit.idrisova.task2.commands;

import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Command;
import ru.ccfit.idrisova.task2.Context;

import java.util.Map;
import java.util.List;

public class Define implements Command {
    private String parameter;
    private String num;

    public void calculate(Context context, List<String> parameters) throws CalcException {
        if(parameters.size() < 3)
            throw new CalcException("Not enough parameters in DEFINE");
        parameter = parameters.get(1);
        num = parameters.get(2);
        char array[] = num.toCharArray();
        double numDouble = Double.parseDouble(num);
        context.setValue(parameter, numDouble);
    }
}
