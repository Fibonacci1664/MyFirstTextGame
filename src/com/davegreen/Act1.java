package com.davegreen;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by daveg on 03/07/2017.
 */
public class Act1
{
    Barbarian barb = new Barbarian(true);
    Character character = new Character();
    Scanner scanner = new Scanner(System.in);
    Act2 act2 = new Act2();
    Act3 act3 = new Act3();
    Act4 act4 = new Act4();
    Act5 act5 = new Act5();


    public void startBarbAdventure()
    {
        character.setHealth(100);
        character.setThirst(100);
        character.setHunger(100);
        character.setIntellect(40);
        character.setStrength(80);
        character.setMagic(20);
        System.out.println("--------------------------------------------------");
        System.out.println("\t Be aware that even during normal play and circumstance your 'Thirst' and 'Hunger'" +
                "\n\t will drop by 10 after each event/act, and may even drop more than 10 if involved in combat or" +
                "\n\t some other interaction, if either Thirst, Hunger or Health reach zero, it is GAME OVER!");
        System.out.println("--------------------------------------------------");
        System.out.println("You have started your adventure!");
        System.out.println("\n");
        act1_TheNarrowPath();
    }

    public void startThiefAdventure()
    {
        character.setHealth(100);
        character.setThirst(100);
        character.setHunger(100);
        character.setIntellect(80);
        character.setStrength(40);
        character.setMagic(20);
        System.out.println("--------------------------------------------------");
        System.out.println("\t Be aware that even during normal play and circumstance your 'Thirst' and 'Hunger'" +
                "\n\t will drop by 10 after each event/act, and may even drop more than 10 if involved in combat or" +
                "\n\t some other interaction, if either Thirst, Hunger or Health reach zero, it is GAME OVER!");
        System.out.println("--------------------------------------------------");
        System.out.println("You have started your adventure!");
        System.out.println("\n");
        act1_TheNarrowPath();
    }

    public void startWizardAdventure()
    {
        character.setHealth(100);
        character.setThirst(100);
        character.setHunger(100);
        character.setIntellect(60);
        character.setStrength(20);
        character.setMagic(60);
        System.out.println("--------------------------------------------------");
        System.out.println("\t Be aware that even during normal play and circumstance your 'Thirst' and 'Hunger'" +
                "\n\t will drop by 10 after each event/act, and may even drop more than 10 if involved in combat or" +
                "\n\t some other interaction, if either Thirst, Hunger or Health reach zero, it is GAME OVER!");
        System.out.println("--------------------------------------------------");
        System.out.println("You have started your adventure!");
        System.out.println("\n");
        act1_TheNarrowPath();
    }

