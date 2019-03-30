

//Необходимо написать программу для сортировки данных массива по возрастанию.
//        Использовать пузырьковый метод сортировки.


import java.util.Arrays;

public class task15 {
    public static void main(String[] args){
        int[] mass = {25, 2, 5, 12, 11, 100, 3};
        for(int i = mass.length-1; i>0; i--){
            for(int j = 0; j<i; j++){
                if(mass[j]>mass[j+1]){
                    int tmp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}