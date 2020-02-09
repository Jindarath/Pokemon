import java.io.*;
import java.util.Scanner;

public  class PokemonGame {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int select ;
        Pokemon pokemon = new Pokemon();

        System.out.println("Plese Enter Number For Pokemon Do");
        System.out.println("1 For Kill Monter");
       
        System.out.println("0 For End");

        do {
            System.out.print("Enter number : ");
            select = Sc.nextInt();

            if(select == 1){
                System.out.println("Your level is "+pokemon.killMonter());
                
            }
            

        }while (select != 0);
    }
}