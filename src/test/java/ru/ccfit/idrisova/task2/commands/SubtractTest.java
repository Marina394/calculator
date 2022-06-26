package ru.ccfit.idrisova.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Context;

import java.util.Arrays;
import java.util.List;

public class SubtractTest {
    @Test
    public void operationTest() throws CalcException {
        Subtract subtract = new Subtract();
        Context context = new Context();
        context.push(2.0);
        context.push(6.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        subtract.calculate(context, list);
        Assert.assertEquals(context.pop(), 4.0, 0);
    }
}