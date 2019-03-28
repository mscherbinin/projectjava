

//Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
//Вывести на экран строку с наибольшей длинной.


import java.util.Scanner;

public class task13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку ");
        String one = sc.nextLine();
        System.out.println("Введите вторую строку ");
        String two = sc.nextLine();
        int length = one.length();
        int length2 = two.length();
        if(length>length2)
            System.out.println(one);
        if (length<length2)
                System.out.println(two);
    }
}