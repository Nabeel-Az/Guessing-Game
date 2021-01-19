/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabeel
 */
public class Referee {
    
    int gNum;
    int p1Num;
    int p2Num;
    int p3Num;
    
    void askGuesser()
    {
        Guesser g1 = new Guesser();
        gNum = g1.guessNum();
        
    }
    
    void askPlayer()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        
        p1Num = p1.guessNum();
        p2Num = p2.guessNum();
        p3Num = p3.guessNum();
    }
    
    void compare()
    {
        if(gNum == p2Num && gNum == p3Num && gNum == p1Num)
        {
            System.out.println("All players guess the correct number");
        }
        else if(gNum == p1Num && gNum == p2Num)
        {
            System.out.println("Player 1 and Player 2 guess the correct number");
        }
        else if(gNum == p1Num && gNum == p3Num)
        {
            System.out.println("Player 1 and Player 3 guess the correct number");
        }
        else if(gNum == p2Num && gNum == p3Num)
        {
            System.out.println("Player 2 and Player 3 guess the correct number");
        }
        else if(p1Num == gNum)
        {
            System.out.println("Player 1 guess the correct number");
        }
        else if(p2Num == gNum)
        {
            System.out.println("Player 2 guess the correct number");
        }
        else if(p3Num == gNum)
        {
            System.out.println("Player 3 guess the correct number");
        }
        else
        {
            System.out.println("All 3 players guess the wrong number");
        }
    }
    
}
