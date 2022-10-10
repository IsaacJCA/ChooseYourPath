/*
1.3 Choose Your Path Project

Authors: Isaac Johnson, Brian Hoang
Date: 10th October 2022
Course: APCSA

Description: Simulates an adventure inside of a dungeon where your fate is decided based on your choices and chance
Pre-conditions: Your choices when prompt a decision
Post-conditions: The outcome of your choices in which it can lead to a good ending or a bad ending
*/


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Creates scanner object
    Scanner scanner = new Scanner(System.in);
    
    // Initial variables
    boolean hasShoes = false;
    boolean hasIronArmor = false;
    int input;
      

    System.out.println("What Equipment do you choose:  Iron Armor(1), Running Shoes(2), None(3)");
    input = scanner.nextInt();
    // Updates based on what you choose as your equipment
    if (input == 1)
    {
      hasIronArmor = true;
    }
    else if (input == 2)
    {
      hasShoes = true;
    }
    else // 1st ending leads to your death
    {
      System.out.println("You get lost in the dungeon and die from unknown causes");
      System.exit(0);
    }


    
    System.out.println("You encounter 3 rooms.  Which do you enter: Left(1), Center(2), Right(3)");
    input = scanner.nextInt();
    // Decides your path/fate depending on what room you chose.
    
    if(input == 1) // 1 means you enter the left room
    {
      double random = Math.random(); // Random chance to succeed in the treasure room
      if (random < 0.19) // 2nd Ending where you are trapped in the treasure room
      {
        System.out.println("You encounter a Treasure room, but you are locked in there for enternity and die from starvation");
        System.exit(0);
      }
      else // 3rd ending where you leave with a good ending of becoming rich
      {
        System.out.println("You encounter a Treasure room and leave a billionaire.");
        System.exit(0);
      }
    }
    else if (input == 2) // 2 means you enter the center room
    {
      System.out.println("You encounter 3 monsters");
      System.out.println("Do you wish to fight (1), dodge past the monsters (2), or run from the monsters (3)?");
      
      input = scanner.nextInt();
      double random = Math.random(); // Randomizes your chances of survival


        if (input == 3) // 4th ending where you leave the dungeon with a neutral ending
        {
            System.out.println("You run out like a coward!");
            System.exit(0);
        }
       else if (input == 2) // dodge
       {
        if (hasShoes && random < 0.79) // depending on what you chose at the start, your chances of surviving are either lower or higher
        {
            System.out.println("You Dodge past the monsters and move on to the next room.");
            bossFight(hasIronArmor);
        }
        else if(hasIronArmor && random < 0.29)
        {
            System.out.println("You barge through the monsters and run to the next room!");
            bossFight(hasIronArmor);
        }
        else // 5th ending where you die to the monsters attempting to dodge
        {
            System.out.println("Even through your valiant efforts, you were unable to dodge the enemies' attacks ");
            System.exit(0);
        }
       }
       else // fight
       {
        if (hasIronArmor && random < 0.79)  // depending on what you chose at the start, your chances of surviving are either lower or higher
        {
            System.out.println("You slay the 3 monsters. Luckily your Iron armor stopped their attacks");
            bossFight(hasIronArmor);
        }
        else if(hasShoes && random < 0.29)
        {
            System.out.println("You hid from the monsters and luckily survive");
            bossFight(hasIronArmor);
        }
        else // 6th ending where you die to the monsters attempting to fight
        {
            System.out.println("Even though you successfully kill 2, the 3rd enemy stabs you in the chest");
            System.exit(0);
        } 
       }
    }
    else if (input == 3) // 3 means you enter the right room
    {
      System.out.println("You have encountered an arrow trap room. What do you do: Run through the arrows(1) or Find a secret escape route(2)");
      input = scanner.nextInt();

      if(input == 1 && hasIronArmor) // Depending on what you chose in the start, there is a correct answer you need to choose
      {
        System.out.println("You have successfully escaped the trap. Luckily, your armor protected you.");
        bossFight(hasIronArmor);
      }
      else if(input == 2 && hasShoes)
      {
        System.out.println("You have successfully escaped the trap after finding a secret passageway.");
        bossFight(hasIronArmor);
      }
      else // Nested if statements do decide how you die
      {
        if(hasIronArmor) // 7th ending where you die attempting to find an escape route
        {
          System.out.println("You have breathed your last breath attempting to find an escape route");
          System.exit(0);
        }
        else // 8th ending where you die attempting to run through the trap
        {
          System.out.println("You died after getting shot multiple times with arrows");
          System.exit(0);
        }
      }
      
      
    }
    
    
  }

  // This method simulates the final boss fight. It takes a formal boolean parameter, called armor, to decide the outcome.
  public static void bossFight(boolean armor)
  {
    // Creates scanner object for this method
    Scanner sc = new Scanner(System.in);

    
    System.out.println("You find yourself in the boss room. How do you plan on defeating the boss: Blunt Attacks(1) or Outsmarting your enemy(2)");
    
    // Initial variables
    int choice = sc.nextInt();
    double random = Math.random(); // Randomizes chances

      
    if (choice == 1 && armor && random < 0.79) // These next 4 conditionals test if you defeat the boss (9th ending)
    {
      System.out.println("You defeat the boss and become the hero");
      System.exit(0);
    }
    else if(choice == 1 && !armor && random < 0.29)
    {
      System.out.println("You defeat the boss and become the hero");
      System.exit(0);
    }
    else if(choice == 2 && armor && random < 0.29)
    {
      System.out.println("You defeat the boss and become the hero");
      System.exit(0);

    }
    else if(choice == 2 && !armor && random < 0.79)
    {
      System.out.println("You defeat the boss and become the hero");
      System.exit(0);
    }
    else // This nested if statement decides how you die from the boss
    {
        if(armor) // 10th ending
        {
            System.out.println("Even with your trusty iron armor, it doesn't protect you from the crushing blow of the boss!");
            System.exit(0);
        }
        else // 11th ending
        {
            System.out.println("Even with your speed, you can outrun the boss, but not the massive boulder hurling towards you!");
            System.exit(0);      
        }
    }
    
  }
}

