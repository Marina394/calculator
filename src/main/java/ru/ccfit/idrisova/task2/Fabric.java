package ru.ccfit.idrisova.task2;

import java.util.HashMap;
import java.util.Properties;
import java.util.Map;
import java.io.InputStream;

public class Fabric {
    private Properties config = new Properties();

    private static volatile Fabric instance;

    public Fabric() throws CalcException {
        try{
            config.load(this.getClass().getClassLoader().getResourceAsStream("commands.properties"));
        } catch (Exception e) {
            throw new CalcException("Load error");
        }
    }

    public Fabric getInstance () throws CalcException {
        if (instance == null) {
            synchronized (Fabric.class) {
                if (instance == null) {
                    instance = new Fabric();
                }
            }
        }
        return instance;
    }

    public Command getCommand (String commandName) throws CalcException{
        if(!config.containsKey(commandName)) {
            throw new CalcException("Operation '" + commandName + "' not supported");
        }
        try {
            var cls = Class.forName(config.getProperty(commandName));
            var constructor = cls.getDeclaredConstructor();
            return (Command) constructor.newInstance();
        } catch (Exception ex) {
            throw new CalcException("Unable to create operation '" + commandName + "'" + ex);
        }

    }
}