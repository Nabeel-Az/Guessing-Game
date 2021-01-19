
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
public class Guesser {
    
    int gNum;
    Scanner sc = new Scanner(System.in);
    
    public int guessNum()
    {
        System.out.print("Guesser enter guess: ");
        gNum = sc.nextInt();
        System.out.println("Guesser guess: " + gNum);
        System.out.println("");
        
        return gNum;
    }
    
}
