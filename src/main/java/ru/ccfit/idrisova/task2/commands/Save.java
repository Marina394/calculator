package ru.ccfit.idrisova.task2.commands;

import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Command;
import ru.ccfit.idrisova.task2.Context;

import java.io.IOException;
import java.util.List;
import java.io.FileWriter;

public class Save implements Command {
    public void calculate(Context context, List<String> parameters) throws CalcException, IOException{
        if(parameters.size() < 2)
            throw new CalcException("Not enough parameters in SAVE");

        FileWriter writer = new FileWriter(parameters.get(1));
        List<Double> copy = context.getStack();
        copy.forEach(e -> {
            try {
                writer.write(e.toString() + '\n');
            } catch (IOException ex) {
               System.err.println("Error while writing file: "+ex.getLocalizedMessage());
            }
        });
    }
}
