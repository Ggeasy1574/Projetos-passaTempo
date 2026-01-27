import ProjetoCalculator.InputLogic.InputLogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;

        while(running){
            Scanner sc = new Scanner(System.in);
            System.out.println("Select one of the options below" +
                    "\n 1- simple calculation" +
                    "\n 0 - exit");
            byte option = sc.nextByte();
            if(option == 1){
                new InputLogic();
            }
            else{
                System.out.println("See you later 0w0");
                running = false;
            }
        }
    }
}
