import java.util.Scanner;


class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
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
    else // 1st ending
    {
      System.out.println("You get lost in the dungeon and die from unknown causes");
      System.exit(0);
    }


    
    System.out.println("You encounter 3 rooms.  Which do you enter: Left(1), Center(2), Right(3)");
    input = scanner.nextInt();
    // Decides your path/fate depending on what room you chose.
    if(input == 1)
    {
      double random = Math.random();
      if (random < 0.19) // 2nd Ending
      {
        System.out.println("You encounter a Treasure room, but you are locked in there for enternity and die from starvation");
        System.exit(0);
      }
      else // 3rd ending
      {
        System.out.println("You encounter a Treasure room and leave a billionaire.");
        System.exit(0);
      }
    }
    else if (input == 2)
    {
      System.out.println("You encounter 3 monsters");
      System.out.println("Do you wish to fight (1), dodge past the monsters (2), or run from the monsters (3)?");
      
      input = scanner.nextInt();
      double random = Math.random();


        if (input == 3)
        {
            System.out.println("You run out like a coward!");
            System.exit(0);
        }
       else if (input == 2) 
       {
        if (hasShoes && random < 0.79)
        {
            System.out.println("You Dodge past the monsters and move on to the next room.");
            bossFight(hasIronArmor);
        }
        else if(hasIronArmor && random < 0.29)
        {
            System.out.println("You barge through the monsters and run to the next room!");
            bossFight(hasIronArmor);
        }
        else // 4th ending
        {
            System.out.println("Even through your valiant efforts, you perish ");
            System.exit(0);
        }
       }
       else
       {
        if (hasIronArmor && random < 0.79)
        {
            System.out.println("You slay the 3 monsters. Luckily your Iron armor stopped their attacks");
            bossFight(hasIronArmor);
        }
        else if(hasShoes && random < 0.29)
        {
            System.out.println("You hid from the monsters and luckily survive");
            bossFight(hasIronArmor);
        }
        else
        {
            System.out.println("Even through your valiant efforts, you perish ");
            System.exit(0);
        } 
       }
    }
    else if (input == 3)
    {
      //Add Trap room
      System.out.println("You have encountered an arrow trap room. What do you do: Run through the arrows(1) or Find a secret escape route(2)");
      input = scanner.nextInt();
      if(input == 1 && hasIronArmor)
      {
        System.out.println("You have successfully escaped the trap. Luckily, your armor protected you.");
        bossFight(hasIronArmor);
      }
      else if(input == 2 && hasShoes)
      {
        System.out.println("You have successfully escaped the trap after finding a secret passageway.");
        bossFight(hasIronArmor);
      }
      else
      {
        if(hasIronArmor)
        {
          System.out.println("You have breathed your last breath attempting to find an escape route");
          System.exit(0);
        }
        else
        {
          System.out.println("You died after getting shot multiple times with arrows");
          System.exit(0);
        }
      }
      
      
    }
    
    
  }


  public static void bossFight(boolean armor)
  {
    Scanner sc = new Scanner(System.in);

    
    System.out.println("You find yourself in the boss room. How do you plan on defeating the boss: Blunt Attacks(1) or Outsmarting your enemy(2)");
    int choice = sc.nextInt();
    double random = Math.random();

      
    if (choice == 1 && armor && random < 0.79)
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
    else
    {
        if(armor)
        {
            System.out.println("Even with your trusty iron armor, it doesn't protect you from the crushing blow of the boss!");
            System.exit(0);
        }
        else
        {
            System.out.println("Even with your speed, you can outrun the boss, but not the massive boulder hurling towards you!");
            System.exit(0);      
        }
    }
    
  }
}

