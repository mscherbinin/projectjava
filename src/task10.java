import java.util.Scanner;

//Произведите ввод данных с клавиатуры в матрицу, а после этого
//произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.


public class task10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] table= new int[3][4];
        int i, t, k, p = 1;
        for(i=0; i<3; i++){
            for(t=0; t<4; t++){
                System.out.print("Введите значение "+ p++ + " : ");
                table[i][t] = sc.nextInt();
            }
        }
        for(k=0; k<4; k++){
            System.out.println(table[0][k]*3);
        }
    }
}