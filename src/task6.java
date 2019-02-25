import java.util.Scanner;

public class task6 {
    public static void main (String args[]){
        System.out.println("Введите 3 числа ");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = (x+z+y)/3;
        System.out.println("Среднее арифметическое чисел x z y = "+a);
        if(a/2 >3){
            System.out.println("Программа выполнена корректно");
        }
    }
}