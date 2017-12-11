import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.*;
import java.awt.*;
import javax.swing.JApplet;
import java.awt.Dimension;
import java.util.ArrayList;
/**
 * Game of Chi .. see main for gameplay
 * 
 * sound??
 * background??
 */
public class GameOfChi extends JPanel{

  private static int numStonesLeft = 1;

  public static void main(String[] args) 
  {
       System.out.println("                             +@@@@@@@@@@@@@@@@+");
       System.out.println("                          #@@@@@@@@@@     @@@@@@@@@#");
       System.out.println("                        @@@@@@@@@@@@;      @@@@@@@@@@@@");
       System.out.println("                      @@@@@@@@@@@@@@       @@@@@@@@@@@@@@");
       System.out.println("                    @@@@@@@@@@@@@@@@       @@@@@@@@@@@@@@@@");
       System.out.println("                  @@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@");
       System.out.println("                @@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("               @@@@@@@@@@@@@@@@@@             @@@@@@@@@@@@@@@@@");
       System.out.println("             @@@@@@@@@@@@@@@@@@'               '@@@@@@@@@@@@@@@@@@@");
       System.out.println("           @@@@@@@@@@@@@@@@@@@@    @@@@@@@@@    @@@@@@@@@@@@@@@@@@@@");
       System.out.println("          @@@@@@@@@@@@@@@@@@@@@    @@@@@@@@@    @@@@@@@@@@@@@@@@@@@@@");
       System.out.println("        @@@@@@@@@@@@@@@@@@@@@@@    @@@@@@@@@    @@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("       @@@@@@@@@@@@ @@@@@@@@@@@    @@@@@@@@@    @@@@@@@@@@ @@@@@@@@@@@@@");
       System.out.println("      @@@@@@@@@@@@  @@@@@@@@@      @@@@@@@@@      @@@@@@@@  @@@@@@@@@@@@@");
       System.out.println("     @@@@@@@@@@@@@@@ @@@@@@@     @@@@@@@@@@@@@     @@@@@ @@@@@@@@@@@@@@@@@");
       System.out.println("    @@@@@@@@@@@@@@@@@ @@ @@@                       @@@@ @@ @@@@@@@@@@@@@@@@");
       System.out.println("     @@@@@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("     @@@@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("      @@@@@@@@@@@@@@@@@@@@@@       @@@@@@@@@@      @@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("       @@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("        @@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("          @@@@@@@@@@@        @@@@   @@@@@@   @@@@@       @@@@@@@@@@@@");
       System.out.println("           @@@@@@@@@@  @@@@@@@@@@   @@@@@@   @@@@@@@@  @@@@@@@@@@@@@");
       System.out.println("             @@@@@@@@  @@@@@@@@@@   @@@@@@   @@@@@@@@  @@@@@@@@@@@");
       System.out.println("              @@@@@@@  @@@@@@@@@@            @@@@@@@@  @@@@@@@@@@");
       System.out.println("                @@@@@  @@@@@@@@@@   @@@@@@   @@@@@@@@  @@@@@@@@");
       System.out.println("                 @@@@        @@@@   @@@@@@   @@@@@       @@@@@");
       System.out.println("                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("                     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("                         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println("                           @@@@@@@@@@@@@@@@@@@@@@@@@");
       System.out.println();
       
       boolean restart= true;
       while(restart)
       { 
           while(numStonesLeft%4==1)
           {
                numStonesLeft = (int) (Math.random() * 16) + 15;// btw 15 & 30 stones
           }
           System.out.println("Game rule:");
           System.out.println("There is a pile of " + numStonesLeft + " of stones");
           System.out.println("Each player could draw one, two, or three stones each turn");
           System.out.println("Players could not give up their turn (players must draw stone)");
           System.out.println("The person draws the last stone loses");
           System.out.println("Please don't enter things other than numbers,because it crush the game");
           System.out.println("P.S: Challenge: you can never win this game, try it");


           computerTurn(); // invoke the computerTurn() method
           int computerTurns=1;
           playerTurn(); // invoke the playerTurn() method
           int playerTurns=1;
           while(numStonesLeft>0)
           {
               if(playerTurns==computerTurns)
               {
                   computerTurn();
                   computerTurns++;
                   if(numStonesLeft==0)
                   {
                       break;
                   }
                   playerTurn();
                   playerTurns++;
                }
                else
                {
                    playerTurn();
                    playerTurns++;
                    if(numStonesLeft==0)
                    {
                        break;
                    }
                    computerTurn();
                    computerTurns++;
                }
            }
    
            {
                System.out.println("Game Over");
                if(computerTurns==playerTurns)
                {
                    System.out.println("You lose!");
                    System.out.println("                                 _____________ ");
                    System.out.println("                          , .-‘”...............``~.,");
                    System.out.println("                        ,.-”.....................“-.,");
                    System.out.println("                       ,/...........................”:,");
                    System.out.println("                      ,?..............................\\,");
                    System.out.println("                      /................................,}");
                    System.out.println("                     /...........................:`^`....}");
                    System.out.println("                    /........................,:”........./");
                    System.out.println("                    ?....___................:`........./");
                    System.out.println("                   /__.(.....“~-,_........,:`......../");
                    System.out.println("                  /(_....”~,_.....“~,_...,:`......._/");
                    System.out.println("                 {.._$;_.....”=,_....“-,_.,....(.,},.~”/}");
                    System.out.println("                  ((.....*~_......”=-._..“;,,./`../”.../");
                    System.out.println("                   \\`~,......“~.,..............}...../");
                    System.out.println("                    (....`=-,,.................(;_,,-\\");
                    System.out.println("                    /.`~,......`..............\\....../\\");
                    System.out.println("                    \\`~.*-,...................|,./.....\\,__");
                    System.out.println("                       }.>-._\\....................|........`=~-,");
                    System.out.println("                      \\_.....`\\,................\\");
                    System.out.println("                         `=~-,,.\\,................\\");
                    System.out.println("                          `       :,,..............`\\");
                    System.out.println("                                   `=-,..........,%`>\\");
                    System.out.println("                                     \\.._,-%........`\\");
                }
                else 
                {
                    System.out.println("You won! Congratulations!");
            
                }
                System.out.println("Would you like to play again? - yes/no");
                Scanner scanner= new Scanner(System.in);
                String input=scanner.nextLine();
                if (input.equals("no"))
                {
                    restart=false;
                }
                else if(input.equals("yes"))
                {
                    numStonesLeft=1;
                    while(numStonesLeft%4==1)
                    {
                        numStonesLeft = (int) (Math.random() * 16) + 15;
                    }
                }
                else
                {
                    while(!input.equals("yes") && !input.equals("no"))
                    {
                        System.out.println("please enter only \"yes\" or \"no\"");
                        input=scanner.nextLine();
                    }
                    if (input.equals("no"))
                    {
                        restart=false;
                    }
                    else if(input.equals("yes"))
                    {
                        numStonesLeft=1;
                        while(numStonesLeft%4==1)
                        {
                            numStonesLeft = (int) (Math.random() * 16) + 15;
                        }
                    }
                }
            }
        }
  }

  /**
   * The computerTurn method chooses a random number from 1 to 3 if
   * numStonesLeft is greater than or equal to 3, otherwise chooses a random
   * number from 1 to numStonesLeft.
   * 
   * Then decrements numStonesLeft appropriately and prints the turn.
   */
  public static void computerTurn() {
    int stonesChosen;
    if(numStonesLeft%4==0)
    {
        stonesChosen=3;
    }
    
    else if(numStonesLeft%4==2)
    {
        stonesChosen=1;
    }
    else if(numStonesLeft%4==3)
    {
        stonesChosen=2;//isn't it just 1 less than the %4 value?
    }
    else//(numStonesLeft%4==1)
    {
        //rig the game so numStonesLeft never has this value
        stonesChosen = 1 + (int) (Math.random() * Math.min(3, numStonesLeft));
    }
    
    
    numStonesLeft-=stonesChosen;
    System.out.println("\nI took " + stonesChosen + " stones.");
    System.out.println("There are " + numStonesLeft + " stones left.");
    
  }

  /**
   * The playerTurn method prompts the user for a valid number of stones to
   * choose and reads an int value from the user and will repeat this action
   * while the user input is invalid. (i.e. user must choose 1, 2 or 3 AND their
   * choice must be less than or equal to numStonesLeft.)
   * 
   * Also decrements numStonesLeft appropriately and prints the turn.
   */
  public static void playerTurn() {
    
    // YOUR CODE GOES HERE!
    Scanner scanner = new Scanner(System. in);
    System.out.println("Please enter how many stones you would like to take.");
    //int input;
    int input = scanner. nextInt();
    /*try{input=scanner.nextInt();}
        catch(java.util.InputMismatchException e)
        {
            System.out.println("You must use a number");
        }*/
   
    int stonesChosen=0;
    while(input==0)
    {
        System.out.println("Invalid move. You need to at least 1 stone. Please try again.");
        input=scanner.nextInt();
        
     }
   
    while(input!=0)
    {
        
        if(input>3)
        {
            System.out.println("Invalid move. You cannot take more than 3 stones at a time. Please try again: ");
            input=scanner.nextInt();
        }
        else if(input>numStonesLeft)
        {
            System.out.println("Invalid move. You cannot take more stones than the total. There are " + numStonesLeft + " stones left.");
            input= scanner.nextInt();
        }
        if(input<=0)
        {
            System.out.println("Invalid move. You need to at least 1 stone. Please try again.");
            input=scanner.nextInt();
        }
        else
        {
            stonesChosen=input;
            break;
        }
        
    }
    while(input<=0 || input>3 || input>numStonesLeft)
    {
        System.out.println("Please enter valid number of stones");
        input=scanner.nextInt();
        stonesChosen=input;
    }
    
 
    
    numStonesLeft-=stonesChosen;
    System.out.println("\nYou took " + input + " stones.");
    System.out.println("There are " + numStonesLeft + " stones left.");
  }


}
