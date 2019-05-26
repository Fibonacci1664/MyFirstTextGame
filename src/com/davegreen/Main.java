package com.davegreen;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	    runGame();
    }

    public static void runGame()
    {
        Act1 act1 = new Act1();
        Barbarian barb = new Barbarian(true);
        Thief thief = new Thief(true);
        Wizard wizard = new Wizard(true);

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while(!quit)
        {
            System.out.println("************************************************************");
            System.out.println("*****              THE NECROMANCERS GIFTS              *****");
            System.out.println("************************************************************");
            System.out.println("\n");
            System.out.println("> Welcome brave traveller please choose your character: ");
            printCharacterChoice();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice)
            {
                case 1:
                    if(barb.playAsBarb() == true)
                    {

                        act1.startBarbAdventure();
                        break;
                    }
                    else
                    {
                        runGame();
                        break;
                    }
                case 2:
                    if(thief.playAsThief() == true)
                    {
                        act1.startThiefAdventure();
                        break;
                    }
                    else
                    {
                        runGame();
                        break;
                    }
                case 3:
                    if(wizard.playAsWizard() == true)
                    {
                        act1.startWizardAdventure();
                        break;
                    }
                    else
                    {
                        runGame();
                        break;
                    }
                default:
                    System.out.println("You have not chosen wisely!");
                    runGame();
            }

            quit = true;
        }
    }

    public static void printCharacterChoice()
    {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To play as the Barbarian");
        System.out.println("\t 2 - To play as the Thief");
        System.out.println("\t 3 - To play as the Wizard");
    }

}
