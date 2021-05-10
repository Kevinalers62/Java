/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.boiling;
// Imports
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class BoilingAndFreezing 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Print
        System.out.println("Give A temperature:");
        
        // Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Variable Declaration and accepts user input into those variables
        int temp = sc.nextInt();
        
        if(temp >= 100)
        {
            System.out.println("The Water Is Boiling");
        }
        else
        {
            if(temp <= 0)
            {
                System.out.println("The Water Is Freezing");
            }
            else
            {
                System.out.println("The Water Is in normal State");
            }
        }
        
    }
    
}
