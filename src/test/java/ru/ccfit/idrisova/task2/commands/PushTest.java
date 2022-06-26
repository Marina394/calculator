package ru.ccfit.idrisova.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Context;

import java.util.Arrays;
import java.util.List;

public class PushTest {
    @Test
    public void operationTest() throws CalcException {
        String[] commandLine = new String[3];
        commandLine[1] = "4";

        Push push = new Push();
        Context context = new Context();
        context.push(2.0);
        context.push(3.0);
        List<String> list = Arrays.asList(commandLine);
        push.calculate(context, list);
        Assert.assertEquals(context.pop(), 4.0, 0);
    }
}