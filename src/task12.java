

//Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.


import java.util.Scanner;

public class task12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст ");
        String text = sc.nextLine();
//        char[] chArray = sc.nextLine().toCharArray();
//        for(int i = 0; i < chArray.length; i++){
//            if(chArray[i] == ' '){
//                chArray[i] = '';
//            }
//        }
        String eas = text.replace(" ", "");
        System.out.println(eas);

    }
}
