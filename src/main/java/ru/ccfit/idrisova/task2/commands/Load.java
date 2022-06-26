package ru.ccfit.idrisova.task2.commands;

import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Command;
import ru.ccfit.idrisova.task2.Context;
import java.util.Scanner;

import java.io.*;
import java.util.List;

public class Load implements Command {
    public void calculate(Context context, List<String> parameters) throws CalcException, IOException{
        if(parameters.size() < 2)
            throw new CalcException("Not enough parameters in LOAD");
        Scanner scanner = new Scanner(new FileInputStream(parameters.get(1)));
        while (scanner.hasNextDouble()) {
            context.push(scanner.nextDouble());
        }
    }
}
