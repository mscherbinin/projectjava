
//Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.

import java.util.Scanner;


public class task9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sample = new int[10];
        int i;
        int s = 1;
        for(i=0; i<10; i++){
            System.out.print("Введите значение " + s++ +" ");
                sample[i] = sc.nextInt();}
        for(i=0; i<10; i++)
            System.out.println(sample[i]*2);
    }
}