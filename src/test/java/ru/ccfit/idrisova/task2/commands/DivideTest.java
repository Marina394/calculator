package ru.ccfit.idrisova.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.idrisova.task2.CalcException;
import ru.ccfit.idrisova.task2.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DivideTest {
    @Test
    public void operationTest() throws CalcException {
        Divide divide = new Divide();
        Context context = new Context();
        context.push(3.0);
        context.push(6.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        divide.calculate(context, list);
        Assert.assertEquals(context.pop(), 2.0, 0);
    }

    @Test
    public void testDivisionByZero(){
        Divide divide = new Divide();
        Context context = new Context();
        context.push(0.0);
        context.push(5.0);
        String[] commandLine = new String[2];
        List <String> list = Arrays.asList(commandLine);
        Assert.assertThrows(ArithmeticException.class, () -> divide.calculate(context, list));
    }
}
