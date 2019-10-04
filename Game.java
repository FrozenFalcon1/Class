package com.company;
import java.util.Scanner;
import java.util.*;
import  java.math.*;

import static java.lang.System.*;


public class Game {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] names = {"Tracy", "Trixie", "Arnav", "Lana", "Riley", "Kendra", "Lucy", "Luna", "Alora", "Abela", "Lilly", "Brandy", "Mia", "Maria"};
        String[] randomevents = new String[3];
        String[] friendrandom = new String[3];


        String event1 = "You're approached by a shady old man he says he will give you 50$ if you go give his bag to one of his friends. (Money+50, Risk of being caught)\n";
        String event2 = "A stranger offers you some drugs. (Happiness +20)\n";
        String event3 = "";

        String fevent1 = "The boys come over and you have a chill night with them";
        String fevent2 = "Your friend gets stood up. Do you help him or not?";
        String fevent3 = "";

        randomevents[0] = event1;
        randomevents[1] = event2;
        randomevents[2] = event3;

        friendrandom[0] = fevent1;
        friendrandom[1] = fevent2;
        friendrandom[2] = fevent3;

        String girlfriend;
        String answer;
        String name;
        int athome = 0;
        int age = 5;
        int health = 100;
        int hunger = 100;
        int happiness = 100;
        int money = 0;
        int food;
        int intelligence = (int) (Math.random() * 50);
        String game;

        out.print("What would you like your characters name to be? ");
        name = keyboard.nextLine();
        out.println(name + " is born to a poor family who cant provide much for you, as soon as you were old enough they sent you to public school.\n");
        while (health > 0 && hunger > 0 && happiness > 0){
            while (age < 12) {
                out.print("What would you like to do? \n 1. Skip to next year (intelligence+5,age+1)\n 2. View stats \n 3. Extra actions\n ");
                game = keyboard.next();

                while (!(game.equals("1"))) {
                    if (game.equals("2")) {
                        out.println("Health: " + health + "\n" + "Happiness: " + happiness + "\n" + "Hunger: " + hunger + "\n"
                                + "Intelligence: " + intelligence + "\nAge: " + age + "\nMoney: " + money + "\n");
                        out.print("What would you like to do? \n 1. Skip to next year (intelligence+5,age+1)\n 2. View stats \n 3. Extra Actions\n ");
                        game = keyboard.next();
                    } else if (game.equals("3")) {
                        out.println("You're too young to do anything right now \n");
                        out.print("Please try again");
                        game = keyboard.next();
                    } else if (game.equals("Arnav")) {
                        out.println("Pick a girlfriend");
                        String name1 = names[(int) (Math.random() * names.length)];
                        String name2 = names[(int) (Math.random() * names.length)];
                        String name3 = names[(int) (Math.random() * names.length)];
                        out.print("1." + name1 + "\n2." + name2 + "\n3." + name3 + "\n");
                        answer = keyboard.next();
                        if (name1.equals("Arnav") && name2.equals("Arnav") && name3.equals("Arnav")) {
                            out.print("You won the game");
                            return;
                        } else if (answer.equals("1") && name1.equals("Arnav") || answer.equals("2") && name2.equals("Arnav") || answer.equals("3") && name3.equals("Arnav")) {
                            out.print("You won the game");
                            return;
                        }
                    } else {
                        out.println("Error please try again");
                        game = keyboard.next();
                    }
                }
                age++;
                intelligence = intelligence + 5;
            }
            out.print("What would you like to do? \n 1. Skip to next year (intelligence+5,age+1)\n 2. View stats \n 3. Actions\n ");
            game = keyboard.next();
            while (!(game.equals("1"))) {

                if (game.equals("2")) {
                    out.println("Health: " + health + "\n" + "Happiness: " + happiness + "\n" + "Hunger: " + hunger + "\n"
                            + "Intelligence: " + intelligence + "\nAge: " + age + "\nMoney: " + money + "\n");
                    out.print("What would you like to do? \n 1. Skip to next year (intelligence+5,age+1)\n 2. View stats \n 3. Actions\n ");
                    game = keyboard.next();

                } else if (game.equals("3")) {
                    out.println("1.Random event\n2.Do drugs\n3.Fuck a prostitute\n4.Get a girlfriend\n5.Go out with your friends\n6.Ask your parents for money\n0.Exit");
                    answer = keyboard.next();
                    if (answer.equals("1")) {
                        out.print(randomevents[(int) (Math.random() * randomevents.length)]);
                        out.print("What would you like to do? \n 1. Skip to next year (intelligence+5,age+1)\n 2. View stats \n 3. Actions\n ");
                        game = keyboard.next();
                    } else if (answer.equals("2")) {
                        out.println("You started doing drugs (Health-20,Happiness+10)");
                        health = health - 20;
                        happiness = happiness + 10;
                        out.print("What would you like to do? \n 1. Skip to next year (intelligence+5,age+1)\n 2. View stats \n 3. Actions\n ");
                        game = keyboard.next();
                    } else if (answer.equals("3") && money > 50) {
                        happiness = happiness + ((int) (Math.random() * 20));
                        money = money - 50;
                        out.print("What would you like to do? \n 1. Skip to next year (intelligence+5,age+1)\n 2. View stats \n 3. Actions\n ");
                        game = keyboard.next();
                    } else if (answer.equals("4")) {
                        out.println("Pick a girlfriend");
                        String name1 = names[(int) (Math.random() * names.length)];
                        String name2 = names[(int) (Math.random() * names.length)];
                        String name3 = names[(int) (Math.random() * names.length)];
                        out.print("1." + name1 + "\n2." + name2 + "\n3." + name3 + "\n");
                        String gf = keyboard.next();
                        if (name1.equals("Arnav") && name2.equals("Arnav") && name3.equals("Arnav")) {
                            out.print("You won the game");
                            return;
                        } else if (gf.equals("1") && name1.equals("Arnav") || gf.equals("2") && name2.equals("Arnav") || gf.equals("3") && name3.equals("Arnav")) {
                            out.print("You won the game");
                            return;
                        } else if (gf.equals("1")) {
                            out.println("Your girlfriend is " + name1 + "\n");
                            girlfriend = name1;
                        } else if (gf.equals("2")) {
                            out.println("Your girlfriend is " + name2 + "\n");
                            girlfriend = name2;
                        } else if (gf.equals("3")) {
                            out.println("Your girlfriend is " + name3 + "\n");
                            girlfriend = name3;
                        }
                        out.print("What would you like to do? \n 1. Skip to next year (intelligence+5,age+1)\n 2. View stats \n 3. Actions\n ");
                        game = keyboard.next();
                    }
                    else if (answer.equals("5")) {

                    }
                    else if (answer.equals("0")) {
                        game = "1";
                    }
                    else if (answer.equals("6")){
                        int happens =  (int)(Math.random()*10);
                        if(happens>3) {
                            int moneyadded = (int) (20 + Math.random() * 20);
                            money = money + moneyadded;
                            out.println("You got " + moneyadded + "$");
                        }
                        else {
                            out.println("Your parents didn't give you any money");
                        }
                    }
                }
            }
        }
    }
}


