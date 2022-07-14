package com.company;
import java.util.Random;
import java.util.Scanner;
public class rpsgame {
    public static void main(String[] args) {
        Random rand = new Random();
        int pc = rand.nextInt(3);
        //System.out.println("computer choise = " + pc);
        String pcchar ;

        if (pc == 0 )
        {
            pcchar = "rock";
        }
        else if (pc == 1)
        {
            pcchar = "paper";
        }
        else
        {
            pcchar = "scissor";
        }

        //System.out.println("computer choise = " + pcchar);
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------let's play ----------");
        System.out.println("enter your choise (choises = rock , paper, scissor)");
        String user = sc.next();


        if(pcchar.equals("rock") && user.equals("paper"))
        {
            System.out.println("you win");
        }
        else if(pcchar.equals("paper") && user.equals("rock")) {
            System.out.println("you loss");
        }
        else if(pcchar.equals("rock") && user.equals("scissor"))
            System.out.println("you loss");

        else if(pcchar.equals("scissor") && user.equals("rock"))
        {
            System.out.println("you win");
        }
        else if(pcchar.equals("paper") && user.equals("scissor"))
        {
            System.out.println("you win");
        }
        else if (pcchar.equals("scissor") && user.equals("paper"))
        {
            System.out.println("you loss");
        }
        else
        {
            System.out.println("draw play again!!" );
        }
        System.out.println("computer choise = " + pcchar);
    }


}