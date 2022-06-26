package ru.ccfit.idrisova.task2;

import java.util.HashMap;
import java.util.Stack;
import java.util.Map;

public class Context {
    private Stack<Double> stack = new Stack<>();
    private Map<String, Double> listDefinitions = new HashMap<>();
    private int sizeStack = 0;

    public void push(double value){
        stack.push(value);
        sizeStack++;
    }

    public double pop(){
        sizeStack--;
        return stack.pop();
    }

    public int getSizeStack(){
        return sizeStack;
    }

    public double getValue(String definition){
        return listDefinitions.get(definition);
    }

    public void setValue(String definition, double num){
        listDefinitions.put(definition, num);
    }

    public boolean isInListDefinition(String definition){
        return listDefinitions.get(definition) != null;
    }

    public Stack getStack(){
        return stack;
    }
}
