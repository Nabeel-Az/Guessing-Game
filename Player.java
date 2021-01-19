
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabeel
 */
public class Player {
    
    int pNum;
    
    Scanner sc = new Scanner(System.in);
    
    public int guessNum()
    {
        System.out.print("Player enter guess: ");
        pNum = sc.nextInt();
        System.out.println("Player guess: " + pNum);
        System.out.println("");
        
        return pNum;
        
    }
    
    
}
