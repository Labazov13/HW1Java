import java.util.Scanner;
public class Exam1{
    
    public static void FindTriangleNumber(int searchNumber){
        int result = 0;
        for(int i = 1; i <= searchNumber; i++){
            result += i; 
        }
        System.out.println(searchNumber + "-е треугольное число = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Какое треугольное число вы хотите найти: ");
        int search = sc.nextInt();
        FindTriangleNumber(search);
        sc.close();
    }
}