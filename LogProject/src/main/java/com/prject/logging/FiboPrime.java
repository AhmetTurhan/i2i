package com.prject.logging;

import org.apache.log4j.*;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.log4j.spi.LoggerRepository;

public class FiboPrime {

    static boolean isInFibonacci(int number, int [] fibonacci_series){
        logger.info("Is it in fibonacci?");
        for(int i = 0 ; i<fibonacci_series.length;i++){
            if(fibonacci_series[i]== number)
                return true;
        }
        return false;
    }

    static boolean isPrime(int number){
        logger.info("Is it prime?");
        int num = 0;

        for (int i = 1;i<=number;i++){
            if (number % i == 0 ){
                num++;
            }
        }


        if (num != 2)
            return false;
        else
            return true;
    }






    static final Logger logger = Logger.getLogger(FiboPrime.class);

    public static void main(String[] args) {
        /*ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setThreshold(Level.);
        consoleAppender.setLayout(new PatternLayout("%d{ISO8601} [%t] %-5l - %m%n  (%F:%L)" +
                "%n"));
        <!--%d{ISO8601}: log'un tutulduğu zamanı gösterecek
                    [%t] : kaydettiğimiz methodun adını verir
                %-5level : tutulan log hangi levelde onu gösterir
                %logger : tutulan log hangi clasta tutuldu onu gösterir
                    %msg%n : tutulan logdaki mesaj
                    (%F:%L) : tutulan logun hangi clasta kaçıncı satırda olduğunu gösteriyorö
            -->
        consoleAppender.activateOptions();
        Logger.getRootLogger().addAppender(consoleAppender);
        */

        try {
            logger.info("Function has started.");
            int fibonacci_series [] = new int [100];
            fibonacci_series[0] = 0;
            fibonacci_series[1]=1;

            for(int i = 2;i<100;i++)
                fibonacci_series[i] = fibonacci_series[i-1] + fibonacci_series[i-2];

            for (int i = 1; i<=15;i++){
                logger.info("Checking for "+ i +" .");
                if ( isPrime(i)   && isInFibonacci(i,fibonacci_series)){
                    System.out.println(i);
                }
            }
            logger.info("Function has ended\n");

        }
        catch (Exception e){
           logger.warn(e.getMessage(),e);

        }

    }

}
