/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import arithmetic.ArithmeticBase.Operation;
import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n = in.nextDouble();
        System.out.print("Enter second number: ");
        double m = in.nextDouble();
        System.out.print("Enter arithmetic operation to perform (PLUS, MINUS, TIMES, DIVIDE): ");
        Operation op = Operation.valueOf(in.next().toUpperCase());
        ArithmeticBase r = new ArithmeticBase();
        double result = r.calculate(n, m, op);
        System.out.println("Result: " + result);
    
    }
}

