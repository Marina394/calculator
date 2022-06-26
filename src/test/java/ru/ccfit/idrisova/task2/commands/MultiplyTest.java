package ru.ccfit.idrisova.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Context;

import java.util.Arrays;
import java.util.List;

public class MultiplyTest {
    @Test
    public void operationTest() throws CalcException {
        Multiply multiply = new Multiply();
        Context context = new Context();
        context.push(4.0);
        context.push(3.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        multiply.calculate(context, list);
        Assert.assertEquals(context.pop(), 12.0, 0);
    }
}