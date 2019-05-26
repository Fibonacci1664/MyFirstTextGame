package com.davegreen;

import java.util.Scanner;

/**
 * Created by daveg on 03/07/2017.
 */
public class Barbarian extends Character
{
    Scanner scanner = new Scanner(System.in);
    private boolean beserker;

    public Barbarian(boolean beserker)
    {
        super(40, 80, 20, 100,"AXE");
        this.beserker = beserker;
    }

    public boolean  playAsBarb()
    {
        System.out.println("You have chosen to play as the Barbarian and your stats are as follows: ");
        System.out.println("\t Health: 100");
        System.out.println("\t Thirst: 100");
        System.out.println("\t Hunger: 100");
        System.out.println("\t Intellect: 40");
        System.out.println("\t Strength: 80");
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
            System.out.println("You are now the Barbarian, good luck adventurer!");
            return true;
        }
        else if(confirm.equals("n"))
        {
            System.out.println("You have decided to play as another adventurer!");
            return false;
        }

        return false;
    }

    public boolean isBeserker()
    {
        return beserker;
    }

    public void setBeserker(boolean beserker)
    {
        this.beserker = beserker;
    }
}
