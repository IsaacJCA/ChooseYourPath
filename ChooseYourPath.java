import java.util.Scanner;

public class ChooseYourPath {
    public static void main(String []args) {
        // Creates a scanner object
        Scanner scanner = new Scanner(System.in);

        boolean hasArmor = false;
        boolean hasShoes = false;
        int input;
        double random;

        System.out.println("Do you want to take armor (1), running shoes (2), or nothing (3)?");
        input = scanner.nextInt();
        if(input == 1) 
        {
            hasArmor = true;
        } 
        else if(input == 2) 
        {
            hasShoes = true;
        } 
        else if(input == 3) // First Ending
        {
            System.out.println("You get lost and died from unkown reasons.");
            System.exit(0);
        }
        

        System.out.println("You encounter 3 rooms.  Which one do you pick?  Left Room (1), Middle Room (2), Right Room (3)");
        input = scanner.nextInt();
        if(input == 1) // 2nd Ending
        {
            System.out.println("You enter a room with a treasure chest containing 1 billion dollars");
            System.out.println("You leave the dungeon rich and live a life of luxury.");
        } 
        else if (input == 2) // Fight enemies
        {
            System.out.println("You encounter 3 monsters.  What do you do? Run Away (1) or Fight (2)");
            input = scanner.nextInt();

            if(input == 1) // 3rd Ending
            {
                System.out.println("You escape the dungeon, running away like a coward.");

            } 
            else if (input == 2) 
            {
                System.out.println("You fight the monsters with all your strength!");
                
                
                if (hasArmor) 
                {
                    random = Math.random();
                    if (random > 0.49) 
                    {
                        System.out.println("You succesfully kill the monster, your armor protects you from its attacks!");
                        bossFight(hasArmor, hasShoes);
                    } 
                    else // 4th Ending
                    {
                        System.out.println("With all your effort, you still fail... You die with honor");
                        System.exit(0);
                    }
                } 
                else 
                {
                    random = Math.random();
                    if (random > 0.29) 
                    {
                        System.out.println("You succesfully kill the monster!");
                        bossFight(hasArmor, hasShoes);
                    } 
                    else // 5th ending
                    {
                        System.out.println("With all your effort, you still fail... You die with honor... only if you had some armor");
                        System.exit(0);
                    }    
                }
            }
        } 
        else if (input == 3) // Encounter a trap
        {
            
        }




    }


    public static void bossFight(boolean armor, boolean shoes)
    {
        
    }

}