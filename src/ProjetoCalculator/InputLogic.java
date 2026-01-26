package ProjetoCalculator;

import java.util.Scanner;

public class InputLogic {
    //Basis functions
    private static double sum(String  number1,String  number2){
        return Double.parseDouble(number1) + Double.parseDouble(number2);
    }
    private static double difference(String  number1,String  number2){
        return Double.parseDouble(number1) - Double.parseDouble(number2);
    }
    private static double multiply(String  number1,String  number2){
        return Double.parseDouble(number1) * Double.parseDouble(number2);
    }
    private static double division(String  number1,String  number2){
        return Double.parseDouble(number1) / Double.parseDouble(number2);
    }

    public InputLogic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the numbers that will be calculated");
        String number1 = sc.nextLine();
        String number2 = sc.nextLine();
        System.out.println("""
                Choose e of the options below\
                
                 1- Add\
                
                 2- diff\
                 
                 3- multiply\
                 
                 4- division              
                """);
        byte option = sc.nextByte();
        switch (option){
            case 1 :
                System.out.println(sum(number1, number2));
                break;
            case 2 :
                System.out.println(difference(number1, number2));
                break;
            case 3:
                System.out.println(multiply(number1, number2));
                break;
            case 4 :
                if(number2.equals("0")) {
                    System.out.println("Divisão por 0");
                } else {
                    System.out.println(division(number1, number2));
                }
                break;
            default:
                throw new IllegalStateException("invalid option: " + option);
        }
    }
}
