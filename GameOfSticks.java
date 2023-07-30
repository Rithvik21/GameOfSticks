//Name: Rithvik Padigala
//Peroid: 4A

import java.util.*;
public class GameOfSticks
{
    Scanner console = new Scanner(System.in);
    Random rand = new Random();
    int playerSticks;
    int computerSticks;

    public GameOfSticks()
    {
        int playerSticks = 0;
        int computerSticks = 0;
    }
    
    public void play(){
       System.out.println("Directions: There are 20 sticks on the board. You will be playing against the computer. You will be taking your turn first. You will enter a number bewteen 1 and 3 to remove sticks. Then the computer will randomly generate a number bewtten 1 and 3 to remove its sticks off the board. This repeats until all sticks are removed. The last one to remove the last stick off the board loses the game. Let's get started!");
       int sticks = 20;
       int totalPlayerSticks = 0;
       boolean playerWon = false;
       int totalComputerSticks = 0;
       while(sticks > 0){
           System.out.println("There are " + sticks + " sticks left on the board.");
           boolean validValue = false;
           while(!validValue){
               System.out.println("How many sticks do you want to pick up? (Enter 1, 2, or 3) >>> ");
               playerSticks = console.nextInt();
               if(playerSticks <= 3 && playerSticks <= sticks){
                  validValue = true;
               }
               else{
                  System.out.println("Make sure your value is 1, 2, or 3 and is less than the total amount of sticks. Try again!");
               }
           }
           sticks -= playerSticks; 
           totalPlayerSticks += playerSticks;
           System.out.println("There are " + sticks + " sticks left on the board.");
           if(sticks > 3){
               computerSticks = rand.nextInt(3) + 1;
           }
           else if(sticks > 2){
               computerSticks = 2; 
           }
           else if(sticks > 1){
               computerSticks = 1; 
           }
           else if(sticks == 1){
               computerSticks = 1;
               playerWon = true;
           }
           else{
              computerSticks = 0; 
           }
           sticks -= computerSticks;
           totalComputerSticks += computerSticks;
           if(computerSticks > 0){
               System.out.println("The computer picked up " + computerSticks + " sticks off the board.");
           }
       }
       System.out.println();
       System.out.println();
       if(playerWon){
          System.out.println("The player won the game!"); 
       }
       else{
          System.out.println("The computer won the game!");  
       }
       System.out.println();
       System.out.println("You picked up " + totalPlayerSticks + " sticks from the board.");
       System.out.println("The computer picked up " + totalComputerSticks + " sticks from the board.");
    }
}