/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.temperature;
// Imports
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Temperature 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Give a reading in Celsius : ");
        
        // Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Accepts user input
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        
        System.out.println("Fahrenheit : " + fahrenheit);
        
    }
    
}
