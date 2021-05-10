/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightinggame;

// imports
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class FightingGame 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Random Number Generator
        Random generator = new Random();
        
        // Enemy Variables and Io
        System.out.println("Attack Point Enemy");
        int EnemyAttack = sc.nextInt();
        System.out.println("Defense Point Enemy");
        int EnemyDefense = sc.nextInt();
        System.out.println("Damage of Enemy");
        int EnemyDamage = sc.nextInt();
        System.out.println("Life points of Enemy");
        int EnemyLife = sc.nextInt();
        
        // Player Variables and Io
        System.out.println("Attack Point Player");
        int PlayerAttack = sc.nextInt();
        System.out.println("Defense Point Player");
        int PlayerDefense = sc.nextInt();
        System.out.println("Damage of Player");
        int PlayerDamage = sc.nextInt();
        System.out.println("Life points of Player");
        int PlayerLife = sc.nextInt();
        
        // Coin toss to determine who goes first
        boolean attacker = generator.nextBoolean();
        if (attacker)
        {
            System.out.println("You Attack");
            int dice = generator.nextInt(6) + 1 + generator.nextInt(6)+ 1;
            int attackValue = PlayerAttack + dice;
             System.out.println("Rolled values "+dice);
              System.out.println("You Attack Value");
              if(attackValue > EnemyDefense)
              {
                  System.out.println("You Attack Succesfull");
                  EnemyLife = EnemyLife - PlayerDamage;
                  System.out.println("Enemy Health remain " + EnemyLife);
              }
              else
              {
                  System.out.println("Attack Failed");
              }      
        }
        else
        {
             System.out.println("Enemy Attacks");
            int dice = generator.nextInt(6) + 1 + generator.nextInt(6)+ 1;
            int attackValue = PlayerAttack + dice;
             System.out.println("Rolled values "+dice);
              System.out.println("enemy Attack Value");
              if(attackValue > PlayerDefense)
              {
                  System.out.println("Enemy Attack Succesfull");
                  PlayerLife = PlayerLife - EnemyDamage;
                  System.out.println("Your Health remain " + PlayerLife);
              }
              else
              {
                  System.out.println("Attack Failed");
              }      
        }
              
      
        
        
    }
    
}