    public void act1_TheNarrowPath()
    {
        boolean run = true;

        while(run)
        {

            System.out.println("********************  ACT I THE NARROW PATH  ********************");
            System.out.println("\n");
            System.out.println("\t You leave without saying goodbye to anyone almost as if in a hurry," +
                    "\n\t you look back at the camp seeing the embers flying through the air " +
                    "\n\t from the warm fires and wonder if you've made the right decision " +
                    "\n\t as you head north into the cold you see nothing but darkness, just then " +
                    "\n\t you get a strange feeling your being followed and then a noise from behind!!");
            System.out.println("\n> To turn and face your fear press 't' otherwise press 'r' to run!");

            String choice = scanner.nextLine();

            while(!choice.equals("t") && !choice.equals("r"))
            {
                System.out.println("\n> You have entered an incorrect command, please enter 't' or 'r'.");
                choice = scanner.nextLine();
            }

            if(choice.equalsIgnoreCase("t"))
            {
                System.out.println("\t You turned only to find it was one of the young lads from the camp" +
                        "\n\t you tell him where your going is no place for children and send him packing, " +
                        "\n\t you carry on down the narrow path that leads into forrest and in the distance you " +
                        "\n\t spot a faint glow of fire, as the night is freezing you see this as an opportunity not to" +
                        "\n\t be missed and so head towards the glow.");
                act1_AnInvitingCave();
            }
            else if(choice.equalsIgnoreCase("r"))
            {
                System.out.println("\t You ran for your life not seeing the steep drop in front of you and fall down a " + "\n\t small craggy outcrop landing badly.");
                System.out.println("\n> Press 'd' to roll the dice and decide your fate");

                String input = scanner.nextLine();

                while (!input.equals("d"))
                {
                    System.out.println("\n> You have entered an incorrect command, please press 'd' to decide your fate");
                    scanner.nextLine();
                }

                if (input.equalsIgnoreCase("d"))
                {
                    int fate = rollDice(6);

                    switch (fate)
                    {
                        case 1:
                            System.out.println("\t Your fall was not as bad as you first thought, although painful you've " +
                                    "\n\t suffered no major injuries, as you dust yourself off you see a faint glow of fire" +
                                    "\n\t and as the night is freezing you see this as an opportunity not to " +
                                    "\n\t be missed and so head towards the glow." +
                                    "\n\t Lose 5 Health." +
                                    "\n\t Lose 10 Thirst." +
                                    "\n\t Lose 10 Hunger.");
                            character.setHealth(character.getHealth() - 5);
                            character.setThirst(character.getThirst() - 10);
                            character.setHunger(character.getHunger() - 10);
                            updateCharacterStats();
                            System.out.println("\n Move to ACT I AN INVITING CAVE");
                            act1_AnInvitingCave();
                            break;
                        case 2:
                            System.out.println("\t As you land you quickly realise that your not on firm ground, suddenly " +
                                    "\n\t there's a loud cracking and a crash as you continue falling into a " +
                                    "\n\t dark underground musty passageway, your fall although initially broken " +
                                    "\n\t still hurt and you may have cracked a rib or three!" +
                                    "\n\t Lose 30 Health." +
                                    "\n\t Lose 10 Thirst." +
                                    "\n\t Lose 20 Hunger.");
                            character.setHealth(character.getHealth() - 30);
                            character.setThirst(character.getThirst() - 10);
                            character.setHunger(character.getHunger() - 20);
                            updateCharacterStats();
                            System.out.println("\n Move to ACT I DARKNESS BITES");
                            act2.startDarknessBites();
                            break;
                        case 3:
                            System.out.println("\t What at first was a small craggy outcrop turned into a large cliff like hill, " +
                                    "\n\t you try your best to slow your fall as you grab onto anything you fly past, " +
                                    "\n\t but to no avail, you eventually find yourself at the bottom a broken and " +
                                    "\n\t twisted man, as you lie there bruised and bleeding you hear the wolves of the forest " +
                                    "\n\t howling as they smell your blood, you slowly slip into unconsciousness and are" +
                                    "\n\t devoured by the wolves.");
                            System.out.println("\n YOU ARE DEAD! GAME OVER");
                            System.exit(0);
                        case 4:
                            System.out.println("\t While you managed to control your fall you did however lose your knapsack on the descent " +
                                    "\n\t this unfortunately had all your food and drink stored in it, and while you may be fine" +
                                    "\n\t just now you will undoubtedly start getting hungry and thirsty soon!" +
                                    "\n\t Lose 10 Thirst." +
                                    "\n\t Lose 10 Hunger.");
                            character.setHealth(character.getHealth());
                            character.setThirst(character.getThirst() - 10);
                            character.setHunger(character.getHunger() - 10);
                            updateCharacterStats();
                            System.out.println("\n Move to ACT I IT'S THIRSTY WORK");
                            act3.startItsThirstyWork();
                            break;
                        case 5:
                            System.out.println("\t The fall over the small crag wasn't all that far, you have however unfortunately found " +
                                    "\n\t found yourself landing in a river, as your carried away by the fast moving water in the darkness " +
                                    "\n\t you find yourself fighting against the currents, you eventually make your way to the relative safety of what " +
                                    "\n\t would appear to be a small island that the river forks around, you lie on the banks battered, bruised and exhausted " +
                                    "\n\t from being tossed around like a rag doll against the rocks, your supplies are soaked as are you, and the night " +
                                    "\n\t is freezing." +
                                    "\n\t Lose 30 Health." +
                                    "\n\t Lose 10 Thirst." +
                                    "\n\t Lose 20 Hunger.");
                            character.setHealth(character.getHealth() - 30);
                            character.setThirst(character.getThirst() - 10);
                            character.setHunger(character.getHunger() - 20);
                            updateCharacterStats();
                            System.out.println("\n Move to ACT I THE ISLAND");
                            act4.startTheIsland();
                            break;
                        case 6:
                            System.out.println("\t After a quick fall and a soft landing, you realize you are completely unscathed and wonder " +
                                    "\n\t why it is your landing was so soft, as you squint at the ground in the pale moonlight you feel amazed by luck" +
                                    "\n\t as you realize your fall was broken by a thick layer of some sort of sponge, with each step you take you can see " +
                                    "\n\t small puffs of ejecta coming from the sponge and wonder what this is, suddenly your start to feel very nauseous " +
                                    "\n\t and the shadows start to move as the night whispers grow louder, you have been poisoned and are hallucinating." +
                                    "\n\t Lose 25 Health." +
                                    "\n\t Lose 20 Thirst." +
                                    "\n\t Lose 10 Hunger.");
                            character.setHealth(character.getHealth() - 25);
                            character.setThirst(character.getThirst() - 20);
                            character.setHunger(character.getHunger() - 10);
                            updateCharacterStats();
                            System.out.println("\n Move to ACT I POISONED FOOTSTEPS");
                            act5.startPoisonedFootsteps();
                            break;
                    }

                }
            }

            break;
        }
    }

