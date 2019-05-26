package com.davegreen;

import java.util.Scanner;

/**
 * Created by daveg on 03/07/2017.
 */
public class Wizard extends Character
{
    Scanner scanner = new Scanner(System.in);
    private boolean transform;

    public Wizard(boolean transform)
    {
        super(60, 20, 60, 50,"MAGICAL LANCE");
        this.transform = transform;
    }

    public boolean playAsWizard()
    {
        System.out.println("You have chosen to play as the Wizard and your stats are as follows: ");
        System.out.println("\t Health: 100");
        System.out.println("\t Thirst: 100");
        System.out.println("\t Hunger: 100");
        System.out.println("\t Intellect: 60");
        System.out.println("\t Strength: 20");
        System.out.println("\t Magic: 60");
        System.out.println("> Please confirm your selection by pressing: y/n");

        String confirm = scanner.nextLine();

        while(!confirm.equals("y") && !confirm.equals("n"))
        {
            System.out.println("> You have entered an incorrect command, please confirm with y/n");
            confirm = scanner.nextLine();
        }

        if(confirm.equals("y"))
        {
            System.out.println("You are now the Wizard, good luck adventurer!");
            return true;
        }
        else if(confirm.equals("n"))
        {
            System.out.println("You have decided to play as another adventurer!");
            return false;
        }

        return false;
    }

    public boolean isTransform()
    {
        return transform;
    }

    public void setTransform(boolean transform)
    {
        this.transform = transform;
    }
}
