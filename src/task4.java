import java.util.Scanner;

//Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран
public class task4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Число в бинарном формате: ");
        String bin = sc.nextLine();
        int binNum = Integer.parseInt(bin, 2);
        System.out.println(binNum);
    }
}
