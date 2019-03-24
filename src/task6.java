import java.util.Scanner;
import static java.lang.Math.abs;

class task6 {
    public static void main (String[] args){
        System.out.println("Введите 3 числа ");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double a = (x+z+y)/3.0;
        System.out.println("Среднее арифметическое чисел x z y = "+a);
        if((int) abs(a/2)>3)
            System.out.println("Программа выполнена корректно");
    }

}