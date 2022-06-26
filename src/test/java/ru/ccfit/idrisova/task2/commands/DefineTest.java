package ru.ccfit.idrisova.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DefineTest {
    @Test
    public void operationTest() throws CalcException {
        Context context = new Context();
        String[] commandLine = new String[3];
        commandLine[1] = "a";
        commandLine[2] = "4";

        List<String> list = Arrays.asList(commandLine);
        Define define = new Define();
        define.calculate(context, list);

        Assert.assertEquals(4, context.getValue("a"), 0);
    }
}