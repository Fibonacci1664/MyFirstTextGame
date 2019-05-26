package com.davegreen;

import java.util.Scanner;

/**
 * Created by daveg on 03/07/2017.
 */
public class Thief extends Character
{
    Scanner scanner = new Scanner(System.in);
    private boolean vanish;

    public Thief(boolean vanish)
    {
        super(80, 40, 20, 70,"DAGGER");
        this.vanish = vanish;
    }

    public boolean playAsThief()
    {
        System.out.println("You have chosen to play as the Thief and your stats are as follows: ");
        System.out.println("\t Health: 100");
        System.out.println("\t Thirst: 100");
        System.out.println("\t Hunger: 100");
        System.out.println("\t Intellect: 80");
        System.out.println("\t Strength: 40");
        System.out.println("\t Magic: 20");
        System.out.println("> Please confirm your selection by pressing: y/n");

        String confirm = scanner.nextLine();

        while(!confirm.equals("y") && !confirm.equals("n"))
        {
            System.out.println("> You have entered an incorrect command, please confirm with y/n");
            confirm = scanner.nextLine();
        }

        if(confirm.equals("y"))
        {
            System.out.println("You are now the Thief, good luck adventurer!");
            return true;
        }
        else if(confirm.equals("n"))
        {
            System.out.println("You have decided to play as another adventurer!");
            return false;
        }

        return false;
    }

    public boolean isVanish()
    {
        return vanish;
    }

    public void setVanish(boolean vanish)
    {
        this.vanish = vanish;
    }
}
