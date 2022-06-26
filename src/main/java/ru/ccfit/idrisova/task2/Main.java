package ru.ccfit.idrisova.task2;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String args[]) {
        logger.info("Main begin");
        InputStream fstream = System.in;
        BufferedReader reader;
        try {
            if (args.length > 0)
                fstream = new FileInputStream(args[0]);
            InputStreamReader fin = new InputStreamReader(fstream);
            reader = new BufferedReader(fin);
            logger.info("Created map commands");
        } catch (Exception exp) {
            logger.info(exp.getMessage());
            return;
        }
        Calculator calculator = new Calculator();
        try{
            calculator.calculate(reader);
        }catch (Exception exp){
            logger.info(exp.getMessage());
        }
        logger.info("Main end");
    }
}
