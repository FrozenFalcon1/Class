package com.company;
import java.util.Scanner;
import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        int percent;

        Scanner keyboard=new Scanner(System.in);
        String name;
        String sex;
        String a;
        double count=0;
        out.print("What is your name? ");
        name=keyboard.next();
        out.print(name+" what is your gender? ");
        sex=keyboard.next();
        //Male questions
        if(sex.equals("M")||sex.equals("m")||sex.equals("male")||sex.equals("Male")||sex.equals("MALE")) {
            count++;
            out.print("Did you see the clown that hides from gay people? ");
            a = keyboard.next();
            if (a.equals("N") || a.equals("n")||a.equals("no")||a.equals("No")) {count++;}
            out.print("Does gay boy adam chase you around? ");
            a = keyboard.next();
            if (a.equals("Y") || a.equals("y")||a.equals("yes")||a.equals("Yes")) {count++;}
            out.print("Would you let a guy suck your dick? ");
            a = keyboard.next();
            if (a.equals("N") || a.equals("n")||a.equals("no")||a.equals("No")) {count++;}
            out.print("Would you fuck a girl who used to be a guy? ");
            a = keyboard.next();
            if (a.equals("Y") || a.equals("y")||a.equals("yes")||a.equals("Yes")) {count++;}
            out.print("Would you fuck a guy who used to be a girl? ");
            a = keyboard.next();
            if (a.equals("N") || a.equals("n")||a.equals("no")||a.equals("No")) {count++;}
        }
        //Female questions
        else {
            if(sex.equals("F")||sex.equals("f")||sex.equals("Female")||sex.equals("female")||sex.equals("FEMALE")){
                count++;
                out.print("Did you see the clown that hides from gay people? ");
                a = keyboard.next();
                if (a.equals("Y") || a.equals("y")||a.equals("yes")||a.equals("Yes")) {count++;}
                out.print("Would you fuck your moms hot best friend? ");
                a = keyboard.next();
                if (a.equals("N") || a.equals("n")||a.equals("no")||a.equals("No")) {count++;}
                out.print("FQuestion 3");
                a = keyboard.next();
                if (a.equals("Y") || a.equals("y")||a.equals("yes")||a.equals("Yes")) {count++;}
                out.print("FQuestion 4");
                a = keyboard.next();
                if (a.equals("Y") || a.equals("y")||a.equals("yes")||a.equals("Yes")) {count++;}
                out.print("FQuestion 5");
                a = keyboard.next();
                if (a.equals("Y") || a.equals("y")||a.equals("yes")||a.equals("Yes")) {count++;}
            }
        }
/*
            if(count>=3){
                out.print(name+ " you're gay");
            }
            else{
                out.print(name+" you're not gay");
            }

 */
        if(count>=1) {
            percent = (int) (((count - 1) / 5.0) * 100);
            if (percent == 100){
                out.println("You're a faggot");
            }
            else {
                out.println(name + " you're " + percent + "% gay");
            }
        }
        else{
            out.println("You're kinda retarded");
        }
    }

}
