package ProjetoCalculator.InputLogic;

import java.util.Scanner;

public class InputLogic {
    public double result = 0;

    public InputLogic(){
        Scanner sc = new Scanner(System.in);
        boolean working = true;
        while(working){
            System.out.println("""
                    Choose e of the options below\
                    
                     1- Add\
                    
                     2- diff\
                     
                     3- multiply\
                     
                     4- division\
                     
                     0 - result          
                    """);
            byte option = sc.nextByte();
            System.out.println("Diga o número: ");
            double number1 = sc.nextDouble();
            switch (option) {
                case 1 :
                    sum(number1);
                    break;
                case 2 :
                    difference(number1);
                    break;
                case 3 :
                    multiply(number1);
                    break;
                case 4 :
                    if (number1 == 0) {
                        System.out.println("Divisão por 0");
                    } else {
                        division(number1);
                    }
                    break;
                case 0 :
                    System.out.println(result);
                    working = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    //Basis functions
    private void sum(double number1){
        result += number1;
    }
    private void difference(double  number1){
        this.result -= number1;
    }
    private void multiply(double number1){
        if(result == 0){
            result = 1;
        }
        this.result *= number1 ;
    }
    private void division(double  number1){
        this.result /= number1;
    }


}
