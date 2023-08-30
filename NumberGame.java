
package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        NumberGame ng = new NumberGame();
        
        
        do{
            al.add(new NumberGame().game());
            System.out.println("do you want to play another round:( yes=1 and no=0 )");
        }while(ng.scan.nextInt()!=0);
        ng.rounds(al);
    }
    void rounds(ArrayList al) {
        int i=1;
        for(Object x:al){
            System.out.println(i++ +"\t"+x);
        }
    }
    int game() {
        int comp=computer();
        int attempt=0;
        int user;
        do {
            user=guess();
            if (user>comp){
                System.out.println("too high");
                attempt++;
            }
            else if (user<comp){
                System.out.println("too low");
                attempt++;
            }
        } while (user!=comp && attempt!=10);
        if(attempt<=10 && user==comp){
            System.out.println("u guess correct at");
            return attempt;
        }
        System.out.println("maximum attempts lost the game for this round");
        return 0;
    }
    int guess() {
        System.out.println(" Guess a number: ");
        return scan.nextInt();
    }
    int computer() {
        return rand.nextInt(100);
    }
}
