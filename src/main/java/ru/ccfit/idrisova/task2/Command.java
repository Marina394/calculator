package ru.ccfit.idrisova.task2;

import java.io.IOException;
import java.util.List;

public interface Command {
    void calculate(Context context, List<String> parameters) throws CalcException, IOException;
}
