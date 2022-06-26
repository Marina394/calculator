package ru.ccfit.idrisova.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Context;

import java.util.Arrays;
import java.util.List;

public class SqrtTest {
    @Test
    public void operationTest() throws CalcException {
        Sqrt sqrt = new Sqrt();
        Context context = new Context();
        context.push(25.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        sqrt.calculate(context, list);
        Assert.assertEquals(context.pop(), 5.0, 0);
    }
}