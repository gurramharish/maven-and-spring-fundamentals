package com.hans.msf;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Function<String, Double> f = s -> Double.valueOf(s);
        System.out.println(f.apply("3.5").getClass().getName());
        
        Calculate calculate = new Calculate();
        calculate.addAndPrint(20, 300);
        calculate.subtractAndPrint(3988, 2876);
    }
}