    public void act1_AnInvitingCave()
    {
        scanner.nextLine();
        System.out.println("******************  ACT I AN INVITING CAVE  ******************");
        scanner.nextLine();
        System.out.println("\t As you move closer you see that the glow was indeed from fire, more specifically two " +
                "\n\t fire lit torches hung upon a rock face at the entrance to a cave, there is still a long night " +
                "\n\t ahead and it grows colder and colder by the minute, if you stay outside you may very well freeze to death, but " +
                "\n\t god only knows what horrors may or may not lurk inside this cave, choose wisely!");
        System.out.println("\n> Press 'e' to grab a fire torch and enter the cave.");
        System.out.println("\n> Press 'g' to grab a fire torch and try and make a fire near the cave mouth but remain outside.");

        String input = scanner.nextLine();

        // Loop for entering cave or staying outside.

        while(!input.equals("e") && !input.equals("g"))
        {
            System.out.println("\n> You have entered an incorrect command, please enter 'e' or 'g'.");
            input = scanner.nextLine();
        }

            if(input.equals("e"))
            {
                System.out.println("\t You grab a fire torch and enter the cave, there is a terrible smell and as you reach further and further" +
                        "\n\t into the cave the smell grows stronger and more putrid, you eventually reach the back of the cave where it appears" +
                        "\n\t as if someone or something has set up an altar or shrine of sorts, there are rotting skulls and bones everywhere" +
                        "\n\t and the smell makes you gag, you see a coffin off to the right of the altar and here a noise coming form inside!");
                System.out.println("\n> Press 'o' to open the coffin.");
                System.out.println("\n> Press 'i' to investigate shrine.");

                String choice = scanner.nextLine();

                // Loop for choice on open coffin or investigate shrine.

                while(!choice.equals("o") && !choice.equals("i"))
                {
                    System.out.println("\n> You have entered an incorrect command, please enter 'o' or 'i'.");
                    choice = scanner.nextLine();
                }

                    if(choice.equals("o"))
                    {
                        System.out.println("\t You open the coffin with great trepidation, but to your surprise the coffin is empty " +
                                "\n\t save for a few rats, and a glowing axe.");
                        System.out.println("\n> Press 'c' to collect the axe.");
                        System.out.println("\n> Press 's' to shut the coffin lid without collecting the glowing axe.");

                        String decision = scanner.nextLine();

                        // Loop for decision on take axe or close coffin lid.

                        while(!decision.equals("c") && !decision.equals("s"))
                        {
                            System.out.println("\n> You have entered an incorrect command, please enter 'c' or 's'.");
                        }

                            if(decision.equals("c"))
                            {
                                System.out.println("\t Congratulations you have found the 'NECROMANCERS BLOODLETTER', with a weapon attack value of 120");
                                System.out.println("\n> Do you wish to set this as your new weapon?, y/n");

                                String setNewWeapon = scanner.nextLine();

                                while(!setNewWeapon.equals("y") && !setNewWeapon.equals("n"))
                                {
                                    System.out.println("\n> You have entered an incorrect command, please enter 'y' or 'n'.");
                                }

                                if(setNewWeapon.equals("y"))
                                {
                                    character.setWeapon("NECROMANCERS BLOODLETTER");
                                    character.setWeaponAttack(120);
                                    System.out.println("\t Your new weapon and attack values area as follows: ");
                                    System.out.println("\t Weapon = " + character.getWeapon());
                                    System.out.println("\t Weapon atatck value = " + character.getWeaponAttack());
                                }
                                else if(setNewWeapon.equals("n"))
                                {
                                    System.out.println("\t You have chosen not to use this weapon at this time and your weapon and attack are as follows: ");
                                    System.out.println("\t Weapon = " + character.getWeapon());
                                    System.out.println("\t Weapon attack value = " + character.getWeaponAttack());
                                }

                                character.setThirst(character.getThirst() - 10);
                                character.setHunger(character.getHunger() - 10);
                                updateCharacterStats();
                            }
                            else if(decision.equalsIgnoreCase("s"))
                            {
                                System.out.println("\t You close the coffin lid leaving the attractive yet suspicious looking axe exactly" +
                                        "\n\t where you found it and decide to leave this reeking cave of death heading back to the mouth of the cave and" +
                                        "\n\t while you may not be sleeping inside tonight you cannot afford to wander through the woods" +
                                        "\n\t in the dark and freezing conditions, although now back outside, the mouth of the cave and the small craggy " +
                                        "\n\t face offer some protection from the elements and reflect some of the fires heat, you curl up in" +
                                        "\n\t as tight a ball as you can to preserve heat as you have a very uncomfortable and cold nights sleep");
                                System.out.println("\n Lose 10 Health");
                                System.out.println("\n Lose 20 Thirst");
                                System.out.println("\n Lose 20 Hunger");
                                character.setHealth(character.getHealth() - 10);
                                character.setThirst(character.getThirst() - 20);
                                character.setHunger(character.getHunger() - 20);
                                updateCharacterStats();
                            }
                    }
                    else if(choice.equals("i"))
                    {
                        System.out.println("\t You choose to forget about the strange noises you hear from inside the coffin and " +
                                "\n\t instead focus on searching through all the bones, trinkets and peculiarities scattered in front of you" +
                                "\n\t on the candle lit alter, you eventually come across a strange amulet that quietly hums as if constantly" +
                                "\n\t vibrating.");
                        System.out.println("\n> Press 't' to take amulet.");
                        System.out.println("\n> Press 'l' to leave the amulet and the suspicious coffin and return back to the cave mouth.");

                        String whatNow = scanner.nextLine();

                        while(!whatNow.equals("t") && !whatNow.equals("l"))
                        {
                            System.out.println("\n> You have entered an incorrect command, please enter 't' or 't'.");
                            whatNow = scanner.nextLine();
                        }

                            if(whatNow.equals("t"))
                            {
                                System.out.println("\t Congratulations you have found the 'NECROMANCERS JEWEL'.");
                                System.out.println("\t Add 25 to your Magic.");
                                character.setMagic(character.getMagic() + 25);
                                character.setThirst(character.getThirst() - 10);
                                character.setHunger(character.getHunger() - 10);
                                updateCharacterStats();
                                System.out.println("\n\t After finding the jewel and with your now increased magical prowess you feel brave enough to" +
                                        "\n\t to spend the night in the cave.");

                                System.out.println("\n> Press 'd' to roll the dice to decide the nights events!");

                                String playerInput = scanner.nextLine();

                                while(!playerInput.equals("d"))
                                {
                                    System.out.println("\n> You have entered an incorrect command, please enter 'd' to decide the nights events.");
                                    playerInput = scanner.nextLine();
                                }
                                    if(playerInput.equals("d"))
                                    {
                                        int fate = rollDice(2);

                                        switch (fate)
                                        {
                                            case 1:
                                                System.out.println("\t You are well rested and were not troubled all night");
                                                character.setHealth(100);
                                                updateCharacterStats();
                                                break;
                                            case 2:
                                                System.out.println("\t You are woken by the creature that dwells in this cave, it has not spotted you yet" +
                                                        "\n\t your not sure if you should hide or have the upper hand in attacking first");
                                                System.out.println("\n> Press 'h' to hide from the creature");
                                                System.out.println("\n> Press 'a' to attack the creature");

                                                String decision = scanner.nextLine();

                                                while(!decision.equals("h") && !decision.equals("a"))
                                                {
                                                    System.out.println("\n> You have entered an incorrect command, please enter 'h' or 'a'.");
                                                    decision = scanner.nextLine();
                                                }

                                                    if(decision.equals("h"))
                                                    {
                                                        System.out.println("\t Your so-called newly found magical prowess was clearly nothing more than bravado" + "\n\t as you choose to hide from the creature, you watch as the creature rages, it is clearly furious" + "\n\t as it frantically searches its alter for something that is now obviously missing, you can only hope" + "\n\t this abomination does not find or even remotely sense you, or you fear it may be a terrible end");

                                                        System.out.println("\n> Press 'd' to roll the dice to decide if the creature finds you or not!");

                                                        String rollFate = scanner.nextLine();

                                                        while (!rollFate.equals("d"))
                                                        {
                                                            System.out.println("\n> You have entered an incorrect command, please enter 'd' to find out if the creature find you or not!");
                                                            rollFate = scanner.nextLine();
                                                        }

                                                        if (rollFate.equals("d"))
                                                        {

                                                            int result = rollDice(2);

                                                            switch (result)
                                                            {
                                                                case 1:
                                                                    System.out.println("\t The creature now realizing that its magical amulet is gone senses that it is not alone and begins searching" +
                                                                            "\n\t for you, it is now only a matter of time before your found, so you choose to strike first, you decide to give your" +
                                                                            "\n\t new magical amulet a try not knowing how or even if it will work, you place the amulet around your neck and..........");

                                                                    int amuletPower = rollDice(100);

                                                                    int playerMagic = character.getMagic();

                                                                    if (playerMagic > amuletPower)
                                                                    {
                                                                        System.out.println("\n\t Player Magic = " + character.getMagic());
                                                                        System.out.println("\n\t NECROMANCER'S JEWEL POWER = " + amuletPower);
                                                                        System.out.println("\n\t You wielded the amulet like a true warrior and were instantly made invisible allowing you to either walk out of" +
                                                                                "\n\t the cave unharmed or to murder the now defenseless creature in cold blood, with it standing no chance to defend itself");
                                                                        System.out.println("\n> Press 'e' to escape the cave");
                                                                        System.out.println("\n> Press 'm' to murder the creature");

                                                                        String decide = scanner.nextLine();

                                                                        while (!decide.equals("e") && !decide.equals("m"))
                                                                        {
                                                                            System.out.println("\n> You have entered an incorrect command, please enter 'e' or 'm'.");
                                                                            decide = scanner.nextLine();
                                                                        }

                                                                        if (decide.equals("e"))
                                                                        {
                                                                            System.out.println("\t You quietly escape the cave unharmed and with the amulet, it is nearly morning now and the sun is coming" +
                                                                                    "\n\t up so you decide to keep moving as far away from the cave as possible");
                                                                            System.out.println("\n Lose 10 Thirst");
                                                                            System.out.println("\n Lose 10 Hunger");
                                                                            character.setThirst(character.getThirst() - 10);
                                                                            character.setHunger(character.getHunger() - 10);
                                                                            updateCharacterStats();
                                                                            break;
                                                                        }
                                                                        else if (decide.equals("m"))
                                                                        {
                                                                            System.out.println("\t You decide that you shall rid the world of this foul being, and with that slice its head off with your " +
                                                                                    "\n\t " + character.getWeapon() + " as the creature dies it drops something from its hand.");
                                                                            System.out.println("\n You have found the 'SACRIFICIAL HOOK', with a weapon attack value of 90");
                                                                            System.out.println("\n> Do you wish to set this as your new weapon?, y/n");

                                                                            String setNewWeapon = scanner.nextLine();

                                                                            while (!setNewWeapon.equals("y") && !setNewWeapon.equals("n"))
                                                                            {
                                                                                System.out.println("\n> You have entered an incorrect command, please enter 'y' or 'n'.");
                                                                                setNewWeapon = scanner.nextLine();
                                                                            }

                                                                            if (setNewWeapon.equals("y"))
                                                                            {
                                                                                character.setWeapon("SACRIFICIAL HOOK");
                                                                                character.setWeaponAttack(90);
                                                                                System.out.println("\t Your new weapon and attack values area as follows: ");
                                                                                System.out.println("\t Weapon = " + character.getWeapon());
                                                                                System.out.println("\t Weapon attack value = " + character.getWeaponAttack());
                                                                                break;
                                                                            }
                                                                            else if (setNewWeapon.equals("n"))
                                                                            {
                                                                                System.out.println("\t You have chosen not to use this weapon at this time and your weapon and attack are as follows: ");
                                                                                System.out.println("\t Weapon = " + character.getWeapon());
                                                                                System.out.println("\t Weapon attack value = " + character.getWeaponAttack());
                                                                                break;
                                                                            }
                                                                        }

                                                                        break;
                                                                    }
                                                                    else if (playerMagic < amuletPower)
                                                                    {
                                                                        System.out.println("\n\t Player Magic = " + character.getMagic());
                                                                        System.out.println("\n\t NECROMANCER'S JEWEL POWER = " + amuletPower);
                                                                        System.out.println("\n\t You realize very quickly that you do not possess enough magical skill power to wield such a jewel" +
                                                                                "\n\t and because of this fail miserably, the creature now not only sees you but realizes it was you that" +
                                                                                "\n\t stole its amulet, the creature attacks you with a furious rage unlike anything of this world tearing you limb from limb " +
                                                                                "\n\t YOU ARE DEAD, GAME OVER.");
                                                                        System.exit(0);
                                                                    }

                                                                    break; // Case 1 break point.

                                                                case 2:
                                                                    System.out.println("\t The creature tires itself out with all its blind rage and furious searching for its missing jewel and luckily for you falls" +
                                                                            "\n\t asleep in the corner next to all the rotting flesh, it seems rather content amongst the dead, this allows you ample time to quietly" +
                                                                            "\n\t escape, as you creep out of the cave mouth not daring to look back as you begin to run into the forrest.");

                                                                    break;  // Case 2 break point.
                                                            }
                                                        }
                                                    }
                                                    else if(decision.equals("a"))
                                                    {
                                                        System.out.println("\t You are feeling brave and think that in attacking first you will gain the upper hand, you are sadly mistaken,  the creature" +
                                                                "\n\t attacks you with such furious rage tearing you limb from limb, YOU ARE DEAD, GAME OVER.");
                                                        System.exit(0);
                                                    }

                                                break;
                                            }
                                    }
                            else if(whatNow.equals("l"))
                            {
                                System.out.println("\t You decide that some things are best left alone especially those things from inside" +
                                        "\n\t a rotting flesh cave, you quickly make your back to the mouth of the cave and decide that" +
                                        "\n\t while you may not be sleeping inside tonight you cannot afford to wander through the woods" +
                                        "\n\t in the dark and freezing conditions, although now back outside, the mouth of the cave and the small craggy " +
                                        "\n\t face offer some protection from the elements and reflect some of the fires heat, you curl up in" +
                                        "\n\t as tight a ball as you can to preserve heat as you have a very uncomfortable and cold nights sleep");
                                System.out.println("\n Lose 10 Health");
                                System.out.println("\n Lose 15 Thirst");
                                System.out.println("\n Lose 15 Hunger");
                                character.setHealth(character.getHealth() - 10);
                                character.setThirst(character.getThirst() - 15);
                                character.setHunger(character.getHunger() - 15);
                                updateCharacterStats();
                            }
                        }
                    }
                }
                else if(input.equalsIgnoreCase("g"))
                {
                    System.out.println("\n You grab a fire torch and fear your chances for survival are greatly increased by choosing to" +
                                "\n\t remain away from a cave that reeks of death, you huddle up close to the cave mouth and craggy face" +
                                "\n\t trying to conserve as much heat as possible from the fires heat reflected off of the crags face, you" +
                                "\n\t try to sleep but the cold wind and constant fear of whatever lives in this cave returning keep you awake" +
                                "\n\t most of the night, by sunrise you feel terrible, freezing cold and tired and pull yourself from the" +
                                "\n\t ground and set off into the forrest to try and gather some wood to build a fire");
                }
    }

    public int rollDice(int sides)
    {
        Random diceRoller = new Random();
        int roll = diceRoller.nextInt(sides) + 1;
        System.out.println("\n\t You rolled " + roll);
        return roll;
    }

    public void updateCharacterStats()
    {
        System.out.println("\n\t Your new stats are as follow: ");
        System.out.println("\t Health: " + character.getHealth());
        System.out.println("\t Thirst: " + character.getThirst());
        System.out.println("\t Hunger: " + character.getHunger());
        System.out.println("\t Intellect: " + character.getIntellect());
        System.out.println("\t Strength: " + character.getStrength());
        System.out.println("\t Magic: " + character.getMagic());
    }
}
