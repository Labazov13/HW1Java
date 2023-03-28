import java.util.Scanner;

public class Exam3 {
    public static void Calculator(){
        int firstNumber, secondNumber;
        String operation;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = sc.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        operation = sc.next();
        System.out.print("Введите второе число: ");
        secondNumber = sc.nextInt();
        sc.close();

        if(operation.equals("+")){
            System.out.println(firstNumber + secondNumber);
        }
        if(operation.equals("-")){
            System.out.println(firstNumber - secondNumber);
        }
        if(operation.equals("*")){
            System.out.println(firstNumber * secondNumber);
        }
        if(operation.equals("/")){
            System.out.println(firstNumber / secondNumber);
        }
        
    }

    public static void main(String[] args) {
        Calculator();
    }
}
