package ru.ccfit.idrisova.task2.commands;

import org.junit.Test;
import org.junit.Assert;
import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AddTest {
    @Test
    public void operationTest() throws CalcException {
        Add add = new Add();
        Context context = new Context();
        context.push(2.0);
        context.push(3.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        add.calculate(context, list);
        Assert.assertEquals(context.pop(), 5.0, 0);
    }
}