package com.davegreen;

/**
 * Created by daveg on 03/07/2017.
 */
public class Character
{
    private int health;
    private int thirst;
    private int hunger;
    private int intellect;
    private int strength;
    private int magic;
    private int weaponAttack;
    private String weapon;

    public Character()
    {

    }

    public Character(int intellect, int strength, int magic, int weaponAttack, String weapon)
    {
        this.health = 100;
        this.thirst = 100;
        this.hunger = 100;
        this.intellect = intellect;
        this.strength = strength;
        this.magic = magic;
        this.weaponAttack = weaponAttack;
        this.weapon = weapon;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getIntellect()
    {
        return intellect;
    }

    public void setIntellect(int intellect)
    {
        this.intellect = intellect;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public int getMagic()
    {
        return magic;
    }

    public void setMagic(int magic)
    {
        this.magic = magic;
    }

    public int getThirst()
    {
        return thirst;
    }

    public void setThirst(int thirst)
    {
        this.thirst = thirst;
    }

    public int getHunger()
    {
        return hunger;
    }

    public void setHunger(int hunger)
    {
        this.hunger = hunger;
    }

    public String getWeapon()
    {
        return weapon;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }

    public int getWeaponAttack()
    {
        return weaponAttack;
    }

    public void setWeaponAttack(int weaponAttack)
    {
        this.weaponAttack = weaponAttack;
    }
}
